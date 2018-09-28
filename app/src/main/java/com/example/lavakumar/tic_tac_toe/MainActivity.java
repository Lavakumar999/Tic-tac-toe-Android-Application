package com.example.lavakumar.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int turn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button1);
         btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
         btn4 = (Button) findViewById(R.id.button4);
         btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
         btn8 = (Button) findViewById(R.id.button8);
         btn9 = (Button) findViewById(R.id.button9);
        turn=1;
        final ImageView imgTop = (ImageView) findViewById(R.id.imgtop);
        final ImageView imgdown1 = (ImageView) findViewById(R.id.imgStarTwo1);
        final ImageView imgdown2 = (ImageView) findViewById(R.id.imgStarTwo2);
        //Code for TIC TAC TOE game

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(btn1.getText().toString().equals("")) {
                        if (turn == 1) {
                            turn = 2;
                            btn1.setText("X");
                        }
                        else if(turn==2) {
                            turn=1;
                            btn1.setText("O");
                        }
                    }
                check();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn2.setText("X");
                    }
                    else if(turn==2) {
                        turn=1;
                        btn2.setText("O");
                    }
                }
                check();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn3.setText("X");
                    }
                    else if(turn==2) {
                        turn=1;
                        btn3.setText("O");
                    }
                }
                check();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn4.setText("X");
                    }
                    else if(turn==2) {
                        turn=1;
                        btn4.setText("O");
                    }
                }
                check();

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn5.setText("X");
                    }
                    else if(turn==2) {
                        turn=1;
                        btn5.setText("O");
                    }
                }
                check();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn6.setText("X");
                    }
                    else if(turn==2) {
                        turn=1;
                        btn6.setText("O");
                    }
                }
                check();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn7.setText("X");
                    }
                    else if(turn==2) {
                        turn=1;
                        btn7.setText("O");
                    }
                }
                check();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn8.setText("X");
                    }
                    else if(turn==2) {
                        turn=1;
                        btn8.setText("O");
                    }
                }
                check();

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn9.setText("X");
                    }
                    else if(turn==2) {
                        turn=1;
                        btn9.setText("O");
                    }
                }
                check();
            }
        });

        //AnimationCode Starts Here
        final Animation animImage= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation_star);
        animImage.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                imgTop.startAnimation(animImage);
                imgdown1.startAnimation(animImage);
                imgdown2.startAnimation(animImage);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imgTop.startAnimation(animImage);
                imgdown1.startAnimation(animImage);
                imgdown2.startAnimation(animImage);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        imgTop.startAnimation(animImage);
        imgdown1.startAnimation(animImage);
        imgdown2.startAnimation(animImage);

    }
    //Check Function
    public void check() {
        String b1,b2,b3,b4,b5,b6,b7,b8,b9;
        b1 = "" + btn1.getText();
        b2 = "" + btn2.getText();
        b3 = "" + btn3.getText();
        b4 = "" + btn4.getText();
        b5 = "" + btn5.getText();
        b6 = "" + btn6.getText();
        b7 = "" + btn7.getText();
        b8 = "" + btn8.getText();
        b9 = "" + btn9.getText();
        if ((b1.equals(b2) && b1.equals(b3)) && b1.equals("O") || (b1.equals(b2) && b1.equals(b3)) && b1.equals("X")) {
            String ans = "" + btn1.getText();
            Toast.makeText(MainActivity.this, "Game complete \"+ans+\" wins", Toast.LENGTH_LONG).show();


        }
        if ((b4.equals(b5) && b4.equals(b6)) && b4.equals("O") || (b4.equals(b5) && b4.equals(b6)) && b4.equals("X")) {
            String ans = "" + btn4.getText();
            Toast.makeText(MainActivity.this, "Game complete \"+ans+\" wins", Toast.LENGTH_LONG).show();


        }
        if ((b7.equals(b8) && b7.equals(b9)) && b7.equals("O") || (b7.equals(b8) && b7.equals(b9)) && b7.equals("X")) {
            String ans = "" + btn7.getText();
            Toast.makeText(MainActivity.this, "Game complete \"+ans+\" wins", Toast.LENGTH_LONG).show();


        }
        if ((b1.equals(b4) && b1.equals(b7)) && b1.equals("O") || (b1.equals(b4) && b1.equals(b7)) && b1.equals("X")) {
            String ans = "" + btn1.getText();
            Toast.makeText(MainActivity.this, "Game complete \"+ans+\" wins", Toast.LENGTH_LONG).show();


        }
        if ((b2.equals(b5) && b2.equals(b8)) && b2.equals("O") || (b2.equals(b5) && b2.equals(b8)) && b2.equals("X")) {
            String ans = ""+btn2.getText();
            Toast.makeText(MainActivity.this, "Game complete \"+ans+\" wins", Toast.LENGTH_LONG).show();

        }
        if ((b3.equals(b6) && b3.equals(b9)) && b3.equals("O") || (b3.equals(b6) && b3.equals(b9)) && b3.equals("X")) {
            String ans = "" + btn3.getText();
            Toast.makeText(MainActivity.this, "Game complete \"+ans+\" wins", Toast.LENGTH_LONG).show();

        }
        if ((b1.equals(b5) && b1.equals(b9)) && b1.equals("O") || (b1.equals(b5) && b1.equals(b9)) && b1.equals("X")) {
            String ans = "" + btn1.getText();
            Toast.makeText(MainActivity.this, "Game complete \"+ans+\" wins", Toast.LENGTH_LONG).show();


        }
        if ((b7.equals(b5) && b7.equals(b3)) && b7.equals("O") || (b7.equals(b5) && b7.equals(b3)) && b7.equals("X")) {
            String ans = "" + btn7.getText();
            Toast.makeText(MainActivity.this, "Game complete \"+ans+\" wins", Toast.LENGTH_LONG).show();

        }
    }
}


