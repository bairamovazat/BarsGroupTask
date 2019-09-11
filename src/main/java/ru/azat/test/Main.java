package ru.azat.test;

import java.math.BigInteger;


public class Main {
    public static void main(String[] args) {
       fibonacciTask();
       eratosthenesTask();
    }

    private static void fibonacciTask() {
        System.out.println(Fibonacci.getPreviousFibonacciNumber(BigInteger.valueOf(46368)));
    }

    private static void eratosthenesTask() {
        Eratosthenes eratosthenes = new Eratosthenes(1000000);
        eratosthenes.calculate();
        System.out.println(eratosthenes.getAllNumbers());
    }
}
