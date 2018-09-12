package com.androidgits.foregroundservices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextDisplay extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_display);

        textView = (TextView) findViewById(R.id.textview_result);

        Bundle bundle = getIntent().getExtras();
        String result = bundle.getString("DATA");

        textView.setText(result);

    }
}
