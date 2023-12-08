package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText fnumber,snumber;
    Button btnadd,btnsub,btnmul,btndiv;
    Double num1,num2;
    TextView resultid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fnumber= (EditText) findViewById(R.id.fnumber);
        snumber= (EditText) findViewById(R.id.snumber);
        btnadd= (Button) findViewById(R.id.btnadd);
        btnsub= (Button) findViewById(R.id.btnsub);
        btnmul= (Button) findViewById(R.id.btnmul);
        btndiv= (Button) findViewById(R.id.btndiv);
        resultid= (TextView) findViewById(R.id.resultid);

        Clicklistener();
    }
    
    public void Clicklistener(){
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(fnumber.getText().toString());
                num2=Double.parseDouble(snumber.getText().toString());
                Double result=num1+num2;
                resultid.setText(String.valueOf(result));
            }
         });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(fnumber.getText().toString());
                num2=Double.parseDouble(snumber.getText().toString());
                Double result=num1-num2;
                resultid.setText(String.valueOf(result));
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(fnumber.getText().toString());
                num2=Double.parseDouble(snumber.getText().toString());
                Double result=num1*num2;
                resultid.setText(String.valueOf(result));
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(fnumber.getText().toString());
                num2=Double.parseDouble(snumber.getText().toString());
                Double result=num1/num2;
                resultid.setText(String.valueOf(result));
            }
        });
    }
}