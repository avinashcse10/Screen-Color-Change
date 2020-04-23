package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean iscolor_button1=true;
    boolean iscolor_button2=true;
    boolean iscolor_button3=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onStart(){
        super.onStart();
        final Button button1 = findViewById(R.id.Button1);
        final Button button2 = findViewById(R.id.Button2);
        final Button button3 = findViewById(R.id.Button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(iscolor_button1) {
                    button1.setBackgroundColor(Color.RED);
                    iscolor_button1 = false;
                }else{
                    button1.setBackgroundColor(Color.TRANSPARENT);
                    iscolor_button1=true;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iscolor_button2) {
                    button2.setBackgroundColor(Color.YELLOW);
                    iscolor_button2 = false;
                }else{
                    button2.setBackgroundColor(Color.CYAN);
                    iscolor_button2=true;
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iscolor_button3){
                    button3.setBackgroundColor(Color.GREEN);
                    iscolor_button3=false;
                }else{
                    button3.setBackgroundColor(Color.GRAY);
                    iscolor_button3=true;
                }
            }
        });
       // if((!iscolor_button1)&&(!iscolor_button2)&&(!iscolor_button3)){
         //   Toast.makeText(this,"You Clicked all the button atleast once",Toast.LENGTH_SHORT).show();
        //}
    }
}
