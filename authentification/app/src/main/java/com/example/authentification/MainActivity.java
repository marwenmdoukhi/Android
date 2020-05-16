package com.example.authentification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText1.getText().toString().equals("admin")&& (editText2.getText().toString().equals("admin"))){
                    Toast.makeText(MainActivity.this,"Connction ok ",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this,"login ou password incorrect",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
