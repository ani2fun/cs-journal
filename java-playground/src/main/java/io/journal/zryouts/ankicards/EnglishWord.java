package io.journal.zryouts.ankicards;

import com.opencsv.bean.CsvBindByName;

public class EnglishWord {

    @CsvBindByName(column = "Word")
    private String word;

    @CsvBindByName(column = "Pronunciation")
    private String pronunciation;

    @CsvBindByName(column = "Audio")
    private String audio;

    @CsvBindByName(column = "Parts Of Speech")
    private String partsOfSpeech;

    @CsvBindByName(column = "Meaning")
    private String meaning;

    @CsvBindByName(column = "Examples")
    private String examples;

    @CsvBindByName(column = "Picture")
    private String picture;

    @CsvBindByName(column = "Word Reference")
    private String wordReference;


    public EnglishWord(String word, String pronunciation, String audio, String partsOfSpeech, String meaning, String examples, String picture, String wordReference) {
        this.word = word;
        this.pronunciation = pronunciation;
        this.audio = audio;
        this.partsOfSpeech = partsOfSpeech;
        this.meaning = meaning;
        this.examples = examples;
        this.picture = picture;
        this.wordReference = wordReference;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getPartsOfSpeech() {
        return partsOfSpeech;
    }

    public void setPartsOfSpeech(String partsOfSpeech) {
        this.partsOfSpeech = partsOfSpeech;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getExamples() {
        return examples;
    }

    public void setExamples(String examples) {
        this.examples = examples;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getWordReference() {
        return wordReference;
    }

    public void setWordReference(String wordReference) {
        this.wordReference = wordReference;
    }
}
