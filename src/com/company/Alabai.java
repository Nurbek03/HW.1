package com.company;

public class Alabai extends Dog {
    private Color cvet;

    public Color getCvet() {
        return cvet;
    }

    public Alabai(int age, String color, double height, String commands, Color cvet) {
        super(age, color, height, commands);
        this.cvet = cvet;

    }

    @Override
    public void dogsRunning(int distance) {

        System.out.println("Alabai "+distance);



    }
}
