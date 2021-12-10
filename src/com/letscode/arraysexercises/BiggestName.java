package com.letscode.arraysexercises;

import com.letscode.arraysexercises.utils.ScannerWord;

public class BiggestName {

    public static void main(String[] args) {
//        String[] guests = ScannerWord.getNames();
        String[] guests = {"Giovanni da Silva", "Diego Sauro", "Guilherme da Silva", "Diogo Sauro", "Fulano Junior"};
        String biggestName = "";

        for(int i = 0; i< guests.length; i++) {

            if(biggestName.length() < guests[i].length()) {
                biggestName = guests[i];
            }
        }
        System.out.println("O maior nome é: " + biggestName);
    }
}
