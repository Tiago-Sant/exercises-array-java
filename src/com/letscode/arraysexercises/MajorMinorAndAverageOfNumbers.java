package com.letscode.arraysexercises;

import com.letscode.arraysexercises.utils.ScannerNumber;

public class MajorMinorAndAverageOfNumbers {
    public static void main(String[] args) {
//        float[] numbers = ScannerNumber.getNumbers();
        int[] numbers = {22, 35, 1, 10, 129};
        float majorNumber = 0f;
        float minorNumber = numbers[0];
        float averageOfNumbers = 0f;
        int totalNumbers = numbers.length;


        for(int i = 0; i< numbers.length; i++) {
            if(numbers[i] > majorNumber) {
                majorNumber = numbers[i];
            }
            if(numbers[i] < minorNumber) {
                minorNumber = numbers[i];
            }
            averageOfNumbers += numbers[i];
            if(i + 1 == totalNumbers) {
                averageOfNumbers = averageOfNumbers / totalNumbers;
            }
        }

        System.out.println("O maior número é: " + majorNumber);
        System.out.println("O menor número é: " + minorNumber);
        System.out.println("A média dos números é: " + averageOfNumbers);
    }
}
