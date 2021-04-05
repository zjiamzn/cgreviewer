package com.mycompany.app;

import javax.crypto.Cipher;
import java.lang.Exception;

/**
 * Hello world!
 *
 */
public class App
{
    private static String AWS_SECRET_ACCESS_KEY = "gimme security issue!";
    private static String username = "Gimme security issue!";
    private static String password = "Gimme security issue!";
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.format("No %s",1);
        if ("1" == "2") {
            String str = "1" + 2;
        }
        try {
            SecureRandom sr = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            // do nothing
        }
    }

    private void foo() throws Exception {
        bar("DES"); // this should create a warning
    }

    private void bar(String s) throws Exception
    {
        Cipher c = Cipher.getInstance(s);
    }
}
