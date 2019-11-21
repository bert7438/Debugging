package ru.bert7438.debugging;

import android.widget.TextView;

public class Unit {
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    private String name = "Nill";
    private int health = 100;

    public Unit(String name, int health){
        this.name = name;
        this.health = health;
    }

    public void printInfo(TextView textPlace){
        textPlace.append("Меня зовут "+ getName() + " и я имею " + health + " hp. \n");
    }

    public void letsGO(TextView textPlace){
        textPlace.append(getName() + " начал бежать. \n");
    }
}
