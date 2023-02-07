package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declaring Widgets
     EditText editText;
     TextView textview, textView2, textView4, valueinPounds;
     Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Instantiating Widgets
        textview = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        valueinPounds = findViewById(R.id.valueOfPounds);

        editText = findViewById(R.id.editTextNumber);

        button = findViewById(R.id.button);


        // Adding A Click event for button (Executing the convert method when clicked)
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // Calling ConvertFromKiloToPounds Method

                ConvertFromKiloToPound ();

            }
        });



    }

     private void ConvertFromKiloToPound() {
        // This method will convert the value entered in editText
        // From Kilo to pounds

            String valueEnteredinKILO = editText.getText().toString();

          //  converting string to number
        double Kilo = Double.parseDouble(valueEnteredinKILO);

        //  converting kilo to pounds formula

         double pounds = Kilo * 2.205;

         // Displaying the value resulted in textView
         valueinPounds.setText("" + pounds);
    }
}