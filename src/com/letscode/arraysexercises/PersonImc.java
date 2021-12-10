package com.letscode.arraysexercises;

import com.letscode.arraysexercises.utils.People;
import com.letscode.arraysexercises.utils.ScannerPerson;

public class PersonImc {
    public static void main(String[] args) {

//        Person[] people = ScannerPerson.getPersons();
        Person[] people = People.getPeople();
        float minimumWeight = 18.5f;
        int maximumWeight  = 25;

        for(int i = 0; i< people.length; i++) {
            if(people[i].getImc() < minimumWeight) {
                System.out.println(people[i].getName() + " está abaixo do peso ideal. Seu imc deu: " + people[i].getImc());
            }
            if(people[i].getImc() > maximumWeight) {
                System.out.println(people[i].getName() + " está acima do peso ideal. Seu imc deu: " + people[i].getImc());
            }
        }
    }
}
