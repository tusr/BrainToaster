package com.example.win7.braintoaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    Bundle B=new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();}
public void perform(View V)
{
    EditText e1=findViewById(R.id.editText);
    String player=e1.getText().toString();
    if(player.trim().length()==0)
    {
        Toast.makeText(this,"Enter Player Name",Toast.LENGTH_SHORT).show();
    }
    else {
        Intent startNewActivity = new Intent(this, Main2Activity.class);
        EditText theEditText = (EditText) findViewById(R.id.editText);
        String message = theEditText.getText().toString();
        startNewActivity.putExtra("playerName", message);
        startActivity(startNewActivity);
        finish();
    }
}
}
