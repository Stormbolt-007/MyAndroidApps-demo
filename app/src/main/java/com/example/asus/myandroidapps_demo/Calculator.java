package com.example.asus.myandroidapps_demo;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Calculator extends AppCompatActivity {
    Button b17,b18,b19,b20,b21,b22;
    EditText e6,e7;
    TextView tv;
    TextToSpeech ts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b17=(Button)findViewById(R.id.button17);
        b18=(Button)findViewById(R.id.button18);
        b19=(Button)findViewById(R.id.button19);
        b20=(Button)findViewById(R.id.button20);
        b21=(Button)findViewById(R.id.button21);
        b22=(Button)findViewById(R.id.button22);
        e6=(EditText)findViewById(R.id.editText6);
        e7=(EditText)findViewById(R.id.editText7);
        tv=(TextView)findViewById(R.id.textView7);

        ts=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(0.9f);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1+f2;
                String s3=Float.toString(f3);
                tv.setText(s3);
                ts.speak("The asnwer is" +s3,TextToSpeech.QUEUE_FLUSH,null);

                Toast.makeText(Calculator.this, "answer:- "+s3, Toast.LENGTH_SHORT).show();

            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1-f2;
                String s3=Float.toString(f3);
                tv.setText(s3);
                ts.speak("The asnwer is" +s3,TextToSpeech.QUEUE_FLUSH,null);

                Toast.makeText(Calculator.this, "answer:- "+s3, Toast.LENGTH_SHORT).show();

            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1*f2;
                String s3=Float.toString(f3);
                tv.setText(s3);
                ts.speak("The asnwer is" +s3,TextToSpeech.QUEUE_FLUSH,null);

                Toast.makeText(Calculator.this, "answer:- "+s3, Toast.LENGTH_SHORT).show();

            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1/f2;
                String s3=Float.toString(f3);
                tv.setText(s3);
                ts.speak("The asnwer is" +s3,TextToSpeech.QUEUE_FLUSH,null);

                Toast.makeText(Calculator.this, "answer:- "+s3, Toast.LENGTH_SHORT).show();

            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Calculator.this,Welcome.class);
                startActivity(i1);
                finish();
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Calculator.this,MainActivity.class);
                startActivity(i2);
                finish();
            }
        });


    }
}
