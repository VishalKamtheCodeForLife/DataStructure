package com.example.department;

import java.awt.im.spi.InputMethod;
import java.io.InputStream;

public class RomanNumber {
    public static void main(String[] args) {
        int inputNumber=777;
        String units[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hundrerds[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thousands[]={"","M","MM","MMM"};

        String romanNumber= thousands[inputNumber/1000]+ hundrerds[(inputNumber%1000)/100]+ tens[(inputNumber%100)/10]+units[(inputNumber%10)];
        System.out.println("For given number "+ inputNumber+" Roman number is " +romanNumber);
    }
}
