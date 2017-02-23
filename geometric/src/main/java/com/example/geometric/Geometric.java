package com.example.geometric;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Geometric extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    EditText e1,e2,e3;
    TextView t1,t2;
    char var = 1;
    Double area,volume,perimeter;
    boolean flagt = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometric);
        r1 = (RadioButton)findViewById(R.id.rSquare);
        r2 = (RadioButton)findViewById(R.id.rTriangle);
        r3 = (RadioButton)findViewById(R.id.rCircle);
        r4 = (RadioButton)findViewById(R.id.rCube);
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        e3 = (EditText)findViewById(R.id.e3);
        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);
        e1.setVisibility(View.INVISIBLE);
        e2.setVisibility(View.INVISIBLE);
        e3.setVisibility(View.INVISIBLE);
        t1.setVisibility(View.INVISIBLE);
        t2.setVisibility(View.INVISIBLE);
        e1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Insert
                switch (var){
                    case 1:
                        if(!e1.getText().toString().equals("") && !e1.getText().toString().equals(".")) {
                            valueSq(Double.parseDouble(e1.getText().toString()));
                        }
                        else {
                            t1.setVisibility(View.INVISIBLE);
                            t2.setVisibility(View.INVISIBLE);
                        }
                        break;
                    case 2:
                        if(e1.getText().toString().equals("") || e2.getText().toString().equals("") || e3.getText().toString().equals("") || e1.getText().toString().equals(".") || e2.getText().toString().equals(".") || e3.getText().toString().equals(".")){
                            t1.setText("Complete sides");
                            t2.setText("please");
                        }
                        else{
                            valueTr(Double.parseDouble(e1.getText().toString()),Double.parseDouble(e2.getText().toString()),Double.parseDouble(e3.getText().toString()));
                        }
                        break;
                    case 3:
                        if(!e1.getText().toString().equals("") && !e1.getText().toString().equals(".")) {
                            valueCi(Double.parseDouble(e1.getText().toString()));
                        }
                        else {
                            t1.setVisibility(View.INVISIBLE);
                            t2.setVisibility(View.INVISIBLE);
                        }
                        break;
                    case 4:
                        if(!e1.getText().toString().equals("") && !e1.getText().toString().equals(".")) {
                            valueCu(Double.parseDouble(e1.getText().toString()));
                        }
                        else {
                            t1.setVisibility(View.INVISIBLE);
                            t2.setVisibility(View.INVISIBLE);
                        }
                        break;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        e2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(e1.getText().toString().equals("") || e2.getText().toString().equals("") || e3.getText().toString().equals("") || e1.getText().toString().equals(".") || e2.getText().toString().equals(".") || e3.getText().toString().equals(".")){
                    t1.setText("Complete sides");
                    t2.setText("please");
                }
                else{
                    valueTr(Double.parseDouble(e1.getText().toString()),Double.parseDouble(e2.getText().toString()),Double.parseDouble(e3.getText().toString()));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        e3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(e1.getText().toString().equals("") || e2.getText().toString().equals("") || e3.getText().toString().equals("") || e1.getText().toString().equals(".") || e2.getText().toString().equals(".") || e3.getText().toString().equals(".")){
                    t1.setText("Complete sides");
                    t2.setText("please");
                }
                else{
                    valueTr(Double.parseDouble(e1.getText().toString()),Double.parseDouble(e2.getText().toString()),Double.parseDouble(e3.getText().toString()));
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void showSq(){
        e1.setVisibility(View.VISIBLE);
        e1.setText("");
        e2.setVisibility(View.INVISIBLE);
        e3.setVisibility(View.INVISIBLE);
        e1.setHint("Side");
    }

    public void showTr(){
        e1.setVisibility(View.VISIBLE);
        e1.setText("");
        e2.setVisibility(View.VISIBLE);
        e2.setText("");
        e3.setVisibility(View.VISIBLE);
        e3.setText("");
        e1.setHint("Side 1");
        e2.setHint("Side 2");
        e3.setHint("Side 3");
    }

    public void showCi(){
        e1.setVisibility(View.VISIBLE);
        e1.setText("");
        e2.setVisibility(View.INVISIBLE);
        e3.setVisibility(View.INVISIBLE);
        e1.setHint("Radio");
    }

    public void showCu(){
        e1.setVisibility(View.VISIBLE);
        e1.setText("");
        e2.setVisibility(View.INVISIBLE);
        e3.setVisibility(View.INVISIBLE);
        e1.setHint("Edge");
    }

    public void valueSq(Double l){
        t1.setVisibility(View.VISIBLE);
        t2.setVisibility(View.VISIBLE);
        String st1 = "Perimeter: ",st2 ="Area: ",aux;
        area = l*l;
        if(area>=1.0){area = Math.rint(area*1000)/1000;}
        aux = area.toString();
        st2+=aux;
        t1.setText(st2);
        perimeter = 4*l;
        if(perimeter>=1.0){perimeter = Math.rint(perimeter*1000)/1000;}
        aux = perimeter.toString();
        st1+=aux;
        t2.setText(st1);
    }

    public void valueTr(Double l1,Double l2,Double l3){
        t1.setVisibility(View.VISIBLE);
        t2.setVisibility(View.VISIBLE);
        String st1 = "Perimeter: ",st2 ="Area: ",aux;
        if((l1+l2)<=l3 || (l1+l3)<=l2 || (l3+l2)<=l1){
            t1.setText("Invalid sides");
            t2.setText("of triangles.");
        }
        else{
            perimeter = l1+l2+l3;
            Double sp = perimeter/2;
            if(perimeter>=1.0){perimeter = Math.rint(perimeter*1000)/1000;}
            aux = perimeter.toString();
            st1+=aux;
            t2.setText(st1);
            area = Math.sqrt(sp*(sp-l1)*(sp-l2)*(sp-l3));
            if(area>=1.0){area = Math.rint(area*1000)/1000;}
            aux = area.toString();
            st2+=aux;
            t1.setText(st2);
        }
    }

    public void valueCi(Double r){
        t1.setVisibility(View.VISIBLE);
        t2.setVisibility(View.VISIBLE);
        String st1 = "Perimeter: ",st2 ="Area: ",aux;
        area = Math.PI*r*r;
        if(area>=1.0){area = Math.rint(area*1000)/1000;}
        aux = area.toString();
        st2+=aux;
        t1.setText(st2);
        perimeter = 2*Math.PI*r;
        if(perimeter>=1.0){perimeter = Math.rint(perimeter*1000)/1000;}
        aux = perimeter.toString();
        st1+=aux;
        t2.setText(st1);
    }

    public void valueCu(Double a){
        String st1 = "Volume: ",st2 ="Area: ",aux;
        t1.setVisibility(View.VISIBLE);
        t2.setVisibility(View.VISIBLE);
        area = 6*a*a;
        if(area>=1.0){area = Math.rint(area*1000)/1000;}
        aux = area.toString();
        st2+=aux;
        t1.setText(st2);
        volume = a*a*a;
        if(volume>=1.0){volume = Math.rint(volume*1000)/1000;}
        aux = volume.toString();
        st1+=aux;
        t2.setText(st1);
    }

    public void click(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.rSquare:
                if(checked){
                    t1.setVisibility(View.INVISIBLE);
                    t2.setVisibility(View.INVISIBLE);
                    var = 1;
                    showSq();
                }
                break;
            case R.id.rTriangle:
                if(checked){
                    t1.setVisibility(View.INVISIBLE);
                    t2.setVisibility(View.INVISIBLE);
                    var = 2;
                    showTr();
                }
                break;
            case R.id.rCircle:
                if(checked){
                    t1.setVisibility(View.INVISIBLE);
                    t2.setVisibility(View.INVISIBLE);
                    var = 3;
                    showCi();
                }
                break;
            case R.id.rCube:
                if(checked){
                    t1.setVisibility(View.INVISIBLE);
                    t2.setVisibility(View.INVISIBLE);
                    var = 4;
                    showCu();
                }
                break;

        }
    }


}
