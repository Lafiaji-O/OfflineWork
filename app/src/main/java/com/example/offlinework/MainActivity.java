package com.example.offlinework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void buttonClick (View view) {

        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);

        EditText currencyText = (EditText) findViewById(R.id.currencyText);

        Double amount = Double.parseDouble(currencyText.getText().toString());

        Double value = amount * 0.85 ;

        Log.i("Username", editText.getText().toString());
        Log.i("Password", editText2.getText().toString());

        Log.i("The amount is", value.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
