package ru.bert7438.debugging;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView debugText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        debugText = (TextView) findViewById(R.id.debugText);

        Unit alexey = new Unit("Алексей Григорьевич", 200);
        alexey.printInfo(debugText);
        Robot Shwarzeneager = new Robot("Арнольд Шварцнеггер", 1000, 400);
        Shwarzeneager.printInfo(debugText);
        alexey.letsGO(debugText);
        Shwarzeneager.letsGO(debugText);
    }
}
