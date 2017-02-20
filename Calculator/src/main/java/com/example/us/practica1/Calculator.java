package com.example.us.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {

    EditText eNum;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,bPun,bSum,bMin,bMul,bDiv,bClr,bBack;
    String acum="";
    Double a=0.0,b=0.0;
    int var=0,op=0;
    boolean f = false,g = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        eNum = (EditText) findViewById(R.id.etNum);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        b00 = (Button) findViewById(R.id.b00);
        bPun = (Button) findViewById(R.id.bPun);
        bSum = (Button) findViewById(R.id.bMas);
        bMin = (Button) findViewById(R.id.bMenos);
        bMul = (Button) findViewById(R.id.bPor);
        bDiv = (Button) findViewById(R.id.bDiv);
        bClr = (Button) findViewById(R.id.bClear);
        bBack = (Button) findViewById(R.id.bBack);

    }

    public void click(View view){
        int id = view.getId();
        switch (id){
            case R.id.b1:
                if(var<10) {
                    acum = acum + "1";
                    var++;
                    eNum.setText(acum);
                    a = Double.parseDouble(acum);
                    f = true;
                }
                break;
            case R.id.b2:
                if(var<10) {
                    acum = acum + "2";
                    var++;
                    eNum.setText(acum);
                    a = Double.parseDouble(acum);
                    f = true;
                }
                break;
            case R.id.b3:
                if(var<10) {
                    acum = acum + "3";
                    var++;
                    eNum.setText(acum);
                    a = Double.parseDouble(acum);
                    f = true;
                }
                break;
            case R.id.b4:
                if(var<10) {
                    acum = acum + "4";
                    var++;
                    eNum.setText(acum);
                    a = Double.parseDouble(acum);
                    f = true;
                }
                break;
            case R.id.b5:
                if(var<10) {
                    acum = acum + "5";
                    var++;
                    eNum.setText(acum);
                    a = Double.parseDouble(acum);
                    f = true;
                }
                break;
            case R.id.b6:
                if(var<10) {
                    acum = acum + "6";
                    var++;
                    eNum.setText(acum);
                    a = Double.parseDouble(acum);
                    f = true;
                }
                break;
            case R.id.b7:
                if(var<10) {
                    acum = acum + "7";
                    var++;
                    eNum.setText(acum);
                    a = Double.parseDouble(acum);
                    f = true;
                }
                break;
            case R.id.b8:
                if(var<10) {
                    acum = acum + "8";
                    var++;
                    eNum.setText(acum);
                    a = Double.parseDouble(acum);
                    f = true;
                }
                break;
            case R.id.b9:
                if(var<10) {
                    acum = acum + "9";
                    var++;
                    eNum.setText(acum);
                    a = Double.parseDouble(acum);
                    f = true;
                }
                break;
            case R.id.b0:
                if(var < 10) {
                    if (var != 0) {
                        acum = acum + "0";
                        var++;
                        eNum.setText(acum);
                        a = Double.parseDouble(acum);
                        f = true;
                    }
                    else{
                        acum = "";
                        eNum.setText("0");
                        a = 0.0;
                        f = true;
                    }
                }
                break;
            case R.id.b00:
                if(var < 10) {
                    if (var != 0) {
                        acum = acum + "00";
                        var+=2;
                        eNum.setText(acum);
                        a = Double.parseDouble(acum);
                        f = true;
                    }
                    else{
                        acum = "";
                        eNum.setText("0");
                        a = 0.0;
                        f = true;
                    }
                }
                break;
            case R.id.bMas:
                if(f) {
                    if (op == 0) {
                        b = a;
                    } else if (op == 1) {
                        b += a;
                    } else if (op == 2) {
                        b -= a;
                    } else if (op == 3) {
                        b *= a;
                    } else if (op == 4) {
                        b /= a;
                    }
                    a = b;
                    acum = b.toString();
                    eNum.setText(acum);
                    acum = "";
                    var = 0;
                    op = 1;
                    f = false;
                }
                else {op = 1;}
                g = false;
                break;
            case R.id.bMenos:
                if(f) {
                    if (op == 0) {
                        b = a;
                    } else if (op == 1) {
                        b += a;
                    } else if (op == 2) {
                        b -= a;
                    } else if (op == 3) {
                        b *= a;
                    } else if (op == 4) {
                        b /= a;
                    }
                    a = b;
                    acum = b.toString();
                    eNum.setText(acum);
                    acum = "";
                    var = 0;
                    op = 2;
                    f = false;
                }
                else {op = 2;}
                g = false;
                break;
            case R.id.bPor:
                if(f) {
                    if (op == 0) {
                        b = a;
                    } else if (op == 1) {
                        b += a;
                    } else if (op == 2) {
                        b -= a;
                    } else if (op == 3) {
                        b *= a;
                    } else if (op == 4) {
                        b /= a;
                    }
                    a = b;
                    acum = b.toString();
                    eNum.setText(acum);
                    acum = "";
                    var = 0;
                    op = 3;
                    f = false;
                }
                else {op = 3;}
                g = false;
                break;
            case R.id.bDiv:
                if(f) {
                    if (op == 0) {
                        b = a;
                    } else if (op == 1) {
                        b += a;
                    } else if (op == 2) {
                        b -= a;
                    } else if (op == 3) {
                        b *= a;
                    } else if (op == 4) {
                        b /= a;
                    }
                    a = b;
                    acum = b.toString();
                    eNum.setText(acum);
                    acum = "";
                    var = 0;
                    op = 4;
                    f = false;
                }
                else {op = 4;}
                g = false;
                break;
            case R.id.bIgual:
                if (op == 0) {
                    b = a;
                } else if (op == 1) {
                    b+=a;
                } else if (op == 2) {
                    b-=a;
                } else if (op == 3) {
                    b*=a;
                } else if (op == 4) {
                    b/=a;
                }
                a = b;
                acum = b.toString();
                eNum.setText(acum);
                var = 0;
                op = 0;
                g = false;
                acum = "";
                f = true;
                break;
            case R.id.bPun:
                if(!g){
                    if(var < 10) {
                        if (var != 0) {
                            acum = acum + ".";
                            var++;
                            eNum.setText(acum);
                            a = Double.parseDouble(acum);
                            f = true;
                        }
                        else{
                            acum = "0.";
                            var++;
                            eNum.setText("0.");
                            a = 0.0;
                            f = true;
                        }
                    }
                    g = true;
                }
                break;
            case R.id.bClear:
                var = 0;
                acum = "";
                eNum.setText("0");
                g = false;
                break;
            case R.id.bReset:
                var = 0;
                acum = "";
                eNum.setText("0");
                g = false;
                a = 0.0;
                b = 0.0;
                break;
            case R.id.bBack:
                if (var > 1) {
                    if(acum.substring(acum.length()-1).equals(".")){
                        g = false;
                    }
                    acum = acum.substring(0, acum.length() - 1);
                    eNum.setText(acum);
                    var--;
                    a = Double.parseDouble(acum);
                }
                else if(var == 1){
                    acum = "";
                    eNum.setText("0");
                    var = 0;
                    a = 0.0;
                    g = false;
                }
                break;
        }
    }
}
