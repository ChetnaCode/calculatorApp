package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final View.OnClickListener V = ;
    private Button one;
    private Button zero;
    private Button two;
 private Button three;
 private Button four;
 private Button  five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button div;
    private Button multy;
    private Button equal;
    private Button Clear;
    private TextView Info;
    private TextView result;
private  final char ADDITION='+';
    private  final char SUBTRACTION='-';
    private  final char MULTIPLICATION='*';
    private  final char DIVISION='/';
    private  final char EQUAL='0';
 private double val1=Double.NaN;
 private double val2;
 private char ACTION;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info.setText(Info.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info.setText(Info.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info.setText(Info.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info.setText(Info.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info.setText(Info.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info.setText(Info.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info.setText(Info.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info.setText(Info.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info.setText(Info.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info.setText(Info.getText().toString() + "9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=ADDITION;
                result.setText(String.valueOf(val1)+"+");
                Info.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=SUBTRACTION;
                result.setText(String.valueOf(val1)+"-");
                Info.setText(null);
            }
        });

        multy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=MULTIPLICATION;
                result.setText(String.valueOf(val1)+"*");
                Info.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=DIVISION;
                result.setText(String.valueOf(val1)+"/");
                Info.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=EQUAL;
                result.setText(result.getText().toString()+ String.valueOf(val2) +"="+String.valueOf(val1));
                Info.setText(null);
            }
        });
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Info.getText().length()>0)
                {
                    CharSequence name=Info.getText().toString();
                    Info.setText(name.subSequence(0,name.length()-1));
                }
                else
                {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    Info.setText(null);
                    result.setText(null);
                }
            }
        });
    }
    private void setupUIViews()
    {
        one ={Button} findViewById(R.id.btn1);
        two ={Button} findViewById(R.id.btn2);
        three ={Button} findViewById(R.id.btn3);
         four ={Button} findViewById(R.id.btn4);
        five ={Button} findViewById(R.id.btn5);
        six ={Button} findViewById(R.id.btn6);
        seven ={Button} findViewById(R.id.btn7);
        eight ={Button} findViewById(R.id.btn8);
        nine ={Button} findViewById(R.id.btn9);
        zero ={Button} findViewById(R.id.btnzero);
        add ={Button} findViewById(R.id.btnadd);
        sub={Button} findViewById(R.id.btnsub);
        multy ={Button} findViewById(R.id.btnmulty);
        div ={Button} findViewById(R.id.btndiv);
        equal={Button} findViewById(R.id.btnequal);
        Clear={Button} findViewById(R.id.btnclear);
        Info={TextView} findViewById(R.id.Info);
        result={TextView} findViewById(R.id.result);
    }
    private void compute()
    {
        if(!Double.isNaN(val1))
        {
            val2=Double.parseDouble(Info.getText().toString());
            switch(ACTION)
            {
                case ADDITION:
                    val1=val1+val2;
                    break;
                case SUBTRACTION:
                    val1=val1-val2;
                    break;
                case MULTIPLICATION:
                    val1=val1*val2;
                    break;
                case DIVISION:
                    val1=val1/val2;
                    break;
                case EQUAL:
                    break;



            }
        }
        else
        {
            val1=Double.parseDouble(Info.getText().toString());
        }
    }

}