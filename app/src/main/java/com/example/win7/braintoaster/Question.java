package com.example.win7.braintoaster;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;

public class Question extends AppCompatActivity {
    float score=0;
    int index=0;
    private ProgressDialog progress;
    int count=0;
    int x=0;
    String []q=  new String[6];
    String []b1=  new String[6];
    String []b2=  new String[6];
    String []b3=  new String[6];
    String []b4=  new String[6];
    int [] ans = new int[7];
    Timer change1 = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);


        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");
        index = Integer.parseInt(message);
        TextView t5 = (TextView) findViewById(R.id.textView10);

        t5.setText("Question " + count + 1);
        TextView t = (TextView) findViewById(R.id.textView11);


        TextView t12 = (TextView) findViewById(R.id.textView12);
        t12.setText("Score " + score);

        Button B1 = (Button) findViewById(R.id.button21);

        Button B2 = (Button) findViewById(R.id.button22);

        Button B3 = (Button) findViewById(R.id.button23);

        Button B4 = (Button) findViewById(R.id.button24);
        if (index == 0) {
            x=10000;
            q[0] = " Two angles of a triangle measure 15° and 85 °. What is the measure for the third angle?";

            b1[0] = "  50°";
            b2[0] = "  80°  ";
            b3[0] = " 55° ";
            b4[0] = "90° ";
            ans[0] = 2;

            q[1] = "If y(x-1)=z then x= ";
            b1[1] = " z/y + 1 ";
            b2[1] = "  y(z-1) ";
            b3[1] = "z(y-1)";
            b4[1] = "1-zy";
            ans[1] = 1;

            q[2] = " Which of the following is equal to 5.93 x 10^-2";
            b1[2] = "  0.00593 ";
            b2[2] = "  593  ";
            b3[2] = "59300";
            b4[2] = "0.0593 ";
            ans[2] = 4;

            q[3] = " Which of the following fractions is equal to 5/6?";
            b1[3] = "  40/54 ";
            b2[3] = "  20/30  ";
            b3[3] = "25/30 ";
            b4[3] = "95/119 ";
            ans[3] = 3;

            q[4] = " If 3x=6x-15 then x + 8=";
            b1[4] = "  5 ";
            b2[4] = "  13    ";
            b3[4] = " -5 ";
            b4[4] = " 3  ";
            ans[4] = 2;
        }
        else if (index == 5){
            index=0;
            x=20000;
            q[0] = "   Which is the greatest number?";
            b1[0] = " 1/4 of 236  ";
            b2[0] = "  1/9 of 504   ";
            b3[0] = "1/16 of 1028";
            b4[0] = " 1/3 of 741 ";
            ans[0] = 4;

            q[1] = "  A man bought a flat for Rs. 8,20,000. He borrowed 55% of this money from a bank. How much money did he borrow from the bank?";
            b1[1] = "   Rs. 4,51,000 ";
            b2[1] = "   Rs. 4,52,000  ";
            b3[1] = " Rs. 4,53,000";
            b4[1] = " Rs. 4,55,000 ";
            ans[1] = 1;

            q[2] = " A primary school had an enrollment of 850 pupils in January 1970. In January 1980 the enrollment was 1,120; What was the percentage increase for the";
            b1[2] = "  33.56% ";
            b2[2] = "  34.76%  ";
            b3[2] = "31.76%";
            b4[2] = "30.55%";
            ans[3] = 3;

            q[4] = " Which number will come next?";
            b1[4] = "  30 ";
            b2[4] = "  28 ";
            b3[4] = "54";
            b4[4] = "48 ";
            ans[4] = 2;

            q[3] = "  If a car is sold for Rs.50000 the profit is 17   percent,   what   would   be   profit percentage if sold for Rs. 47000";
            b1[3] = "  16.20% ";
            b2[3] = "  14.50%  ";
            b3[3] = "14.85%";
            b4[3] = "15.98% ";
            ans[3] = 4;
        }
        else if (index==10){
            index=0;
            x=30000;
            q[0] = " If Logx (1 / 8) = - 3 / 2, then x is equal to  ";
            b1[0] = "  -4 ";
            b2[0] = "  4 ";
            b3[0] = "1/4";
            b4[0] = "10 ";
            ans[0] = 2;

            q[1] = " If the graph of y = f(x) is transformed into the graph of 2y - 6 = - 4 f(x - 3), point (a , b) on the graph of y = f(x) becomes point (A , B) on the graph of 2y - 6 = - 4 f(x - 3) where A and B are given by ";
            b1[1] = "  A = a - 3, B = b  ";
            b2[1] = "  A = a - 3, B = b  ";
            b3[1] = "A = a + 3, B = -2 b ";
            b4[1] = " A = a + 3, B = -2 b +3 ";
            ans[1] = 4;

            q[2] = " When a parabola represented by the equation y - 2x 2 = 8 x + 5 is translated 3 units to the left and 2 units up, the new parabola has its vertex at ";
            b1[2] = "  (-5 , -1)  ";
            b2[2] = "  (-5 , -5) ";
            b3[2] = "(-1 , -3) ";
            b4[2] = "(-2 , -3) ";
            ans[2] = 1;

            q[3] = " The probability that an electronic device produced by a company does not function properly is equal to 0.1. If 10 devices are bought, then the probability, to the nearest thousandth, that 7 devices function properly is ";
            b1[3] = "  0  ";
            b2[3] = "  0.478 ";
            b3[3] = "0.057 ";
            b4[3] = " 0.001 ";
            ans[3] =3;

            q[4] = " When a metallic ball bearing is placed inside a cylindrical container, of radius 2 cm, the height of the water, inside the container, increases by 0.6 cm. The radius, to the nearest tenth of a centimeter, of the ball bearing is ";
            b1[4] = "  1 cm ";
            b2[4] = "  1.2 cm  ";
            b3[4] = "52 cm ";
            b4[4] = "0.6 cm ";
            ans[4] = 2;
        }



        else if(index == 15){
            index=0;
            x=10000;
            q[0] = " Grand Central Terminal, Park Avenue, New York is the world's";
            b1[0] = "  largest railway station ";
            b2[0] = "  highest railway station ";
            b3[0] = "longest railway station";
            b4[0] = "None of the above ";
            ans[0] = 1;

            q[1] = " For which of the following disciplines is Nobel Prize awarded?";
            b1[1] = " Physics and Chemistry ";
            b2[1] = "  Physiology or Medicine ";
            b3[1] = "Literature, Peace and Economics";
            b4[1] = "All of the above ";
            ans[1] = 4;

            q[2] = " Hitler party which came into power in 1933 is known as";
            b1[2] = " Labour Party ";
            b2[2] = "  Nazi Party ";
            b3[2] = "Ku-Klux-Klan";
            b4[2] = "Democratic Party ";
            ans[2] = 2;

            q[3] = " FFC stands for";
            b1[3] = " Foreign Finance Corporation ";
            b2[3] = "  Film Finance Corporation ";
            b3[3] = "Federation of Football Council";
            b4[3] = "None of the above ";
            ans[3] = 2;

            q[4] = "The Battle of Plassey was fought in";
            b1[4] = " 1757";
            b2[4] = " 1782 ";
            b3[4] = "1748";
            b4[4] = "1764";
            ans[4] = 1;

        }
        else if (index==20){
            index=0;
            x=20000;
            q[0] = "The trident-shaped symbol of Buddhism does not represent";
            b1[0] = " Nirvana";
            b2[0] = "  Sangha ";
            b3[0] = "Buddha";
            b4[0] = "Dhamma";
            ans[0] = 1;

            q[1] = " Golf player Vijay Singh belongs to which country?";
            b1[1] = " USA";
            b2[1] = "  UK ";
            b3[1] = "India";
            b4[1] = "Fiji";
            ans[1] = 4;

            q[2] = " Coral reefs in India can be found in";
            b1[2] = " the coast of Orissa";
            b2[2] = "  Rameshwaram";
            b3[2] = "Waltair";
            b4[2] = " Trivandrum ";
            ans[2] = 2;

            q[3] = " The use of Kharoshti in ancient Indian architecture is the result of India's contact with";
            b1[3] = " Central Asia";
            b2[3] = "  Iran";
            b3[3] = "Greece";
            b4[3] = " China ";
            ans[3] = 3;

            q[4] = " The victories of Karikala are well portrayed in";
            b1[4] = " Palamoli";
            b2[4] = "  Aruvanad";
            b3[4] = "	Pattinappalai";
            b4[4] = " Padirrupattu";
            ans[4] = 3;
        }
        else if(index==25){
            index=0;
            x=30000;
            q[0] = " The Indian delegation to the first World Conference on Human Rights was led by";
            b1[0] = " Dr. Manmohan Singh ";
            b2[0] = "  Farooq Abdullah	";
            b3[0] = "	Dinesh singh	";
            b4[0] = " Alam Khan	";
            ans[0] = 1;

            q[1] = "  Todar Mal was associated with";
            b1[1] = " music ";
            b2[1] = "  literature	";
            b3[1] = "	finance	";
            b4[1] = " law	";
            ans[1] = 3;

            q[2] = "  Amnesty International is an organisation associated with which of the following fields?";
            b1[2] = " Protection of Cruelty to animals ";
            b2[2] = "  Environment protection	";
            b3[2] = "	Protection of human rights	";
            b4[2] = " Protection of historic monuments	";
            ans[2] = 3;

            q[3] = " Which one of the following is not related to disarmament?";
            b1[3] = " SALT ";
            b2[3] = "  NPT	";
            b3[3] = "	CTBT	";
            b4[3] = " NATO	";
            ans[3] = 4;

            q[4] = " Wadia Institute of Himalayan Geology is located at";
            b1[4] = " DELHI ";
            b2[4] = "  Shimla	";
            b3[4] = "	DEHRADUN	";
            b4[4] = " KULU	";
            ans[4] = 3;

        }

        else{}

        update();
    }

    public void click1(View View){
        check(1);
    }

    public void click2(View View){
        check(2);
    }

    public void click3(View View){
        check(3);
    }

    public void click4(View View){
        check(4);
    }


    public void check(int i){
        try{
            p.cancel(true);
        }catch (Exception e){

        }
        if(ans[index]==5){
            Intent startNewActivity = new Intent(this, GameSelection.class);

            startActivity(startNewActivity);
            return;
        }


        if(ans[index] == i)
        {
            score++;
            index++;
            count++;
            update();
            final MediaPlayer mpw = MediaPlayer.create(this, R.raw.right);
            mpw.start();

        }

        else{
            index++;
            count++;
            score = score - 0.25f;
            update();
            final MediaPlayer mpw = MediaPlayer.create(this, R.raw.wrong);
            mpw.start();
        }


        if(count == 5){
            TextView t11=(TextView)findViewById(R.id.textView11);
            t11.setText("Thankyou For Taking Quiz Your Final Score is  " + score);
            Button b24=(Button)findViewById(R.id.button24);
            b24.setText("Continue");
            hide(null);
            ans[index]=5;
        }



    }

    public void hide(View v){

        Button b21=(Button)findViewById(R.id.button21);
        b21.setVisibility(View.INVISIBLE);
        Button b22=(Button)findViewById(R.id.button22);
        b22.setVisibility(View.INVISIBLE);
        Button b23=(Button)findViewById(R.id.button23);
        b23.setVisibility(View.INVISIBLE);
        TextView t=(TextView)findViewById(R.id.textView10);
        t.setVisibility(View.INVISIBLE);
    }
    public static pause p;
    public void update(){

        download(null);
        TextView t12=(TextView)findViewById(R.id.textView12);
        t12.setText("Score " + score);
        TextView t10=(TextView)findViewById(R.id.textView10);
        t10.setText("Question" + (count+1));
        TextView t11=(TextView)findViewById(R.id.textView11);
        t11.setText(q[index]);

        Button b21=(Button)findViewById(R.id.button21);
        b21.setText(b1[index]);
        Button b22=(Button)findViewById(R.id.button22);
        b22.setText(b2[index]);
        Button b23=(Button)findViewById(R.id.button23);
        b23.setText(b3[index]);
        Button b24=(Button)findViewById(R.id.button24);
        b24.setText(b4[index]);
        try{
            if(count<5) {
                p = new pause();
                p.execute();
            }
        }catch(Exception e){

        }
    }






    public void download(View view) {
        ProgressBar a=(ProgressBar) findViewById(R.id.progressBar);
        a.setProgress(count);

    }
    public class pause extends AsyncTask<Void,Void,Void> {

        @Override
        protected Void doInBackground(Void... params) {
            try {
                Thread.sleep(x);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if(count<4) {
                index++;
                count++;
                update();
            }else{
                check(5);
            }


        }
    }}