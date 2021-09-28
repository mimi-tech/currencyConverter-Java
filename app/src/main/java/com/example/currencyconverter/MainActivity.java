package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonConvert (View view){
        EditText amountText = (EditText) findViewById(R.id.amountText);
        Log.i("info", "ok i m working");

        Log.i("Values", amountText.getText().toString());
        String amountPounds = amountText.getText().toString();
        double amountPoundsDouble = Double.parseDouble(amountPounds);
        double amountDollar = amountPoundsDouble * 1.3;
        String amountDollarsString = String.format("%.2f", amountDollar);
        Toast.makeText(this, "Amount = " + amountDollarsString , Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
