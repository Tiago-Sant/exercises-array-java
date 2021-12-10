package com.letscode.arraysexercises;

import com.letscode.arraysexercises.utils.ScannerWord;

import java.util.Locale;

public class OddUpperCaseChars {
    public static void main(String[] args) {
//        String name = ScannerWord.getName();
        String name = "Diogo";
        char[] nameCharArray= name.toCharArray();
        String oddChars = "";
        int factor = 1;
        System.out.println("Os caracteres ímpares são: ");
        for(int i = 0; i< name.length(); i++) {
            if(factor % 2 == 1) {
               oddChars += nameCharArray[i];
            }
            factor++;
        }

        System.out.println(oddChars.toUpperCase());
    }
    }

