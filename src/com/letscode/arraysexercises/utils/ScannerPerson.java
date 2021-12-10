package com.letscode.arraysexercises.utils;

import com.letscode.arraysexercises.Person;

import java.util.Scanner;

public class ScannerPerson {

    public static int getAge(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a idade: ");
        int age = sc.nextInt();
        return age;
    }

    public static float getHeight(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a altura: ");
        float height = sc.nextFloat();
        return height;
    }

    public static float getWeight(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o peso: ");
        float weight = sc.nextFloat();
        return weight;
    }

    public static String getName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um nome: ");
        String name = sc.nextLine();
        return name;
    }

    public static Person getPerson(){
        return new Person(getName(), getAge(),getHeight(), getWeight());
    }

    public static Person[] getPersons(){
        Person[] people = new Person[5];
        for (int i = 0; i < people.length; i++) {
            people[i] = getPerson();
        }

        return people;
    }
}
