package com.spartaglobal.alpari;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ratesTests {

    private static RatesDTO rates;

    @BeforeClass
    public static void setup(){
        rates = new RatesDTO("resources/rates.json");
    }
    @Test
    public void testSuccessResponse(){
        Assert.assertTrue(rates.getSuccessValue());
    }

    @Test
    public void testTimeStamp(){
        //Assert.assertTrue();
    }

    @Test
    public void testBaseRates(){

    }

    @Test
    public void testDate(){

    }

}
