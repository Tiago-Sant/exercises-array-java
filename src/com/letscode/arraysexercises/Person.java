package com.letscode.arraysexercises;

public class Person {
    private String name;
    private int age;
    private float height;
    private float weight ;
    public Person(String name, int age, float height, float weight ) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight ;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getImc() {
        return this.weight / (this.height * this.height);
    }
}
