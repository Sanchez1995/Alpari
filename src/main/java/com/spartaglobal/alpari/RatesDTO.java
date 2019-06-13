package com.spartaglobal.alpari;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class RatesDTO {

    private JSONObject fullRatesFile;

    public RatesDTO(String filePath) {
        RatesFileReader ratesFile = new RatesFileReader(filePath);
        JSONParser parser = new JSONParser();
        try {
            Object ratesObj = parser.parse(ratesFile.getRateFile());
            fullRatesFile = (JSONObject) ratesObj;
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

    public String getBaseValue() {
        return (String) fullRatesFile.get("base");
    }

    public JSONObject getRatesList() {
        return (JSONObject) fullRatesFile.get("rates");
    }

    public double getRatesValue(String rate) {
        return (double) getRatesList().get(rate);//array called rates
    }

    public long getTimeStamp() {
        return (long) fullRatesFile.get("timestamp");
    }

    public String getTimeStampValue() {
        Date date = new Date(getTimeStamp() * 1000l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sdf.format(date);
    }

    public Set getRatesKey(){
        return getRatesList().keySet();
    }

    public Set getRatesValueSet(){
        return getRatesList().entrySet();
    }
}
