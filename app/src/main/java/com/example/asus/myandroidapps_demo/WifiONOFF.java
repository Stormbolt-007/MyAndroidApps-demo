package com.example.asus.myandroidapps_demo;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class WifiONOFF extends AppCompatActivity {
    Button b32;
    ImageButton ib;
    WifiManager wm;
    private boolean wifi=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_onoff);
        b32=(Button)findViewById(R.id.button32);
        ib=(ImageButton)findViewById(R.id.imageButton);
        wm=(WifiManager)getSystemService(WIFI_SERVICE);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wifi==false){
                    wm.setWifiEnabled(true);
                    wifi=true;
                    ib.setImageResource(R.drawable.onn);
                }
                else{
                    wm.setWifiEnabled(false);
                    wifi=false;
                    ib.setImageResource(R.drawable.off);
                }
            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(WifiONOFF.this,Welcome.class);
                startActivity(i1);
                finish();
            }
        });
    }
}
