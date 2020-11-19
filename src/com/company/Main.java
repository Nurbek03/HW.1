package com.company;

public class Main {

    public static void main(String[] args) {


        Dog dog = new Dog(3, "bluu", 34,"sit down!");
        System.out.println(dog.toString());
        dog.dogsRunning(9,"gafff");

        Alabai alabai = new Alabai(2, "red",23,"wake up!",Color.BLUU);
        System.out.println(alabai.toString());
        alabai.dogsRunning(5);

        Alabai alabai2 = new Alabai(3, "yellow",25,"ibybv" ,Color.RED);
        System.out.println(alabai2.toString());
        alabai2.dogsRunning(6,6.9);


    }
}
