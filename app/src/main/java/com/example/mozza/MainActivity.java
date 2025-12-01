package com.example.mozza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);

        LinearLayout dish1 = findViewById(R.id.dish1);
        LinearLayout dish2 = findViewById(R.id.dish2);
        LinearLayout dish3 = findViewById(R.id.dish3);

        //titles
        TextView txt1 = findViewById(R.id.txt1);
        String t1 = txt1.getText().toString().trim();

        TextView txt2 = findViewById(R.id.txt2);
        String t2 = txt1.getText().toString().trim();

        TextView txt3 = findViewById(R.id.txt3);
        String t3 = txt1.getText().toString().trim();

        //imgs
        int imgRes1 = R.drawable.pizza_margherita;
        int imgRes2 = R.drawable.pasta_carbonara;
        int imgRes3 = R.drawable.tiramisu;

        //paragraphs
        TextView para1 = findViewById(R.id.p1);
        String p1 = para1.getText().toString().trim();

        TextView para2 = findViewById(R.id.p2);
        String p2 = para1.getText().toString().trim();

        TextView para3 = findViewById(R.id.p3);
        String p3 = para1.getText().toString().trim();

        dish1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MargheritaActivity.class);
            startActivity(intent);
        });

        dish2.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this, CarbonaraActivity.class);
            startActivity(intent);
        });

        dish3.setOnClickListener(v ->{
                    Intent intent = new Intent(MainActivity.this, TiramisuActivity.class);
                    startActivity(intent);
                }
        );
    }
}
