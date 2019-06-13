package com.spartaglobal.alpari;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RatesDTO rates = new RatesDTO("resources/rates.json");

        rates.printRate();
        System.out.println(rates.getSuccessValue());
        System.out.println(rates.getBaseValue());
        System.out.println(rates.getTimeStampValue());
        System.out.println(rates.getRatesValue("AED"));
    }
}
