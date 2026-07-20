package com.mycompany.app;
import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         System.out.println(colorize("Hello World", TEXT_COLOR(0, 255, 0)));
        System.out.println( "Hello World!" );
    }
}
