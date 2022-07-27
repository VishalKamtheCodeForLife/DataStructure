package com.example.department;

public class SumOfAllFactor {
        static int divSum(int n)
        {
            if(n == 1)
                return 1;
            int result = 0;
            for (int i = 2; i <= Math.sqrt(n); i++)
            {
                // if 'i' is divisor of 'n'
                if (n % i == 0)
                {
                    if (i == (n / i))
                        result += i;
                    else
                        result += (i + n / i);
                }
            }
           return (result + n + 1);
        }

        // Driver program to run the case
        public static void main(String[] args)
        {
            int n = 16;
            System.out.println(divSum(n));
        }
}