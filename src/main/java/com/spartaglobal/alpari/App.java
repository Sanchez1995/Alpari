package com.spartaglobal.alpari;

import java.text.SimpleDateFormat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RatesDTO rates = new RatesDTO("resources/rates.json");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        Long dateTimeStamp = Long.parseLong(sdf.format(rates.getTimeStamp()));
        //ZonedDateTime dateTime = Instant.ofEpochMilli(rates.getTimeStamp()).atZone(ZoneId.of(\"Australia/Sydney\"));

        rates.printRate();
        System.out.println(rates.getSuccessValue());
        System.out.println(rates);
        System.out.println(rates.getBaseValue());
        System.out.println(rates.getTimeStamp());
        System.out.println(dateTimeStamp);

        System.out.println(rates.getRatesValue("AED"));
       //System.out.println(rates.getRatesValue("AED"));
    }
}
