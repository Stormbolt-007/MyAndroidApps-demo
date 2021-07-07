package com.example.asus.myandroidapps_demo;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BluetoothONOFF extends AppCompatActivity {
    Button b29,b30,b31;
    BluetoothAdapter ba;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth_onoff);
        b29=(Button)findViewById(R.id.button29);
        b30=(Button)findViewById(R.id.button30);
        b31=(Button)findViewById(R.id.button31);
        ba=BluetoothAdapter.getDefaultAdapter();

        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ba.enable();
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ba.disable();
            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(BluetoothONOFF.this,Welcome.class);
                startActivity(i1);
                finish();
            }
        });
    }
}
