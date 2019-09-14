package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CodeActivity extends AppCompatActivity {



    String[] password = new String[4];
    int counter= 0;
    String p="";
    String correct = "1234";
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button submit;
    TextView changeMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        button1 = findViewById(R.id.num1);
        button2 = findViewById(R.id.num2);
        button3 = findViewById(R.id.num3);
        button4 = findViewById(R.id.num4);
        submit = findViewById(R.id.submitbutton);
        //passcode=findViewById(R.id.passcode);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password[counter]="1";
                counter++;

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password[counter]="2";
                counter++;
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password[counter]="3";
                counter++;
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password[counter]="4";
                counter++;
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCode();
            }
        });



    }
    public void checkCode(){
        for(int x=0;x<4;x++){
            p+=password[x];
        }

        if(p.equals("1234")){
            correctCode();
        }
        else{
            incorrectCode();
        }
    }
    public void correctCode(){

        Intent intent =new Intent(this,Main2Activity.class);
         startActivity(intent);


    }
    public void incorrectCode(){
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
    }




}
