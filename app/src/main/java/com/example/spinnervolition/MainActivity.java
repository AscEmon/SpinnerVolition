package com.example.spinnervolition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] CountryNames;
    String[] CoffeeNames;
    Spinner countrySpinner,coffeeSpinner;
    Button submitBtn;
    TextView CoffeeAndCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountryNames=getResources().getStringArray(R.array.Country);
        CoffeeNames=getResources().getStringArray(R.array.Coffee);

        coffeeSpinner=(Spinner) findViewById(R.id.CoffeeSpinner);
        countrySpinner=(Spinner) findViewById(R.id.CountrySpinner);
        submitBtn=(Button) findViewById(R.id.SubmitBtn);
        CoffeeAndCountry=(TextView) findViewById(R.id.CountryAndCoffeeText);

        ArrayAdapter<String> countryAdapter=new ArrayAdapter<String>(this,R.layout.sample_view_country,R.id.textViewSampleId,CountryNames);
        countrySpinner.setAdapter(countryAdapter);
        ArrayAdapter<String> coffeeAdapter=new ArrayAdapter<String>(this,R.layout.sample_view_coffee,R.id.textViewSampleId2,CoffeeNames);
        coffeeSpinner.setAdapter(coffeeAdapter);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String country=countrySpinner.getSelectedItem().toString();
                String coffee=coffeeSpinner.getSelectedItem().toString();
                CoffeeAndCountry.setText("Country is : "+country+"\n\nCoffee is : "+coffee);
            }
        });


    }
}