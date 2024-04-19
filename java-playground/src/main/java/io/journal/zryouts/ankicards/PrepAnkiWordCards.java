package io.journal.zryouts.ankicards;

import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;
import org.apache.commons.text.StringEscapeUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrepAnkiWordCards {
    final static String wordReferenceWeb = "https://www.wordreference.com/definition/";
    final static String inputFile = "data/input/WordList.html";
    final static String outputFile = "data/output/english_word_list.csv";

    public static void main(String[] args) throws IOException {

        Map<String, EnglishWord> wordMap = new LinkedHashMap<>(5000);

        Document doc = Jsoup.parse(readFileAsString(inputFile));
        doc.select("p").forEach(para -> {
            if (null != para) {
                String attr = para.attributes().get("class");
                if (attr.equals("noindent-w")) {
                    String word = para.select("span").get(0).ownText().trim().toLowerCase();
                    String pronunciation = word + ".ipa";
                    String audio = word + ".mp3";
                    String picture = word + ".png";
                    String partsOfSpeech = para.select("span").get(1).ownText().trim();
                    String meaning = Arrays.stream(para.ownText().split("\\.")).findFirst().orElse("").trim();
                    String wordReference = wordReferenceWeb + word.toLowerCase();

                    List<String> listOf = Arrays.stream(
                                    StringEscapeUtils
                                            .escapeHtml4(para.wholeText())
                                            .replaceAll("&nbsp;", "")
                                            .replace("\n", "")
                                            .replaceAll("\\s{1,}", " ")
                                            .trim().split("\\.")
                            ).map(String::trim)
                            .collect(Collectors.toList());

                    String example;
                    if (listOf.size() < 2) {
                        example = listOf.get(1);
                    } else {
                        example = listOf.stream().skip(2).collect(Collectors.joining("."));
                    }


                    EnglishWord englishWord = new EnglishWord(word, pronunciation, audio, partsOfSpeech, meaning, example, picture, wordReference);

                    if (wordMap.containsKey(word)) {
                        String secondAppearance = word + "(2)";
                        englishWord.setWord(secondAppearance);
                        wordMap.put(secondAppearance, englishWord);
                    } else {
                        wordMap.put(word, englishWord);
                    }
                }

            }
        });

        System.out.println("size of map: " + wordMap.size());
        // Write to csv file
        writeOutput(wordMap);

    }

    private static void writeOutput(Map<String, EnglishWord> wordMap) throws IOException {
        CSVWriter writer = (CSVWriter) new CSVWriterBuilder(new FileWriter(outputFile))
                .withSeparator('\t')
                .build();
        String[] columns = {"Word", "Pronunciation", "Audio", "Parts Of Speech", "Meaning", "Examples", "Picture", "Word Reference"};
        writer.writeNext(columns);
        // feed in your array (or convert your data to an array)
        wordMap.values().forEach(entry -> {
            String[] entries = {
                    entry.getWord(),
                    entry.getPronunciation(),
                    entry.getAudio(),
                    entry.getPartsOfSpeech(),
                    entry.getMeaning(),
                    entry.getExamples(),
                    entry.getPicture(),
                    entry.getWordReference()
            };
            writer.writeNext(entries);
        });

        writer.close();
    }

    public static String readFileAsString(String file) {
        Path filePath = Paths.get(file);
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(filePath.toUri()), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            System.out.println("File reading exception: " + e.getMessage());
        }
        return contentBuilder.toString();
    }

}
