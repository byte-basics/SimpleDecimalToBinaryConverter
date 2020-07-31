package com.bytebasics;

public class DecimalConverter {
    public String convertDecToBin(String decimalVal) {
        int number = Integer.parseInt(decimalVal);
        checkIsGreaterThan0(number);
        if(number == 0) {
            return "0";
        } else {
            return convertDecToBin(number);
        }
    }

    private void checkIsGreaterThan0(int value) {
        if(value < 0) {
            throw new IllegalArgumentException("The argument provided must be greater than or equal to 0");
        }
    }

    private String convertDecToBin(int decNumToConvert) {
        StringBuilder binResultBuilder = new StringBuilder();
        while (decNumToConvert > 0) {
            if(decNumToConvert % 2 == 0){
                binResultBuilder.append("0");
            } else {
                binResultBuilder.append("1");
            }
            decNumToConvert = decNumToConvert / 2;
        }
        return binResultBuilder.reverse().toString();
    }

}
