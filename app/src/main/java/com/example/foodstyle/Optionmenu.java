package com.example.foodstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Optionmenu extends AppCompatActivity {


    EditText e1;
    public static String table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optionmenu);
        e1 = findViewById(R.id.editText);
        table = "";
       // String mess=e1.table



    }
    public void veg(View view)
    {
        Intent myIntent = new Intent(Optionmenu.this, Vegitarian.class);
        table = e1.getText().toString();
        myIntent.putExtra("table", table);
        startActivity(myIntent);
    }
    public void nveg(View view)
    {
        Intent myIntent = new Intent(Optionmenu.this, Non_Vegitarian.class);
        table = e1.getText().toString();
        myIntent.putExtra("table", table);
        startActivity(myIntent);
    }
    public void both(View view)
    {
        Intent myIntent = new Intent(Optionmenu.this, Both.class);
        table = e1.getText().toString();
        myIntent.putExtra("table", table);
        startActivity(myIntent);
    }
    public void desert(View view)
    {
        Intent myIntent = new Intent(Optionmenu.this, Desert.class);
        table = e1.getText().toString();
        myIntent.putExtra("table", table);
        startActivity(myIntent);
    }
}
