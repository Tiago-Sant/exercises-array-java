package com.letscode.arraysexercises;


import com.letscode.arraysexercises.utils.ScannerWord;

public class InvertedWord {
    public static void main(String[] args) {
//        final String word = ScannerWord.getWord();
        final String word = "Guilherme";
        char[] charWord = word.toCharArray();
        String invertedWord = "";

        for (int i = charWord.length - 1; i >= 0; i--) {
            invertedWord += charWord[i];
        }

        System.out.println(invertedWord);
    }


}
