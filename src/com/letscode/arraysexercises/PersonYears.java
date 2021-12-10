package com.letscode.arraysexercises;

import com.letscode.arraysexercises.utils.People;
import com.letscode.arraysexercises.utils.ScannerPerson;

import java.util.Scanner;

public class PersonYears {
    public static void main(String[] args) {
//        Person[] people = ScannerPerson.getPersons();
        Person[] people = People.getPeople();
        int newestAge = 150;
        int olderAge = 0;
        int averageAge = 0;
        String olderPerson = "";
        String newestPerson = "";

        for(int i = 0; i< people.length; i++) {
            if(newestAge > people[i].getAge()) {
                newestAge = people[i].getAge();
                newestPerson = people[i].getName();
            }
            if(olderAge < people[i].getAge()) {
                olderAge = people[i].getAge();
                olderPerson = people[i].getName();
            }

            averageAge += people[i].getAge();

            if(i + 1 == people.length) {
                averageAge = averageAge / people.length;
            }
        }

        System.out.println("O mais velho é o " + olderPerson);
        System.out.println("O mais novo é o " + newestPerson);
        System.out.println("A média de idade é " + averageAge);
    }
}
