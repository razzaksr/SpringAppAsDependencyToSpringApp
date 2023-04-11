package org.example;

import org.example.serv.Servicing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Servicing servicing=new Servicing();
        System.out.println(servicing.listAll());
    }
}
