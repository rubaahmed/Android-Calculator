package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,sub,add,divide,multi,btnEqual;
Button clear;
EditText edt;
Float Res1,Res2;
boolean Add,Sub,Multi,Divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnDot=(Button)findViewById(R.id.btnDot);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        divide=(Button)findViewById(R.id.divide);
        multi=(Button)findViewById(R.id.multi);
        btnEqual=(Button)findViewById(R.id.btnEqual);
        edt=(EditText) findViewById(R.id.editText);
        btn1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
              edt.setText(edt.getText()+"1");
            }
        });


        btn2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edt.setText(edt.getText()+"2");
            }
        });
        btn3.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edt.setText(edt.getText()+"3");
            }
        });
        btn4.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edt.setText(edt.getText()+"4");
            }
        });
        btn5.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edt.setText(edt.getText()+"5");
            }
        });
        btn6.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edt.setText(edt.getText()+"6");
            }
        });
        btn7.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edt.setText(edt.getText()+"7");
            }
        });
        btn8.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edt.setText(edt.getText()+"8");
            }
        });
        btn9.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edt.setText(edt.getText()+"9");
            }
        });
        btn0.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edt.setText(edt.getText()+"0");
            }
        });
        btnDot.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edt.setText(edt.getText()+".");
            }
        });

        add.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(edt==null){
                    edt.setText("");
                }
                else{
                    Res1=Float.parseFloat(edt.getText()+"");
                    Add=true;
                    edt.setText(null);
                }
            }
        });

        sub.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(edt==null){
                    edt.setText("");
                }
                else{
                    Res1=Float.parseFloat(edt.getText()+"");
                    Sub=true;
                    edt.setText(null);
                }
            }
        });
        multi.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(edt==null){
                    edt.setText("");
                }
                else{
                    Res1=Float.parseFloat(edt.getText()+"");
                    Multi=true;
                    edt.setText(null);
                }
            }
        });
        divide.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(edt==null){
                    edt.setText("");
                }
                else{
                    Res1=Float.parseFloat(edt.getText()+"");
                    Divide=true;
                    edt.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Res2=Float.parseFloat(edt.getText()+"");
                if(Add==true){
                    edt.setText(Res1+Res2+"");
                    Add=false;
                }
               else if(Sub==true){
                    edt.setText(Res1-Res2+"");
                    Sub=false;
                }
               else if(Multi==true){
                    edt.setText(Res1*Res2+"");
                    Multi=false;
                }
               else if(Divide==true){
                   if(Res2==0){
                       edt.setText("ERROR !! CANNOT DIVIDE BY 0");
                   }
                   else{
                    edt.setText(Res1/Res2+"");
                    Divide=false;}
                }
            }
        });
     clear.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             edt.setText("");
         }
     });



    }
}