package com.bytebasics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class DecimalConverterTest
{
    private DecimalConverter decConverter = new DecimalConverter();

    @Test
    public void testConvertDecimal2ToBin10() {
        String decimalTwo = "2";
        String binaryTwo = "10";
        assertEquals(binaryTwo, decConverter.convertDecToBin(decimalTwo) );
    }

    @Test
    public void testConvertDecimal3ToBin11() {
        String decimalThree = "3";
        String binaryThree = "11";
        assertEquals(binaryThree, decConverter.convertDecToBin(decimalThree) );
    }

    @Test
    public void testConvertDecimal352ToBin() {
        String decimal352 = "352";
        String binary352 = "101100000";
        assertEquals(binary352, decConverter.convertDecToBin(decimal352) );
    }

    @Test
    public void testConvertDecToBinAtLowerBound() {
        String decimal0 = "0";
        String binary0 = "0";
        assertEquals(binary0, decConverter.convertDecToBin(decimal0) );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertDecToBinBelowLowerBound() {
        String decimalNegative1 = "-1";
        decConverter.convertDecToBin(decimalNegative1);
    }

    @Test
    public void testConvertDecToBinAtUpperBound() {
        String decimalUpperBound = "2147483647";
        String binary0 = "1111111111111111111111111111111";
        assertEquals(binary0, decConverter.convertDecToBin(decimalUpperBound) );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertDecToBinAboveUpperBound() {
        String decimalUpperBoundPLus1 = "2147483648";
        decConverter.convertDecToBin(decimalUpperBoundPLus1);
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertDecToBinWithNonNumberArgument() {
        String nonNumberArgument = "Sds34wewe";
        decConverter.convertDecToBin(nonNumberArgument);
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertDecToBinWithEmptyArgument() {
        String emptyArgument = "";
        decConverter.convertDecToBin(emptyArgument);
    }

}
