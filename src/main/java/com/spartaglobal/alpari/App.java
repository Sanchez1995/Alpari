package com.spartaglobal.alpari;

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
    }
}
