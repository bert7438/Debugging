package ru.bert7438.debugging;

import android.widget.TextView;

public class Robot extends Unit{
    private int energy;

    public Robot(String name, int health, int energy) {
        super(name, health);
        this.energy = energy;
    }

    @Override
    public void printInfo(TextView textPlace) {
        super.printInfo(textPlace);
        textPlace.append(this.getName() + " имеет " + energy + " энергии. \n");
    }

    @Override
    public void letsGO(TextView textPlace) {
        super.letsGO(textPlace);
        energy--;
        textPlace.append("Энергия "+ getName() + " уменьшилась до " + energy);
    }
}
