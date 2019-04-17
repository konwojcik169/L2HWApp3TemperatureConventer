package com.example.temperatureconventer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton rb1, rb2;
    EditText et1, et2;
    TextView tv1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = findViewById(R.id.radioButton);
        rb2 = findViewById(R.id.radioButton2);
        et1 = findViewById(R.id.editText);
        et2 = findViewById(R.id.editText2);
        tv1 = findViewById(R.id.textView);
        b1 = findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
    }

    public void calculate(){
        if (rb1.isChecked()) {
            float C = Float.parseFloat(et1.getText().toString());
            //float F = Float.parseFloat(et2.getText().toString());
            float result = (C * 9/5 +32);
            tv1.setText("Celcius -> Fahrenheit = " + String.valueOf(result));
        } else {
            //float C = Float.parseFloat(et1.getText().toString());
            float F = Float.parseFloat(et2.getText().toString());
            float result = ((F - 32) * 5/9);
            tv1.setText("Fahrenheit -> Celcius = " + String.valueOf(result));
        }
    }

    @Override
    public void onClick(View v) {

    }
}
