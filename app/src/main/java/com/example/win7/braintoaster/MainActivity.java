package com.example.win7.braintoaster;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
VideoView btvideo;
 Intent home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btvideo=findViewById(R.id.videoView);
getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
getSupportActionBar().hide();
        Uri uri=Uri.parse("android.resource://" +getPackageName() +"/"+R.raw.brainvideo);
        btvideo.setVideoURI(uri);

        home=new Intent(this,Home.class);
        btvideo.start();
        Thread t=new Thread(){
    public void run()
    {
        try
        {
        Thread.sleep(6000);
            startActivity(home);
            finish();


        }

  catch (InterruptedException e)
  {
  e.printStackTrace();
  }



    }
};t.start();


    }
}
