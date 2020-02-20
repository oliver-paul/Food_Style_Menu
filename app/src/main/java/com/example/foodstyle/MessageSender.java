package com.example.foodstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.*;
import android.widget.Toast;

import java.net.*;
import java.io.*;

public class MessageSender extends AsyncTask<String,Void,Void>
{
    Socket s;
    DataOutputStream dos;
    PrintWriter pw;

    @Override
    protected Void doInBackground(String... voids)
    {
        String messange = voids[0];
        try
        {
            //Toast.makeText(this, "WELCOME", Toast.LENGTH_SHORT).show();
            s=new Socket("192.168.43.152",7800);
            pw=new PrintWriter(s.getOutputStream());
            pw.write(messange);
            pw.flush();
            pw.close();
            s.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}