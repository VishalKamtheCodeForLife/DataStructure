package com.example.department;

public class StringCompression {
    public static void main(String[] args) {
        String input="abbcccddddeeeee";
        StringBuilder output=new StringBuilder();
        int n=input.length(),count=1;
        for (int i=1;i<(n-1);i++){
            if(input.charAt(i)==input.charAt(i-1)){
                count++;
            }else{
                output.append(input.charAt(i-1));
                output.append(count);
                count=1;
            }
        }
        if(input.length()>1){
            if(input.charAt(n-2)==input.charAt(n-1)){
                count++;
            }else {
                output.append(input.charAt(n - 2));
                output.append(count);
                count = 1;
            }
            output.append(input.charAt(n-1));
            output.append(count);
        }

        System.out.println("Input String : "+input);
        System.out.println("Compressed String : "+output.toString());
    }
}
