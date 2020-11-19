package com.company;

public class Dog extends Animal {
    private String commands;

    public Dog(int age, String color, double height, String commands) {
        super(age, color, height, commands);
        this.commands=commands;
    }

    public String getCommands() {
        return commands;
    }

    public void dogsRunning(int distance){
        System.out.println("дог пробежал "+distance+" metres");
    }

    public void dogsRunning(int distance, String ground){
        System.out.println("Dog run "+ distance+" в "+ ground);
    }

    final public void dogsRunning(int distance, double time){
        System.out.println("Дог пробежала"+distance+ " за "+time+" времени");
    }
}

