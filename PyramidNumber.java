package com.example.department;

public class PyramidNumber {
  static void printSpace(int space)
    {
        // base case
        if (space == 0)
            return;
        System.out.print(" ");
        printSpace(space - 1);
    }

    static void printStar(int asterisk)
    {
        if (asterisk == 0)
            return;
        System.out.print("* ");
        printStar(asterisk - 1);
    }

    // function to print the pattern
    static void pattern(int n, int num)
    {
        // base case
        if (n == 0)
            return;
        printSpace(n - 1);
        printStar(num - n + 1);
        System.out.println("");

        // recursively calling pattern()
        pattern(n - 1, num);
    }

    public static void main(String[] args)
    {
        int n = 4;
        pattern(n, n);
    }
}
