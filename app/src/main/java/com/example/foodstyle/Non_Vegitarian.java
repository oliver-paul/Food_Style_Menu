package com.example.foodstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.*;

public class Non_Vegitarian extends AppCompatActivity
{
    static String nvitem[]={"Chicken_Biriyani","Mutton_Biriyani","Chicken_Noodles","Chicken_Fried_Rice","Chicken_Manchurian","Chicken_65","Chicken_Lollipop","Non_Veg_Meals","Fish_Biriyani"};
    static int nvcount[]={110,80,70,70,75,50,109,115,130};
    static int nvqcount[]= new int[9];
    public String table;

    public int getnvqcount(int i){
        return nvcount[i];
    }

    public int getnvcount(int i){
        return nvqcount[i];
    }

    public String getnvitem(int i)
    {
        return nvitem[i];
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non__vegitarian);
        table = getIntent().getStringExtra("table");
    }


    public void nok(View view) {
        nvqcount[0]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Chicken_Briyani-"+this.table);

    }

    public void nok2(View view) {
        nvqcount[1]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Chicken_Noodles-"+this.table);
    }

    public void nok1(View view) {
        nvqcount[2]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Mutton_Biriyani-"+this.table);
    }

    public void nok3(View view) {
        nvqcount[3]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Chicken_Fried_Rice-"+this.table);
    }

    public void nok4(View view) {
        nvqcount[4]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Chicken_Manchurian-"+this.table);
    }

    public void nok5(View view) {
        nvqcount[5]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Chicken_65-"+this.table);
    }

    public void nok6(View view) {
        nvqcount[6]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Chicken_Lollipop-"+this.table);
    }

    public void nok7(View view) {
        nvqcount[7]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Non_veg_Meals-"+this.table);
    }

    public void nok8(View view) {
        nvqcount[8]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Fish_Briyani-"+this.table);
    }
    public void nvsubmit(View view)
    {
        Intent myIntent = new Intent(Non_Vegitarian.this, submit.class);
        startActivity(myIntent);
    }
}

