package com.alacriti;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StringManipulation sm=new StringManipulation();
        sm.concat("hello", "asha");
        sm.startWith("hello asha");
        sm.startWith("asha");
    }
}
