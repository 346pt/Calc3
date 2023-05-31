package com.example.calc3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText digit1 = findViewById(R.id.first_digit1);
        EditText digit2 = findViewById(R.id.second_digit1);
        Button btn = findViewById(R.id.btn1);

        btn.setOnClickListener(view -> {
        Intent intent = new Intent(
                MainActivity.this,
                ResultActivity.class);
        intent.putExtra("first", digit1.getText().toString());
        intent.putExtra("second", digit2.getText().toString());
        startActivity(intent);

    });
}
}