package org.example;

import java.util.logging.Logger;

import static org.example.Fibonacci.*;

public class Test {

    private static final Logger LOGGER = Logger.getLogger(Test.class.getName());

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        LOGGER.info("Start Time = %d%n".formatted(startTime));


        long resultRecursive = fibonacciRecursive(6);
        LOGGER.info("FibonacciRecursive = %d%n".formatted(resultRecursive));

     /*   long resultDP = fibonacciDP(6);
        LOGGER.info("FibonacciDP = %d%n".formatted(resultDP));*/

        /*long resultIterate = fibonacciIterate(6);
        LOGGER.info("FibonacciIterate = %d%n".formatted(resultIterate));*/

        long endTime = System.currentTimeMillis();
        LOGGER.info("Finish Time = %d%n".formatted(endTime));
        LOGGER.info("Result Time = %d%n".formatted(endTime - startTime));
    }
}