package ru.azat.test;

import java.math.BigInteger;

public class Fibonacci {

    private BigInteger startNumber;

    private BigInteger[] lastNumbers = {BigInteger.ZERO, BigInteger.ONE};

    /**
     * @param startNumber - 1 or 0
     */
    public Fibonacci(int startNumber){
        if(startNumber == 1){
            calculateNextNumber();
        }else if(startNumber != 0){
            throw new IllegalArgumentException("Начальное число должно быть равно 1 или 0");
        }
    }

    public BigInteger getLastNumber(){
        return lastNumbers[1];
    }

    public void calculateNextNumber(){
        BigInteger nextNumber = lastNumbers[0].add(lastNumbers[1]);
        lastNumbers[0] = lastNumbers[1];
        lastNumbers[1] = nextNumber;
    }

    public static BigInteger getPreviousFibonacciNumber(BigInteger than){
        Fibonacci fibonacci = new Fibonacci(1);
        while (fibonacci.getLastNumber().compareTo(than) <= 0){
            fibonacci.calculateNextNumber();
        }
        return fibonacci.getLastNumber();
    }

}
