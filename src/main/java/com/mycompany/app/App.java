package com.mycompany.app;

import javax.crypto.Cipher;
import java.lang.Exception;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    private void foo() throws Exception {
        bar("DES"); // this should create a warning
    }
    
    private void foo2() throws Exception {
        if ("A" == "B") {
            bar("DES"); // this should create a warning
        }
    }

    private void bar(String s) throws Exception
    {
        Cipher c = Cipher.getInstance(s);
    }
}
