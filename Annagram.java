package com.example.department;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Annagram{
    public static void main(String[] args) {
        List<String> list= Arrays.asList("code", "doce", "ecod", "framer", "frame");
        List<String> nonAnagramList= new ArrayList<>();
        for (int i=0; i<list.size();i++){
             String word  = list.get(i);
             for(int j=i+1; j<list.size();j++){
                String nextWord= list.get(j);
                 if(!isAnagram(word,nextWord) && j == list.size()){
                     nonAnagramList.add(nextWord);
                 }
             }
        }
        nonAnagramList.forEach(x ->System.out.println(x));
        //list.stream().filter()
    }

    private static boolean isAnagram(String word, String nextWord) {
        if (word.length()==nextWord.length()){
            char[] ArrayS1 = word.toLowerCase().toCharArray();
            char[] ArrayS2 = nextWord.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            return Arrays.equals(ArrayS1, ArrayS2);
        }
        return false;
    }
}
