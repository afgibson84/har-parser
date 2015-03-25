package com.afgibson84.har.parser;

import com.afgibson84.har.model.Har;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HarParser {
    public static Har parserHarFromFile(String filename) {
        if (filename == null)
            return new Har();

        return parserHarFromFile(new File(filename));
    }

    private static Har parserHarFromFile(File file) {
        if (file == null)
            return new Har();

        if (!file.exists())
            return new Har();

        try {
            Gson gson = new Gson();
            BufferedReader br = new BufferedReader(new FileReader(file));
            if (br != null){
                Har har = gson.fromJson(br, Har.class);
                return har;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return new Har();
    }
}
