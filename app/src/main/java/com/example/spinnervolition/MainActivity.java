package com.example.spinnervolition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] CountryNames;
    String[] CoffeeNames;
    Spinner countrySpinner;
    Button submitBtn;
    TextView popular;
    String coffee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountryNames=getResources().getStringArray(R.array.Country);
        CoffeeNames=getResources().getStringArray(R.array.Coffee);

        countrySpinner=(Spinner) findViewById(R.id.CountrySpinner);
        submitBtn=(Button) findViewById(R.id.SubmitBtn);
        popular=findViewById(R.id.popular);


        ArrayAdapter<String> countryAdapter=new ArrayAdapter<String>(this,R.layout.sample_view_country,R.id.textViewSampleId,CountryNames);
        countrySpinner.setAdapter(countryAdapter);


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             //  String coffee=coffeeSpinner.getSelectedItem().toString();
                String country=countrySpinner.getSelectedItem().toString();
                if(country.equals("America"))
                {
                    coffee="Nescafe Extrafort";

                }
                else if(country.equals("Bangladesh"))
                {
                    coffee="Nescafe";

                }
                else if(country.equals("Canada"))
                {
                    coffee="David of";

                }  else if(country.equals("Denmark"))
                {
                    coffee="Espresso";

                }  else if(country.equals("England"))
                {
                    coffee="Cold brew";

                }  else if(country.equals("France"))
                {
                    coffee="Latte";

                }
                 else if(country.equals("Ghana"))
                {
                    coffee="Hot Chocolate";

                }

               Intent intent=new Intent(getApplicationContext(),SecondPage.class);
               intent.putExtra("value1",country);
               intent.putExtra("value2",coffee);
               startActivity(intent);
            }
        });


    }
}