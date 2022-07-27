package com.example.department;

import java.util.Locale;

public class PanagramTest {
    public static void main(String[] args) {
        String input="";
        System.out.println(checkPanagram(input.toLowerCase()));
    }

    private static boolean checkPanagram(String input) {
        int[] c=new int[26];
        for(int count=0;count<input.length();count++){
        if( input.charAt(count)>=97 && input.charAt(count)<=123){
            c[input.charAt(count)-'a']++;
        }
        }

        for(int loop=0;loop<26;loop++) {
            if (c[loop] == 0) {
                return false;
            }
        }
        return true;
    }
}