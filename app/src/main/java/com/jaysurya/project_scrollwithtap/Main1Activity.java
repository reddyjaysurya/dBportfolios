package com.jaysurya.project_scrollwithtap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Objects;

public class Main1Activity extends AppCompatActivity {

    int chapter_no;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        listView = (ListView) findViewById(R.id.lv_subtitles);

        Intent i = getIntent();
        chapter_no = i.getIntExtra("chapter_no", 1);


        if(chapter_no == 1) {
            ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(Main1Activity.this,
                    android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.Chp1_subtitles));

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(Main1Activity.this, contents.class);
                    intent.putExtra("value", "1");
                    intent.putExtra("Chp1_subtitles", listView.getItemAtPosition(position).toString());
                    startActivity(intent);
                }
            });


            listView.setAdapter(mAdapter);
        }

        if(chapter_no == 2) {
            ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(Main1Activity.this,
                    android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.Chp2_subtitles));

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(Main1Activity.this, contents.class);
                    intent.putExtra("value", "2");
                    intent.putExtra("Chp2_subtitles", listView.getItemAtPosition(position).toString());
                    startActivity(intent);
                }
            });

            listView.setAdapter(mAdapter);
        }
        if(chapter_no == 3) {
            ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(Main1Activity.this,
                    android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.Chp3_subtitles));

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(Main1Activity.this, contents.class);
                    intent.putExtra("value", "3");
                    intent.putExtra("Chp3_subtitles", listView.getItemAtPosition(position).toString());
                    startActivity(intent);
                }
            });

            listView.setAdapter(mAdapter);
        }
        if(chapter_no == 4) {
            ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(Main1Activity.this,
                    android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.Chp4_subtitles));

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(Main1Activity.this, contents.class);
                    intent.putExtra("value", "4");
                    intent.putExtra("Chp4_subtitles", listView.getItemAtPosition(position).toString());
                    startActivity(intent);
                }
            });

            listView.setAdapter(mAdapter);
        }
        if(chapter_no == 5) {
            ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(Main1Activity.this,
                    android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.Chp5_subtitles));

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(Main1Activity.this, contents.class);
                    intent.putExtra("value", "5");
                    intent.putExtra("Chp5_subtitles", listView.getItemAtPosition(position).toString());
                    startActivity(intent);
                }
            });

            listView.setAdapter(mAdapter);
        }
    }
}