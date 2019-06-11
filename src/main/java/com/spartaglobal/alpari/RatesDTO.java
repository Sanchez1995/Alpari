package com.spartaglobal.alpari;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class RatesDTO {

    private JSONObject fullRatesFile;
    //private JSONArray ratesList;

    public RatesDTO(String filePath) {

        RatesFileReader ratesFile = new RatesFileReader(filePath);
        //JSONArray ratesList = new JSONArray();
        JSONParser parser = new JSONParser();
        try {
            Object ratesObj = parser.parse(ratesFile.getRateFile());
            fullRatesFile = (JSONObject) ratesObj;

            /*ratesList = (JSONArray) ratesObj;*/
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }


    public void printRate() {
        System.out.println(fullRatesFile.toString());

    }

    public boolean getSuccessValue() {
        return (boolean) fullRatesFile.get("success");
    }

    public String getBaseValue(){
        return (String) fullRatesFile.get("base");
    }

    public long getTimeStamp(){
        return (long) fullRatesFile.get("timestamp");
    }

   /* public double getRatesValue(String rate) {
        return (double) fullRatesFile.get(ratesList);
    }*/
}
