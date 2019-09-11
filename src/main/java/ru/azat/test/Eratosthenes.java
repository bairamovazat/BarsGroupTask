package ru.azat.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализует решето Эратосфена.
 * У меня получилось положить JVM на maxNumber = 10 000 000
 * При -Xmx1g на 700 000 000
 * Если увеличить heap space то можно
 */
public class Eratosthenes {

    //true - не простое, false - простое
    private final boolean[] numbers;
    private int maxNumber;
    public Eratosthenes(int maxNumber){
        this.maxNumber = maxNumber;
        this.numbers = new boolean[maxNumber + 1];
        //0 и 1 изначально убираем
        this.numbers[0] = true;
        this.numbers[1] = true;
    }

    public void calculate(){
        for (int i = 0; i < maxNumber; i++){
            if(!this.numbers[i]){
                deleteAllNumbersNotDivisible(i);
            }
        }
    }

    /**
     * Удаляем все числа которые деляться на 2p
     * @param dividend - число p
     */
    private void deleteAllNumbersNotDivisible(int dividend){
        for (int p = dividend + dividend; p < maxNumber; p = p + dividend){
            this.numbers[p] = true;
        }
    }

    public List<Integer> getAllNumbers(){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i <= maxNumber; i++){
            if(!this.numbers[i]){
                result.add(i);
            }
        }
        return result;
    }
}
