package com.example.department;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args)
    {
        // creating a string array
        String[] str = new String[5];
        str[2] = "Vishal Kamthe";
        Optional<String> opt=Optional.of(str[2]);
        System.out.println(opt.map(c->c.toUpperCase()).get());
    }
}
