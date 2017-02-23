package com.example.resistor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resistor extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bgold,bsilv,bfi,bse,bth,btol;
    int bid;
    TextView res1,res2,res3;
    Double a1 = 1.0,a2=0.0,a3=0.1,a4=0.05;
    String ohm = "KΩ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resistor);
        b0 = (Button)findViewById(R.id.bBlack);
        b1 = (Button)findViewById(R.id.bBrown);
        b2 = (Button)findViewById(R.id.bRed);
        b3 = (Button)findViewById(R.id.bOrange);
        b4 = (Button)findViewById(R.id.bYellow);
        b5 = (Button)findViewById(R.id.bGreen);
        b6 = (Button)findViewById(R.id.bBlue);
        b7 = (Button)findViewById(R.id.bPurple);
        b8 = (Button)findViewById(R.id.bGray);
        b9 = (Button)findViewById(R.id.bWhite);
        bgold = (Button)findViewById(R.id.bGolden);
        bsilv = (Button)findViewById(R.id.bSilver);
        bfi = (Button)findViewById(R.id.bFirst);
        bse = (Button)findViewById(R.id.bSecond);
        bth = (Button)findViewById(R.id.bThird);
        btol = (Button)findViewById(R.id.bForth);
        res1 = (TextView)findViewById(R.id.tRes);
        res2 = (TextView)findViewById(R.id.tRes2);
        res3 = (TextView)findViewById(R.id.tRes3);
        hideb();
        updatev();
    }
    public void showb1(){
        b0.setVisibility(View.VISIBLE);
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
    }
    public void showb2(){
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        bgold.setVisibility(View.VISIBLE);
        bsilv.setVisibility(View.VISIBLE);

    }
    public void showb3(){
        b0.setVisibility(View.VISIBLE);
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        bgold.setVisibility(View.VISIBLE);
        bsilv.setVisibility(View.VISIBLE);
    }

    public void showb4(){
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
    }

    public void hideb(){
        b0.setVisibility(View.INVISIBLE);
        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);
        b4.setVisibility(View.INVISIBLE);
        b5.setVisibility(View.INVISIBLE);
        b6.setVisibility(View.INVISIBLE);
        b7.setVisibility(View.INVISIBLE);
        b8.setVisibility(View.INVISIBLE);
        b9.setVisibility(View.INVISIBLE);
        bgold.setVisibility(View.INVISIBLE);
        bsilv.setVisibility(View.INVISIBLE);
    }

    public void updatev(){
        Double da1,da2,da3;
        String st1,st2,st3;
        da1 = (10*a1 + a2)*a3*(1-a4);
        da1 = Math.rint(da1*100000)/100000;
        da2 = (10*a1 + a2)*a3*(1+a4);
        da2 = Math.rint(da2*100000)/100000;
        da3 = (10*a1 + a2)*a3;
        da3 = Math.rint(da3*100000)/100000;
        st1 = da1.toString() + ohm;
        st2 = da2.toString() + ohm;
        st3 = da3.toString() + ohm;
        res1.setText(st1);
        res2.setText(st2);
        res3.setText(st3);

    }
    public void click(View view){
        int id = view.getId();
        switch (id){
            case R.id.bFirst:
                bid = 1;
                hideb();
                showb4();
                break;
            case R.id.bSecond:
                bid = 2;
                hideb();
                showb1();
                break;
            case R.id.bThird:
                bid = 3;
                hideb();
                showb3();
                break;
            case R.id.bForth:
                bid = 4;
                hideb();
                showb2();
                break;
            case R.id.bBlack:
                switch (bid){
                    case 2:
                        a2 = 0.0;
                        bse.setBackgroundColor(Color.BLACK);
                        break;
                    case 3:
                        a3 = 1.0;
                        ohm = "Ω";
                        bth.setBackgroundColor(Color.BLACK);
                        break;
                }
                updatev();
                hideb();
                break;
            case R.id.bBrown:
                switch (bid){
                    case 1:
                        a1 = 1.0;
                        bfi.setBackgroundColor(Color.rgb(0x8b,0x45,0x13));
                        break;
                    case 2:
                        a2 = 1.0;
                        bse.setBackgroundColor(Color.rgb(0x8b,0x45,0x13));
                        break;
                    case 3:
                        a3 = 10.0;
                        ohm = "Ω";
                        bth.setBackgroundColor(Color.rgb(0x8b,0x45,0x13));
                        break;
                    case 4:
                        a4 = 0.01;
                        btol.setBackgroundColor(Color.rgb(0x8b,0x45,0x13));
                        break;
                }
                updatev();
                hideb();
                break;
            case R.id.bRed:
                switch (bid){
                    case 1:
                        a1 = 2.0;
                        bfi.setBackgroundColor(Color.RED);
                        break;
                    case 2:
                        a2 = 2.0;
                        bse.setBackgroundColor(Color.RED);
                        break;
                    case 3:
                        a3 = 0.1;
                        ohm = "KΩ";
                        bth.setBackgroundColor(Color.RED);
                        break;
                    case 4:
                        a4 = 0.02;
                        btol.setBackgroundColor(Color.RED);
                        break;
                }
                updatev();
                hideb();
                break;
            case R.id.bOrange:
                switch (bid){
                    case 1:
                        a1 = 3.0;
                        bfi.setBackgroundColor(Color.rgb(0xff,0x45,0));
                        break;
                    case 2:
                        a2 = 3.0;
                        bse.setBackgroundColor(Color.rgb(0xff,0x45,0));
                        break;
                    case 3:
                        a3 = 1.0;
                        ohm = "KΩ";
                        bth.setBackgroundColor(Color.rgb(0xff,0x45,0));
                        break;
                }
                updatev();
                hideb();
                break;
            case R.id.bYellow:
                switch (bid){
                    case 1:
                        a1 = 4.0;
                        bfi.setBackgroundColor(Color.YELLOW);
                        break;
                    case 2:
                        a2 = 4.0;
                        bse.setBackgroundColor(Color.YELLOW);
                        break;
                    case 3:
                        a3 = 10.0;
                        ohm = "KΩ";
                        bth.setBackgroundColor(Color.YELLOW);
                        break;
                }
                updatev();
                hideb();
                break;
            case R.id.bGreen:
                switch (bid){
                    case 1:
                        a1 = 5.0;
                        bfi.setBackgroundColor(Color.rgb(0,0x80,0));
                        break;
                    case 2:
                        a2 = 5.0;
                        bse.setBackgroundColor(Color.rgb(0,0x80,0));
                        break;
                    case 3:
                        a3 = 0.1;
                        ohm = "MΩ";
                        bth.setBackgroundColor(Color.rgb(0,0x80,0));
                        break;
                    case 4:
                        a4 = 0.005;
                        btol.setBackgroundColor(Color.rgb(0,0x80,0));
                        break;
                }
                updatev();
                hideb();
                break;
            case R.id.bBlue:
                switch (bid){
                    case 1:
                        a1 = 6.0;
                        bfi.setBackgroundColor(Color.BLUE);
                        break;
                    case 2:
                        a2 = 6.0;
                        bse.setBackgroundColor(Color.BLUE);
                        break;
                    case 3:
                        a3 = 1.0;
                        ohm = "MΩ";
                        bth.setBackgroundColor(Color.BLUE);
                        break;
                    case 4:
                        a4 = 0.0025;
                        btol.setBackgroundColor(Color.BLUE);
                        break;
                }
                updatev();
                hideb();
                break;
            case R.id.bPurple:
                switch (bid){
                    case 1:
                        a1 = 7.0;
                        bfi.setBackgroundColor(Color.rgb(0x80,0,0x80));
                        break;
                    case 2:
                        a2 = 7.0;
                        bse.setBackgroundColor(Color.rgb(0x80,0,0x80));
                        break;
                    case 3:
                        a3 = 10.0;
                        ohm = "MΩ";
                        bth.setBackgroundColor(Color.rgb(0x80,0,0x80));
                        break;
                    case 4:
                        a4 = 0.001;
                        btol.setBackgroundColor(Color.rgb(0x80,0,0x80));
                        break;
                }
                updatev();
                hideb();
                break;
            case R.id.bGray:
                switch (bid){
                    case 1:
                        a1 = 8.0;
                        bfi.setBackgroundColor(Color.GRAY);
                        break;
                    case 2:
                        a2 = 8.0;
                        bse.setBackgroundColor(Color.GRAY);
                        break;
                    case 4:
                        a4 = 0.0005;
                        btol.setBackgroundColor(Color.GRAY);
                        break;
                }
                updatev();
                hideb();
                break;
            case R.id.bWhite:
                switch (bid){
                    case 1:
                        a1 = 9.0;
                        bfi.setBackgroundColor(Color.WHITE);
                        break;
                    case 2:
                        a2 = 9.0;
                        bse.setBackgroundColor(Color.WHITE);
                        break;
                }
                updatev();
                hideb();
                break;
            case R.id.bGolden:
                switch (bid){
                    case 3:
                        a3 = 0.1;
                        ohm = "Ω";
                        bth.setBackgroundColor(Color.rgb(0xda,0xa5,0x20));
                        break;
                    case 4:
                        a4 = 0.05;
                        btol.setBackgroundColor(Color.rgb(0xda,0xa5,0x20));
                        break;
                }
                updatev();
                hideb();
                break;
            case R.id.bSilver:
                switch (bid){
                    case 3:
                        a3 = 0.01;
                        ohm = "Ω";
                        bth.setBackgroundColor(Color.rgb(0xc0,0xc0,0xc0));
                        break;
                    case 4:
                        a4 = 0.1;
                        btol.setBackgroundColor(Color.rgb(0xc0,0xc0,0xc0));
                        break;
                }
                updatev();
                hideb();
                break;


        }
    }
}
