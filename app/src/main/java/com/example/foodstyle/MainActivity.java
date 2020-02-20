package com.example.foodstyle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3500;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.Adapter mAdapter;
        RecyclerView.LayoutManager mLayoutManager;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent home=new Intent(MainActivity.this, Optionmenu.class);
                startActivity(home);
                finish();
            }
        },SPLASH_TIME_OUT);
        Toast.makeText(this, "WELCOME", Toast.LENGTH_SHORT).show();
    }
}
