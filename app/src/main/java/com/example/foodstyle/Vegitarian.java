package com.example.foodstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.*;

public class Vegitarian extends AppCompatActivity
{
    static String vitem[]={"Veg_Biriyani","Paneer_Masala","Veg_Noodles","Veg_Fried_Rice","Veg_Manchurian","Masala_Dosai","Veg_Pizza","Veg_Sandwich","Veg_Meals"};
    static int vcount[]={100,70,60,60,65,40,99,105,120};
    static int vqcount[]= new int[9];
    public String table = "NULL";

    public String getVqcount(int i)
    {
        return String.valueOf(vqcount[i]);
    }

    public String getVcount(int i)
    {
        return String.valueOf(vcount[i]);
    }

    public String getVitem(int i)
    {
        return vitem[i];
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegitarian);
        table = getIntent().getStringExtra("table");
    }
    public void ok(View view)
    {
        vqcount[0]+=1;
        MessageSender messageSender=new MessageSender();
        //String meg = "Veg_Biriyani"+Optionmenu.table;

        messageSender.execute("Veg_Biriyani-"+this.table);
    }
    public void ok1(View view)
    {
        vqcount[1]+=1;
        MessageSender messageSender=new MessageSender();
        messageSender.execute("Panner_Masala-"+this.table);
    }
    public void ok2(View view)
    {
        vqcount[2]+=1;
        MessageSender messageSender=new MessageSender();
        messageSender.execute("Veg_Noodles-"+this.table);
    }
    public void ok3(View view)
    {
        vqcount[3]+=1;
        MessageSender messageSender=new MessageSender();
        messageSender.execute("Veg_Fried_Rice-"+this.table);
    }
    public void ok4(View view)
    {
        vqcount[4]+=1;
        MessageSender messageSender=new MessageSender();
        messageSender.execute("Veg_Manchurian-"+this.table);
    }
    public void ok5(View view)
    {
        vqcount[5]+=1;
        MessageSender messageSender=new MessageSender();
        messageSender.execute("Masala_Dosa-"+this.table);
    }
    public void ok6(View view)
    {
        vqcount[6]+=1;
        MessageSender messageSender=new MessageSender();
        messageSender.execute("Veg_Pizza-"+this.table);
    }
    public void ok7(View view)
    {
        vqcount[7]+=1;
        MessageSender messageSender=new MessageSender();
        messageSender.execute("Veg_Sandwich-"+this.table);
    }
    public void ok8(View view)
    {
        vqcount[8]+=1;
        MessageSender messageSender=new MessageSender();
        messageSender.execute("Veg_meals-"+this.table);
    }
    public void vsubmit(View view)
    {
        Intent myIntent = new Intent(Vegitarian.this, submit.class);
        startActivity(myIntent);
    }
}
