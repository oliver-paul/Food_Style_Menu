package com.example.foodstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Desert extends AppCompatActivity {

    static String ditem[]={"Mint_Oreo","Gooey_Brownies","Dark_Chocolate","Strawberry","Creamed_Donuts","Blueberry","Tiramisu","Mint_White_chocolate","Peach_pie"};
    static int dcount[]={95,90,30,40,85,55,100,135,100};
    static int dqcount[]= new int[9];
    public String table;

    public int getdqcount(int i){
        return dqcount[i];
    }

    public int getdcount(int i){
        return dcount[i];
    }

    public String getditem(int i)
    {
        return ditem[i];
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);
        table = getIntent().getStringExtra("table");
    }
    public void dok(View view) {
        dqcount[0]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Mint_Oero"+table);

    }

    public void dok2(View view) {
        dqcount[1]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Dark_Chocolate"+table);
    }

    public void dok1(View view) {
        dqcount[2]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Gooey_Brownies"+table);
    }

    public void dok3(View view) {
        dqcount[3]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Strawberry"+table);
    }

    public void dok4(View view) {
        dqcount[4]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Creamed_Donuts-"+table);
    }

    public void dok5(View view) {
        dqcount[5]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Blueberry-"+table);
    }

    public void dok6(View view) {
        dqcount[6]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Tiramisu-"+table);
    }

    public void dok7(View view) {
        dqcount[7]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Mint_White_cholate-"+table);
    }

    public void dok8(View view) {
        dqcount[8]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Peach_Pie-"+table);
    }
    public void dsubmit(View view)
    {
        Intent myIntent = new Intent(Desert.this, submit.class);
        startActivity(myIntent);
    }
}
