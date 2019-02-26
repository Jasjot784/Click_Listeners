package com.example.click_listener_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="Main_Activity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_submit = findViewById(R.id.Click_Me);

    }
    public void submit(View view) {
        Log.d(TAG, "submit");
    }
}
//This method of applying  click listener is known as On_Click_Attribute
//It is not recommended because it does not provide dynamic cilck listener although it is most easiest way to apply click listener
//onclicklistener is inside View class
// alot of classes can be formed inside a single file
//if we have multiple buttons it is hactic to use 3rd method there we use 2nd ie interfce method we use if else or switch statement instead in on click method