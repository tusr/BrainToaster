package com.example.win7.braintoaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView userIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        Intent intent =getIntent();
        userIntro=findViewById(R.id.textView);
        String message = intent.getStringExtra("playerName");
        userIntro.setText("Welcome "+message);
    }
    public void perform(View V)
    {
        Intent I=new Intent(this,GameSelection.class);
        startActivity(I);
        finish();
    }
}
