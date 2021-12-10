package com.letscode.arraysexercises.utils;

import java.util.Scanner;

public class ScannerWord {

    public static String getWord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");
        String word = sc.nextLine();
        return word;
    }

    public static String getName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um nome: ");
        String name = sc.nextLine();
        return name;
    }

    public static String[] getNames(){
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 1; i <= 5; i++) {
            System.out.print("Informe o " + i + "º nome: ");
            names[i-1] = sc.nextLine();
        }

        return names;
    }

    public static String getFruit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");
        String word = sc.nextLine();
        return word;
    }

    public static String[] getFruits(){
        Scanner sc = new Scanner(System.in);
        String[] fruits = new String[5];
        for (int i = 1; i <= 5; i++) {
            System.out.print("Informe a " + i + "ª fruta: ");
            fruits[i-1] = sc.nextLine();
        }

        return fruits;
    }
}
