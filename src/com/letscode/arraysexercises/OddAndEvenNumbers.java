package com.letscode.arraysexercises;

import com.letscode.arraysexercises.utils.ScannerNumber;
import com.letscode.arraysexercises.utils.ScannerWord;

public class OddAndEvenNumbers {
    public static void main(String[] args) {
//        float[] numbers = ScannerNumber.getNumbers();
        int[] numbers = {22, 35, 1, 10, 129};
        int[] oddNumbers = new int[5];
        System.out.println("Os números ímpares são: ");
        for(int i = 0; i< numbers.length; i++) {
            if(numbers[i] % 2 == 1) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println("Os números pares são: ");
        for(int i = 0; i< numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
