package io.journal.zryouts;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class VideoConverter {
    public static void main(String[] args) {
        // Path to the input video file
        String inputFilePath = "/Users/aniket/Downloads/CS/UDEMY Courses/1.0.Learn JAVA Programming - Beginner to Master 2021-8/01 Introduction/001 Instructor's Note.mp4";

        // Path to the output video file
        String outputFilePath = "/Users/aniket/Downloads/tryout/1.0.Learn JAVA Programming - Beginner to Master 2021-8/01 Introduction/001 Instructor's Note.mp4";

        // Create the output directory if it doesn't exist
        File outputDir = new File(outputFilePath).getParentFile();
        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }

        // Create the output file if it doesn't exist
        File outputFile = new File(outputFilePath);
        if (!outputFile.exists()) {
            try {
                outputFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Command to execute
        String command = String.format("ffmpeg -i %s -vf scale=1280:720 -c:a copy %s", inputFilePath, outputFilePath);

        try {
            // Create process builder
            ProcessBuilder builder = new ProcessBuilder(command.split(" "));
            builder.redirectErrorStream(true);

            // Start the process
            Process process = builder.start();

            // Read output from the process
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for the process to complete
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Video conversion completed successfully.");
            } else {
                System.out.println("Video conversion failed.");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

