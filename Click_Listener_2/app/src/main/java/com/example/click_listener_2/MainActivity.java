package com.example.click_listener_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {//as soon as we write implements error comes which can be removed by using abstract class
    //or by making onClick method
   private static final String TAG = "Main_Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_submit = findViewById(R.id.Click_Me);
        button_submit.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "Submit");//this is second way to remove error
    }
}
//this is interface method and 2nd method to implement click listener.It is greatly method