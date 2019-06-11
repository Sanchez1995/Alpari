package com.spartaglobal.alpari;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class RatesFileReader {
    private FileReader rateFile;

    public RatesFileReader(String filePath) {
        try {
            rateFile = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public FileReader getRateFile() {
        return rateFile;
    }
}
