package org.example;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static long fibonacciRecursive(int numberInputFromRecursive) {
        if (numberInputFromRecursive <= 1) {
            return numberInputFromRecursive;
        }
        return fibonacciRecursive(numberInputFromRecursive - 1)
                + fibonacciRecursive(numberInputFromRecursive - 2);
    }

    private static final Map<Integer, Long> memo = new HashMap<>();
    public static long fibonacciDP(int numberInputFromDP) {
        if (numberInputFromDP <= 1) {
            return numberInputFromDP;
        }
        if (memo.containsKey(numberInputFromDP)) {
            return memo.get(numberInputFromDP);
        }
        long fib = fibonacciDP(numberInputFromDP - 1)
                + fibonacciDP(numberInputFromDP - 2);
        memo.put(numberInputFromDP, fib);
        return fib;
    }

    public static long fibonacciIterate(int numberInputFromIterate) {
        if (numberInputFromIterate <= 1) {
            return numberInputFromIterate;
        }
        int n = numberInputFromIterate;
        long a;
        long b = 1;
        long c = 0;
        long i = 0;
        while (i < n){
            a = b;
            b = c;
            c = a + b;
            i++;
        }
        return c;
    }
}