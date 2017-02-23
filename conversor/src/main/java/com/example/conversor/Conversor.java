package com.example.conversor;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.TextView;
import android.widget.Toast;

public class Conversor extends AppCompatActivity {

    EditText pesos,dollars;
    Button bConv;
    Double cop,usd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);
        //TextView texto = new TextView(this);
        //texto.setText("Hola mundo...");
        //setContentView(texto);

        pesos = (EditText)findViewById(R.id.pesos);
        dollars = (EditText)findViewById(R.id.dollars);
        bConv = (Button)findViewById(R.id.bConv);

        bConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pesos.getText().toString().equals("")&& !dollars.getText().toString().equals("")){
                    usd = Double.parseDouble(dollars.getText().toString());
                    cop = usd*2851.98;
                    cop = Math.rint(cop*100000)/100000;
                    pesos.setText(cop.toString());
                }
                else if(!pesos.getText().toString().equals("")&& dollars.getText().toString().equals("")){
                    cop = Double.parseDouble(pesos.getText().toString());
                    usd = cop/2851.98;
                    usd = Math.rint(usd*100000)/100000;
                    dollars.setText(usd.toString());
                }
                else if(!pesos.getText().toString().equals("")&& !dollars.getText().toString().equals("")){
                    Context context = getApplicationContext();
                    CharSequence text = "Por favor ingrese un solo valor, limpiando...";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    dollars.setText("");
                    pesos.setText("");
                }
                else if(pesos.getText().toString().equals("")&& dollars.getText().toString().equals("")){
                    Context context = getApplicationContext();
                    CharSequence text = "Digite una cantidad por favor...";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        });


    }
}
