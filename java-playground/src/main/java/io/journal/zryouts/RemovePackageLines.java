package io.journal.zryouts;

import java.io.*;

public class RemovePackageLines {
    public static void main(String[] args) {
        String srcDirPath = "java-playground/src/main/java/io/journal/algocs/submission1"; // Source directory path
        String destDirPath = "java-playground/build/tmp"; // Destination directory path

        File srcDir = new File(srcDirPath);
        File destDir = new File(destDirPath);

        if (!destDir.exists()) {
            destDir.mkdirs(); // Create destination directory if it does not exist
        }

        File[] files = srcDir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java"); // Filter only ".java" files
            }
        });

        for (File file : files) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                BufferedWriter writer = new BufferedWriter(new FileWriter(new File(destDir, file.getName())));

                String line;
                while ((line = reader.readLine()) != null) {
                    if (!line.startsWith("package")) {
                        writer.write(line);
                        writer.newLine();
                    }
                }

                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Modified files have been copied to " + destDirPath);
    }
}
