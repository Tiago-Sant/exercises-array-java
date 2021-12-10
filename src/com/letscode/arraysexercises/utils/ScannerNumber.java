package com.letscode.arraysexercises.utils;

import java.util.Scanner;

public class ScannerNumber {

    public static float getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        float number = sc.nextFloat();
        return number;
    }

    public static float[] getNumbers(){
        Scanner sc = new Scanner(System.in);
        float[] numbers = new float[5];
        for (int i = 1; i <= 5; i++) {
            System.out.print("Informe o " + i + "º número: ");
            numbers[i-1] = sc.nextFloat();
        }

        return numbers;
    }
}
