package com.example.department;

import java.util.Locale;

public class LongestSubstring {
    public static void main(String[] args) {
        String input="aaabbbccc";
        //
        System.out.println("Length of unique Substring is "+longestUniqueSubsttr(input.toLowerCase()));
    }

    private static int longestUniqueSubsttr(String input) {
        int[] c=new int[26];
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>=97 && input.charAt(i)<=123) {
                c[input.charAt(i) - 'a']++;
            }
        }

        int longestPrefix=0;
        for(int loop=0;loop<26;loop++){
            if(c[loop]>0){
                longestPrefix++;
            }
        }
        return longestPrefix-1;
    }
}
