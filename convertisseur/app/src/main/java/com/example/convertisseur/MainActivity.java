package com.example.convertisseur;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText editText;
    private RadioButton dinarsToEuro ,euroToDinar;
    private Button convert;
    private TextView resultatafficher;
    private  String monnaie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        dinarsToEuro=findViewById(R.id.dinarsToEuro);
        euroToDinar=findViewById(R.id.euroToDinar);
        convert=findViewById(R.id.convert);
        resultatafficher=findViewById(R.id.resultat);



        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monnaie = editText.getText().toString();
                if (monnaie.equals(" ")){

                    showAlert("Vous Devez saisir un valeur");

                }else {


                    if (dinarsToEuro.isChecked()) {

                        double totalmonnaie = Double.valueOf(monnaie);
                        double resultat = totalmonnaie / 3.16;
                        resultatafficher.setText(String.valueOf(resultat));

                    } else {


                        double totalmonnaieeuro = Double.valueOf(monnaie);
                        double resultateuro = totalmonnaieeuro * 3.16;
                        resultatafficher.setText(String.valueOf(resultateuro));

                    }

                }
            }

        });



    }
    public void showAlert(String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Champ Manquant")
                .setMessage(message)
                .setNeutralButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }


}
