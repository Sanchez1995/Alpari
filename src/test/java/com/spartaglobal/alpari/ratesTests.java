package com.spartaglobal.alpari;


import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ratesTests {

    private static RatesDTO rates;
    private static JSONObject fullRatesFile;

    @BeforeClass
    public static void setup(){
        rates = new RatesDTO("resources/rates.json");
        fullRatesFile = new JSONObject();
    }
    @Test
    public void testSuccessResponse(){
        Assert.assertTrue(rates.getSuccessValue());
    }

    @Test
    public void testTimeStamp(){
        Assert.assertEquals(1539182646, rates.getTimeStamp());

    }

    @Test
    public void testBaseResponse(){
       Assert.assertEquals("EUR", rates.getBaseValue());
    }

    @Test
    public void testRateResponse(){

    }

}
