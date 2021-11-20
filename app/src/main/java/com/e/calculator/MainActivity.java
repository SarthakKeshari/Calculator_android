package com.e.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import java.io.*;
import java.util.*;
import java.util.regex.*;


public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,
            buttonminus,buttonplus,buttondivide,buttonmultiply,
            buttondot,buttonclear,buttonequal,buttonsqrt,buttonsq,buttoncb,buttondel,buttonsign;

    TextView head,monitor,monitorop,test,line;

    Switch dark_mode;

    LinearLayout main;

    String operator = "";

    String num1="",num2="",op="";

    boolean operationUsed = false;

    public void value()
    {
        if(!(num1.equals("") || num2.equals("") || operator.equals("")))
        {
            System.out.println(num1+" : "+num2+" : "+op+" : "+operator);
            switch (operator)
            {
                case "+":
                    num1 = (Double.parseDouble(num1)+Double.parseDouble(num2))+"";
                    break;
                case "-":
                    num1 = (Double.parseDouble(num1)-Double.parseDouble(num2))+"";
                    break;
                case "*":
                    num1 = (Double.parseDouble(num1)*Double.parseDouble(num2))+"";
                    break;
                case "/":
                    num1 = (Double.parseDouble(num1)/Double.parseDouble(num2))+"";
                    break;
                case "=":
                    num1=num1;
            }
            monitor.setText(num1);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);
        buttonminus = findViewById(R.id.buttonminus);
        buttonplus = findViewById(R.id.buttonplus);
        buttonmultiply = findViewById(R.id.buttonmultiply);
        buttondivide = findViewById(R.id.buttondivide);
        buttonclear = findViewById(R.id.buttonclear);
        buttonequal = findViewById(R.id.buttonequal);
        buttondot = findViewById(R.id.buttondot);
        buttonsqrt = findViewById(R.id.buttonsqrt);
        buttonsq = findViewById(R.id.buttonsq);
        buttoncb = findViewById(R.id.buttoncb);
        buttondel = findViewById(R.id.buttondel);
        buttonsign = findViewById(R.id.buttonsign);
//        head = findViewById(R.id.head);
        monitor = findViewById(R.id.monitor);
        monitorop = findViewById(R.id.monitorop);
        test = findViewById(R.id.test);
        dark_mode = findViewById(R.id.dark_mode);
        main = findViewById(R.id.main);
        line = findViewById(R.id.line);



        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if (operationUsed)
                {
                    s="";
//                    test.setText("YES");
                    operator=op;
                    op="";
                    monitorop.setText(op);
                    operationUsed=false;
                }
                if(s.length()<=7)
                {
                    s+=0;
                    monitor.setText(s);
                }

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if (operationUsed)
                {
                    s="";
                    operator=op;
                    op="";
                    monitorop.setText(op);
                    operationUsed=false;
                }
                if(s.length()<=7)
                {
                    s+=1;
                    monitor.setText(s);
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if (operationUsed)
                {
                    s="";
                    operator=op;
                    op="";
                    monitorop.setText(op);
                    operationUsed=false;
                }
                if(s.length()<=7)
                {
                    s+=2;
                    monitor.setText(s);
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if (operationUsed)
                {
                    s="";
                    operator=op;
                    op="";
                    monitorop.setText(op);
                    operationUsed=false;
                }
                if(s.length()<=7)
                {
                    s+=3;
                    monitor.setText(s);
                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if (operationUsed)
                {
                    s="";
                    operator=op;
                    op="";
                    monitorop.setText(op);
                    operationUsed=false;
                }
                if(s.length()<=7)
                {
                    s+=4;
                    monitor.setText(s);
                }

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if (operationUsed)
                {
                    s="";
                    operator=op;
                    op="";
                    monitorop.setText(op);
                    operationUsed=false;
                }
                if(s.length()<=7)
                {
                    s+=5;
                    monitor.setText(s);
                }

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if (operationUsed)
                {
                    s="";
                    operator=op;
                    op="";
                    monitorop.setText(op);
                    operationUsed=false;
                }
                if(s.length()<=7)
                {
                    s+=6;
                    monitor.setText(s);
                }

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if (operationUsed)
                {
                    s="";
                    operator=op;
                    op="";
                    monitorop.setText(op);
                    operationUsed=false;
                }
                if(s.length()<=7)
                {
                    s+=7;
                    monitor.setText(s);
                }

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if (operationUsed)
                {
                    s="";
                    operator=op;
                    op="";
                    monitorop.setText(op);
                    operationUsed=false;
                }
                if(s.length()<=7)
                {
                    s+=8;
                    monitor.setText(s);
                }

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if (operationUsed)
                {
                    s="";
                    operator=op;
                    op="";
                    monitorop.setText(op);
                    operationUsed=false;
                }
                if(s.length()<=7)
                {
                    s+=9;
                    monitor.setText(s);
                }
            }
        });

        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!((monitor.getText().toString()).equals("")))
                {
                    monitorop.setText("+");
                    op="+";
                    operationUsed=true;
                    if(num1.equals(""))
                    {
                        System.out.println("Printing num1");
                        num1=monitor.getText().toString();
                    }
                    else
                    {
                        num2=monitor.getText().toString();
                    }
                    value();
                }
            }
        });

        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!((monitor.getText().toString()).equals("")))
                {
                    monitorop.setText("-");
                    op="-";
                    operationUsed=true;
                    if(num1.equals(""))
                    {
                        num1=monitor.getText().toString();
                    }
                    else
                    {
                        num2=monitor.getText().toString();
                    }
                    value();
                }
            }
        });

        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!((monitor.getText().toString()).equals("")))
                {
                    monitorop.setText("×");
                    op="*";
//                    test.setText(op);
                    operationUsed=true;
                    if(num1.equals(""))
                    {
                        num1=monitor.getText().toString();
                    }
                    else
                    {
                        num2=monitor.getText().toString();
                    }
                    value();
                }
            }
        });

        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!((monitor.getText().toString()).equals("")))
                {
                    monitorop.setText("/");
                    op="/";
                    operationUsed=true;
                    if(num1.equals(""))
                    {
                        num1=monitor.getText().toString();
                    }
                    else
                    {
                        num2=monitor.getText().toString();
                    }
                    value();
                }
            }
        });

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!((monitor.getText().toString()).equals("")))
                {
                    monitorop.setText("=");
                    operationUsed=true;
                    if(num1.equals(""))
                    {
                        num1=monitor.getText().toString();
                    }
                    else
                    {
                        num2=monitor.getText().toString();
                    }
                    value();

                    op="";
                    operator="";
                    num1="";
                    num2="";
                }

            }
        });

        buttonsq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if(s.length()>0)
                {
                    double sq = Double.parseDouble(s)*Double.parseDouble(s);
                    monitor.setText(sq+"");
                    operationUsed=true;
                }

            }
        });

        buttoncb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if(s.length()>0)
                {
                    double cb = Double.parseDouble(s)*Double.parseDouble(s)*Double.parseDouble(s);
                    monitor.setText(cb+"");
                    operationUsed=true;
                }

            }
        });

        buttonsqrt.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if(s.length()>0)
                {
                    double sqrt = Math.sqrt(Double.parseDouble(s));
                    monitor.setText(String.format("%.4f", sqrt));
                    operationUsed=true;
                }

            }
        });

        buttonsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if(s.length()<=7 && s.length()>0)
                {
                    Pattern pattern = Pattern.compile("-");
                    Matcher m = pattern.matcher(s);

                    if(!(m.find()))
                    {
                        s="-"+s;
                        monitor.setText(s);
                    }
                    else
                    {
                        s=s.substring(1);
                        monitor.setText(s);
                    }

                }
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if(s.length()<=7 && s.length()>0)
                {
                    Pattern pattern = Pattern.compile("\\.");
                    Matcher m = pattern.matcher(s);

                    if(!(m.find()))
                    {
                        s+=".";
                        monitor.setText(s);
                    }

                }
            }
        });

        buttondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = monitor.getText().toString();
                if (s.length()>0)
                {
                    s=s.substring(0,s.length()-1);
                    monitor.setText(s);
                }
//                System.out.println(s);
                if(s.equals("-"))
                {
                    monitor.setText("");
                }
            }
        });

        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="";
                num1="";
                num2="";
                monitor.setText(num1);
                monitorop.setText(op);
            }
        });

        dark_mode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(dark_mode.isChecked())
                {
                    main.setBackgroundColor(getResources().getColor(R.color.black));
                    monitor.setTextColor(getResources().getColor(R.color.white));
                    monitorop.setTextColor(getResources().getColor(R.color.white));
                    line.setBackgroundColor(getResources().getColor(R.color.white));
                    dark_mode.setTextColor(getResources().getColor(R.color.white));
                }
                else
                {
                    main.setBackgroundColor(getResources().getColor(R.color.white));
                    monitor.setTextColor(getResources().getColor(R.color.black));
                    monitorop.setTextColor(getResources().getColor(R.color.black));
                    line.setBackgroundColor(getResources().getColor(R.color.black));
                    dark_mode.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
    }
}