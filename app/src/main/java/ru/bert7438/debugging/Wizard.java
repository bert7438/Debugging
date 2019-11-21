package ru.bert7438.debugging;

import android.widget.TextView;

public class Wizard extends Unit {
    public int mana;

    public Wizard(String name, int health, int mana) {

        super(name, health);
        this.mana = mana;
    }

    @Override
    public void printInfo(TextView textPlace) {
        super.printInfo(textPlace);
        textPlace.append(getName() + "Имеет " + mana + " очков маны.\n");
    }

    @Override
    public void letsGO(TextView textPlace) {
        mana-=20;
        textPlace.append(getName() + " использует телепортацию. Осталось" + mana + "Очков маны. \n");
    }
}
