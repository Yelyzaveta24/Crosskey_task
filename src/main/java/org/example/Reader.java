package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Reader {
    Reader(){}
    public List<String> readDataFromTxt(String path){
        try {
            List<String> allLines = Files.readAllLines(Paths.get(path));
            return allLines;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
