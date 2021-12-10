package com.letscode.arraysexercises;

import com.letscode.arraysexercises.utils.ScannerWord;

public class Cart {

    public static void main(String[] args) {
//        String[] fruits = ScannerWord.getFruits();
        String[] fruits = {"maça", "abacaxi", "banana", "uva", "pêssego"};

        final int sizeOfArray = 5;
        String[]  cart = new String[sizeOfArray];
        System.out.println("As frutas no carrinho são = ");
        for(int i = 0; i< sizeOfArray; i++) {
            cart[i] = fruits[i];
            System.out.println(cart[i]);
        }
    }
}
