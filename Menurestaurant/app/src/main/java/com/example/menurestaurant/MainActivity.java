package com.example.menurestaurant;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends Activity {

    CheckBox Pizza, hamburger, boisson;
    Button MultiData;
    Integer piz, ham, boi;
    Integer Total;
    private TextView Resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pizza = (CheckBox) findViewById(R.id.checkBox1);
        hamburger = (CheckBox) findViewById(R.id.checkBox2);
        boisson = (CheckBox) findViewById(R.id.checkBox3);
        MultiData = (Button) findViewById(R.id.button1);
        Resultat=findViewById(R.id.resultat);


        MultiData.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (Pizza.isChecked()) {
                    piz = 1;
                    Total = piz;
                }
                if (hamburger.isChecked()) {
                    ham = 2;
                    Total = ham;
                }
                if (boisson.isChecked()) {
                    boi = 4;
                    Total = boi;
                }
                if (Pizza.isChecked() && hamburger.isChecked()) {
                    Total = 3;
                }
                if (Pizza.isChecked() && boisson.isChecked()) {
                    Total = 5;
                }
                if (boisson.isChecked() && hamburger.isChecked()) {
                    Total = 6;
                }
                if (boisson.isChecked() && Pizza.isChecked() && hamburger.isChecked()) {
                    Total = 7;
                }
                switch (Total) {
                    case 1:
                        Resultat.setText(String.valueOf("9000 DT"));
                        break;
                    case 2:
                        Resultat.setText(String.valueOf("5000 DT"));
                        break;
                    case 4:
                        Resultat.setText(String.valueOf("2000 DT"));
                        break;
                    case 3:
                        Resultat.setText(String.valueOf("14000 DT"));
                        break;
                    case 5:
                        Resultat.setText(String.valueOf("11000 DT"));
                        break;
                    case 6:
                        Resultat.setText(String.valueOf("7000 DT"));
                        break;
                    case 7:
                        Resultat.setText(String.valueOf("16000 DT"));
                        break;
                }

            }
        });
    }
}