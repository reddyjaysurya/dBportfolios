package com.jaysurya.project_scrollwithtap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    CardView chap1,chap2,chap3,chap4,chap5;
    int chapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chap1 = findViewById(R.id.chap1);
        chap2 = findViewById(R.id.chap2);
        chap3 = findViewById(R.id.chap3);
        chap4 = findViewById(R.id.chap4);
        chap5 = findViewById(R.id.chap5);


        chap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter = 1;
                openchapters(chapter);
            }
        });
        chap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter = 2;
                openchapters(chapter);
            }
        });
        chap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter = 3;
                openchapters(chapter);
            }
        });
        chap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter = 4;
                openchapters(chapter);
            }
        });
        chap5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter = 5;
                openchapters(chapter);
            }
        });

    }
    private void openchapters(int chapter){
        Intent intent = new Intent(this, Main1Activity.class);
        intent.putExtra("chapter_no",chapter);
        startActivity(intent);
    }
}
