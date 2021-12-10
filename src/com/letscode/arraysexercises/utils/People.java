package com.letscode.arraysexercises.utils;

import com.letscode.arraysexercises.Person;

import java.util.Scanner;

public class People {

    public static Person[] getPeople(){
        Person diego = new Person("Diego", 18, 1.70f, 50);
        Person diogo = new Person("Diogo Neri", 18, 1.70f, 50);
        Person guilherme = new Person("Guilherme Vicente", 45, 1.55f, 60);
        Person giovanni = new Person("Giovanni", 45, 1.55f, 60);
        Person fulano = new Person("Fulano", 18, 1.70f, 80);

        Person[] people = {diego, diogo, guilherme, giovanni, fulano};
        return people;
    }

}
