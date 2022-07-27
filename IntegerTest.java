package com.example.department;

public class IntegerTest {
    public static void main(String[] args) {
        int input=123;
        System.out.println("Reverse Number :" +reverseNumber(input));
    }

    static int reverseNumber(int input){
        int reverseNumber=0,rem;
       /* while(input >0){
            if(input<10){
                reverseNumber=reverseNumber+input;
                break;
            }else if(input/10<=10){
                reverseNumber=reverseNumber+input%10*10;
                input=input/10;
            }else if (input/100<=10){
                reverseNumber=reverseNumber+input%10*100;
                input=input/10;
            }else if (input/1000<=10){
                reverseNumber=reverseNumber+input%10*1000;
                input=input/10;
            }
        }*/

        while(input > 0){
            rem=input%10;
            reverseNumber = rem + (reverseNumber*10);
            input = input/10;
        }
        return reverseNumber;
    }
}
