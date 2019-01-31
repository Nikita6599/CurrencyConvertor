package com.example.nikita.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ClickFunction(View v){
        EditText Textfield=(EditText)findViewById(R.id.Textfield);
        Double rs=Double.parseDouble(Textfield.getText().toString());
        Double dollar=rs*0.015;
        Toast.makeText(MainActivity.this, "$"+dollar.toString(), Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
