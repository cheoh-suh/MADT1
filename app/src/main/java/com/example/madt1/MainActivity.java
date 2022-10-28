package com.example.madt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        button.setOnClickListener(View.OnClickListener {
//            textView.setText("Imran Khan")
//        })
    }
    public void onBtnChangeTextClick  (View v)
    {
        TextView tv = (TextView)findViewById(R.id.tvmainlabel);
        tv.setText("Welcome to android");
    }
}