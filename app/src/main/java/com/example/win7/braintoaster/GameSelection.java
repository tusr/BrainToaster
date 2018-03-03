package com.example.win7.braintoaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameSelection extends AppCompatActivity {

    Button b1,b2;
    Intent poi;

    public final static String EXTRA_MESSAGE="g";
    String ivalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_selection);
        poi= new Intent(this,Question.class);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
b1=findViewById(R.id.button3);
b2=findViewById(R.id.button4);
    }
    int flag1=0,flag2=0,result=0;
    public  void goGo(View V)
    {
        int id=V.getId();
        if(id==R.id.button3||id==R.id.button4){
            if(id==R.id.button3)
            {
                flag1=1;
                result=1;
                b1.setBackgroundResource(R.drawable.redbuttonshape);
                b2.setBackgroundResource(R.drawable.buttonshape);
            }
            else{
                flag1=2;
                result=2;
                b2.setBackgroundResource(R.drawable.redbuttonshape);
                b1.setBackgroundResource(R.drawable.buttonshape);
            }
        }}
        public void goGo2(View V)
        {
            int id=V.getId();
         if(id==R.id.button5 ||id==R.id.button6 ||id==R.id.button7)
        {
            if(flag1==0)
            {
                Toast.makeText(this,"Select the subject 1st",Toast.LENGTH_SHORT).show();
            }else
            {

            if(flag1==1){
            if(id==R.id.button5)
            {
                ivalue="0";

            }
            else if(id==R.id.button6)
            {
                ivalue="5";
            }
            else if(id==R.id.button7)
            {
                ivalue="10";

            }
            }

            else if(flag1==2) {
                if (id == R.id.button5) {
                    ivalue = "15";
                } else if (id == R.id.button6) {
                    ivalue = "20";
                } else if (id == R.id.button7) {
                    ivalue = "25";
                }
            }
                poi.putExtra("EXTRA_MESSAGE",ivalue);
                startActivity(poi);
                finish();

            }


        }}}



