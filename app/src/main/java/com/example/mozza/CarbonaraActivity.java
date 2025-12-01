package com.example.mozza;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CarbonaraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carbonara);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(CarbonaraActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
