package ru.bert7438.debugging;

import android.widget.TextView;

public class NPC implements Running, Printable{
    private int id;
    private String state;


    public NPC(int id, String state) {
        this.id = id;
        this.state = state;
    }

    @Override
    public void printInfo(TextView textView) {
        textView.append("NPC номер " + id +" "+ state + " .\n");
    }

    @Override
    public void letsGO(TextView textView) {
        state = "передвигается";
        textView.append("NPC номер " + id + " " + state + " .\n");
    }
}
