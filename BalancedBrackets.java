package com.example.department;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class BalancedBrackets {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String expr) {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
                = new ArrayDeque<Character>();
        Deque<Character> stacks=new ArrayDeque<>();
        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }


            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return "NO";
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return "NO";
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return "NO";
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty()?"YES":"NO");

    }

    public static void main(String[] args) throws IOException {
        System.out.println(BalancedBrackets.isBalanced("(())"));
    }

}
