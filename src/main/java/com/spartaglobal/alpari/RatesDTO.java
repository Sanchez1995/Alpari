package com.spartaglobal.alpari;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class RatesDTO {

    private JSONObject fullRatesFile;
    private JSONArray ratesList ;

    public RatesDTO(String filePath) {

        RatesFileReader ratesFile = new RatesFileReader(filePath);
        JSONParser parser = new JSONParser();
        try {
            Object ratesObj = parser.parse(ratesFile.getRateFile());
            fullRatesFile = (JSONObject) ratesObj;
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

        /*JSONParser parser2 = new JSONParser();
        try {
            Object ratesArray = parser2.parse(ratesFile.getRateFile());
            ratesList = (JSONArray) ratesArray;

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }*/
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

    public double getRatesValue(String rate) {
        //ratesList = (JSONArray) fullRatesFile.get("rates");//json array full of rates from rates.json


        //i have a JSONArray called ratesList, I want to get a double when i pass in the String that relates
        return (double) getRatesList().get(rate);//array called rates
    }

    public JSONObject getRatesList() {
        return (JSONObject) fullRatesFile.get("rates");
    }
}
