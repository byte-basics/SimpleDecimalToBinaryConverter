package com.bytebasics;

public class App 
{
    public static void main( String[] args ) {
        if(args.length > 0) {
            DecimalConverter converter = new DecimalConverter();
            System.out.println(converter.convertDecToBin(args[0]));
        } else {
            System.out.println("You must provide a single argument that is a valid decimal number " +
                    "between 0 and 2147483647");
            System.exit(1);
        }
    }
}
