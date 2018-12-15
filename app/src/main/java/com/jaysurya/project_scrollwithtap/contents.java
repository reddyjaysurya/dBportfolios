package com.jaysurya.project_scrollwithtap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class contents extends AppCompatActivity {

    TextView tv;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contents);

        tv = (TextView) findViewById(R.id.titleWindow);


        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        value = bundle.getString("value","1");
        if (value.equals("1")) {
            tv.setText(bundle.getString("Chp1_subtitles"));
        }
        if (value.equals("2")) {
            tv.setText(bundle.getString("Chp2_subtitles"));
        }
        if (value.equals("3")) {
            tv.setText(bundle.getString("Chp3_subtitles"));
        }
        if (value.equals("4")) {
            tv.setText(bundle.getString("Chp4_subtitles"));
        }
        if (value.equals("5")) {
            tv.setText(bundle.getString("Chp5_subtitles"));
        }

    }
}
