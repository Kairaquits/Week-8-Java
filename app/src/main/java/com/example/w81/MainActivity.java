package com.example.w81;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText field1;
    private EditText field2;
    private EditText field3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);
        field1 = findViewById(R.id.inputField1);
        field2 = findViewById(R.id.inputField2);
        field3 = findViewById(R.id.Result);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void Add(View view){
        double n1 = Double.parseDouble(field1.getText().toString());
        double n2 = Double.parseDouble(field2.getText().toString());
        double result = n1+n2;

        field3.setText(String.valueOf(result));

    }

    public void Subtract(View view){
        double n1 = Double.parseDouble(field1.getText().toString());
        double n2 = Double.parseDouble(field2.getText().toString());
        double result = n1-n2;

        field3.setText(String.valueOf(result));

    }
    public void Multiply(View view){
        double n1 = Double.parseDouble(field1.getText().toString());
        double n2 = Double.parseDouble(field2.getText().toString());
        double result = n1*n2;

        field3.setText(String.valueOf(result));

    }

    public void Division(View view){
        double n1 = Double.parseDouble(field1.getText().toString());
        double n2 = Double.parseDouble(field2.getText().toString());

        if (n2==0){
            field3.setText("Cannot divide by 0");
            return;
        }
        double result = n1/n2;
        field3.setText(String.valueOf(result));
    }
}