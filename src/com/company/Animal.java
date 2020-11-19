package com.company;

public class Animal {
    private int age;
    private String color;
    private double height;

    public Animal(int age, String color, double height, String commands) {
        this.age = age;
        this.color = color;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }


    public int getAge() {
        return age;
    }


    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }
}
