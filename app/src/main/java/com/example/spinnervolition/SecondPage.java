package com.example.spinnervolition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {
   TextView showText1,showText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        showText1= findViewById(R.id.SecondPageText);
        showText2= findViewById(R.id.SecondPageText2);

        Bundle bundle = getIntent().getExtras();
        String Country = bundle.getString("value1");
        String Coffee = bundle.getString("value2");
        showText1.setText("Your Country is : "+Country);
        showText2.setText("Your Country Popular Coffee is : "+Coffee);


    }
}