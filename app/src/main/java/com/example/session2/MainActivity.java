package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText emailInput = findViewById(R.id.emailInput);
        EditText passInput = findViewById(R.id.passInput);

        RadioButton female = findViewById(R.id.femaleRadio);
        RadioButton male = findViewById(R.id.maleRadio);

        SwitchCompat subscribe = findViewById(R.id.subscribeSwitch);
        CheckBox agree = findViewById(R.id.agreeCheck);
        Button submitBtn = findViewById(R.id.submitButton);

        submitBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(emailInput.getText().toString().isEmpty()){
                    Log.d("empty field", "Input email");
                }
            }
        });
    }
}