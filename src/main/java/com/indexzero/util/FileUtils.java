package com.indexzero.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {
    public static String readFromFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        List<String> allLines = Files.readAllLines(path);
        String result = "";

        for(int i = 0; i < allLines.size(); i++){
            result += allLines.get(i);
        }

        return result;
    }
}
