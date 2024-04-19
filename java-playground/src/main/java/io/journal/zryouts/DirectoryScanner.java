package io.journal.zryouts;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DirectoryScanner {
    public static void main(String[] args) {
        String directoryPath = "/Users/aniket/Downloads/CS/UDEMY Courses/1.0.Learn JAVA Programming - Beginner to Master 2021-8";
        scanDirectory(directoryPath);
    }

    private static void scanDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.isDirectory()) {
            System.out.println("Invalid directory path!");
            return;
        }

        scanDirectoryRecursive(directory);
    }

    final static String tryout = "/Users/aniket/Downloads/tryout/";

    public static boolean checkFileExtension(String filePath) {
        String regexPattern = ".*\\.(pdf|srt|mp4|html|m3u|xspf|txt)$";
        boolean matches = filePath.matches(regexPattern);

        return matches;
    }

    public static void createDirectory(String directoryPath) {
        String newPath = tryout + directoryPath;
        File directory = new File(newPath);

        boolean endsWith = checkFileExtension(newPath);

        if (directory.exists() && !endsWith) {
            System.out.println("Directory already exists.");
        } else if (!endsWith) {
            boolean created = directory.mkdir();
            if (created) {
                System.out.println("Directory created: " + directory.getAbsolutePath());
            } else {
                System.out.println("Failed to create directory.");
            }
        }
    }

    private static void scanDirectoryRecursive(File directory) {
        List<File> files = Arrays.stream(Objects.requireNonNull(directory.listFiles())).sorted().toList();

        files.forEach(file -> createDirectory(file.getName()));


        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".mp4")) {
                String filePath = file.getAbsolutePath();
                String encodedPath = urlEncode(filePath);
                System.out.println(encodedPath);
            } else if (file.isDirectory()) {
                scanDirectoryRecursive(file);
            }
        }
    }

    private static String urlEncode(String path) {
        try {
            return URLEncoder.encode(path, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return path; // Return the original path if encoding fails
        }
    }
}
