package com.example.notas;

import android.graphics.Color;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Notas extends AppCompatActivity {
    EditText n1,n2,n3,n4,n5;
    TextView nfinal;
    Button calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        n1 = (EditText)findViewById(R.id.e1);
        n2 = (EditText)findViewById(R.id.e2);
        n3 = (EditText)findViewById(R.id.e3);
        n4 = (EditText)findViewById(R.id.e4);
        n5 = (EditText)findViewById(R.id.e5);
        nfinal = (TextView)findViewById(R.id.tF);
        calcular = (Button)findViewById(R.id.bF);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1.getText().toString().equals("") || n1.getText().toString().equals(".")){
                    Toast.makeText(getApplicationContext(),"Por favor llene todas las casillas correctamente",Toast.LENGTH_SHORT).show();
                    n1.setText("");
                }
                else if(n2.getText().toString().equals("") || n2.getText().toString().equals(".")){
                    Toast.makeText(getApplicationContext(),"Por favor llene todas las casillas correctamente",Toast.LENGTH_SHORT).show();
                    n2.setText("");
                }
                else if(n3.getText().toString().equals("") || n3.getText().toString().equals(".")){
                    Toast.makeText(getApplicationContext(),"Por favor llene todas las casillas correctamente",Toast.LENGTH_SHORT).show();
                    n3.setText("");
                }
                else if(n4.getText().toString().equals("") || n4.getText().toString().equals(".")){
                    Toast.makeText(getApplicationContext(),"Por favor llene todas las casillas correctamente",Toast.LENGTH_SHORT).show();
                    n4.setText("");
                }
                else if(n5.getText().toString().equals("") || n5.getText().toString().equals(".")){
                    Toast.makeText(getApplicationContext(),"Por favor llene todas las casillas correctamente",Toast.LENGTH_SHORT).show();
                    n5.setText("");
                }
                else if(Double.parseDouble(n1.getText().toString())>5.0){
                    Toast.makeText(getApplicationContext(),"Los valores de notas deben estar entre 0 y 5",Toast.LENGTH_SHORT).show();
                    n1.setText("");
                }
                else if(Double.parseDouble(n2.getText().toString())>5.0){
                    Toast.makeText(getApplicationContext(),"Los valores de notas deben estar entre 0 y 5",Toast.LENGTH_SHORT).show();
                    n2.setText("");
                }
                else if(Double.parseDouble(n3.getText().toString())>5.0){
                    Toast.makeText(getApplicationContext(),"Los valores de notas deben estar entre 0 y 5",Toast.LENGTH_SHORT).show();
                    n3.setText("");
                }
                else if(Double.parseDouble(n4.getText().toString())>5.0){
                    Toast.makeText(getApplicationContext(),"Los valores de notas deben estar entre 0 y 5",Toast.LENGTH_SHORT).show();
                    n4.setText("");
                }
                else if(Double.parseDouble(n5.getText().toString())>5.0){
                    Toast.makeText(getApplicationContext(),"Los valores de notas deben estar entre 0 y 5",Toast.LENGTH_SHORT).show();
                    n5.setText("");
                }
                else {
                    Double d1,d2,d3,d4,d5,nota;
                    d1 = Double.parseDouble(n1.getText().toString());
                    d2 = Double.parseDouble(n2.getText().toString());
                    d3 = Double.parseDouble(n3.getText().toString());
                    d4 = Double.parseDouble(n4.getText().toString());
                    d5 = Double.parseDouble(n5.getText().toString());
                    nota = 0.6*d1+0.05*d2+0.07*d3+0.08*d4+0.2*d5;
                    nota = Math.rint(nota*10)/10;
                    nfinal.setText(nota.toString());
                    if(nota<=1.0){
                        Toast.makeText(getApplicationContext(),"Estás en el lugar equivocado",Toast.LENGTH_LONG).show();
                        nfinal.setTextColor(Color.MAGENTA);
                    }
                    else if(nota<=2.0){
                        Toast.makeText(getApplicationContext(),"Remal",Toast.LENGTH_LONG).show();
                        nfinal.setTextColor(Color.RED);
                    }
                    else if(nota<=3.0){
                        Toast.makeText(getApplicationContext(),"Es posible recuperarse",Toast.LENGTH_LONG).show();
                        nfinal.setTextColor(Color.rgb(0xff,0xa5,0x00));
                    }
                    else if(nota<=4.0){
                        Toast.makeText(getApplicationContext(),"Normalito",Toast.LENGTH_LONG).show();
                        nfinal.setTextColor(Color.YELLOW);
                    }
                    else if(nota<=4.5){
                        Toast.makeText(getApplicationContext(),"Muy bien",Toast.LENGTH_LONG).show();
                        nfinal.setTextColor(Color.GREEN);
                    }
                    else if(nota<=5.0){
                        Toast.makeText(getApplicationContext(),"Excelente estudiante",Toast.LENGTH_LONG).show();
                        nfinal.setTextColor(Color.BLUE);
                    }
                }
            }
        });
    }
}
