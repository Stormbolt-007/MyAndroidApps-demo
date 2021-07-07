package com.example.asus.myandroidapps_demo;

import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class Torch extends AppCompatActivity {
    Button b33;
    ToggleButton tb;
    CameraManager cm;
    private boolean camera=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torch);
        b33=(Button)findViewById(R.id.button33);
        tb=(ToggleButton)findViewById(R.id.toggleButton);
        cm=(CameraManager)getSystemService(CAMERA_SERVICE);

        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    try{
                        String s1=cm.getCameraIdList()[0];
                        cm.setTorchMode(s1,true);
                        camera=true;
                    }
                    catch (CameraAccessException e){

                    }
                }
                else{
                    try{
                        String s2=cm.getCameraIdList()[0];
                        cm.setTorchMode(s2,false);
                        camera=true;
                    }
                    catch (CameraAccessException e){

                    }
                }
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Torch.this,Welcome.class);
                startActivity(i1);
                finish();
            }
        });
    }
}
