package com.example.asus.myandroidapps_demo;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoCapture extends AppCompatActivity {
    Button b26,b27,b28;
    MediaController mc;
    Uri u1;
    VideoView vw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_capture);
        b26=(Button)findViewById(R.id.button26);
        b27=(Button)findViewById(R.id.button27);
        b28=(Button)findViewById(R.id.button28);
        vw=(VideoView)findViewById(R.id.videoView);
        mc=new MediaController(this);
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(i,0);
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(VideoCapture.this,Welcome.class);
                startActivity(i1);
                finish();
            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(VideoCapture.this,MainActivity.class);
                startActivity(i2);
                finish();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        u1=data.getData();
        vw.setVideoURI(u1);
        vw.setMediaController(mc);
        mc.setAnchorView(vw);
        vw.start();

    }
}
