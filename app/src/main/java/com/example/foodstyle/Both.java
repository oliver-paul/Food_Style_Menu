package com.example.foodstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Both extends AppCompatActivity
{

    static String bitem[]={"Veg_Meals","Chicken_Meals","Veg_Biriyani","Chicken_Biriyani","Veg_Noodles","Chicken_Noodles","Veg_Fried_Rice","Chicken_Fried_Rice","Chicken_Roast"};
    static int bcount[]={90,75,75,80,70,60,119,110,125};
    static int bqcount[]= new int[9];
    public String table;
    public int getbqcount(int i){
        return bcount[i];
    }

    public int getbcount(int i){
        return bqcount[i];
    }

    public String getbitem(int i)
    {
        return bitem[i];
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_both);
        table = getIntent().getStringExtra("table");
    }
    public void bok(View view) {
        bqcount[0]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Veg_Meals-"+table);
    }

    public void bok2(View view) {
        bqcount[1]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Veg_Biriyani-"+table);
    }

    public void bok1(View view) {
        bqcount[2]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Non_Veg_Meals-"+table);
    }

    public void bok3(View view) {
        bqcount[3]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Chicken_Biriyani-"+table);
    }

    public void bok4(View view) {
        bqcount[4]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Veg_Noodles-"+table);
    }

    public void bok5(View view) {
        bqcount[5]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Chicken_Noodles-"+table);
    }

    public void bok6(View view) {
        bqcount[6]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Veg_Fried_Rice-"+table);
    }

    public void bok7(View view) {
        bqcount[7]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Chicken_Fried_Rice-"+table);
    }

    public void bok8(View view) {
        bqcount[8]+=1;
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Chicken_Roast-"+table);
    }
    public void bsubmit(View view)
    {
        Intent myIntent = new Intent(Both.this, submit.class);
        startActivity(myIntent);
    }
}
