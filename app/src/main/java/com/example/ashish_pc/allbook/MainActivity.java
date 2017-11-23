package com.example.ashish_pc.allbook;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DialerFilter;
import android.widget.EditText;

public class MainActivity extends Activity{
    Button b1,b2,b3,b4;
    EditText e1,e2,e3,e4,e5,e6;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
    }

    public void login(View v)
    {
        View view = (LayoutInflater.from(MainActivity.this)).inflate(R.layout.entrylayout,null);
        AlertDialog.Builder alertbuilder = new AlertDialog.Builder(MainActivity.this);
        alertbuilder.setView(view);
        alertbuilder.setCancelable(true);
        Dialog dialog = alertbuilder.create();
        dialog.show();
    }

    public void register(View v)
    {
        View view = (LayoutInflater.from(MainActivity.this)).inflate(R.layout.registerlayout,null);
        AlertDialog.Builder alertbuilder = new AlertDialog.Builder(MainActivity.this);
        alertbuilder.setView(view);
        e3 = (EditText)view.findViewById(R.id.editText3);
        e4 = (EditText)view.findViewById(R.id.editText4);
        e5 = (EditText)view.findViewById(R.id.editText5);
        e6 = (EditText)view.findViewById(R.id.editText6);
        b4 = (Button)findViewById(R.id.button4);
        alertbuilder.setCancelable(true);
        dialog = alertbuilder.create();
        dialog.show();
    }

    public void enter(View v)
    {

        Intent i = new Intent("com.example.ashish_pc.allbook.Main2Activity");
        startActivity(i);
        //dialog.dismiss();
    }

    public void enter2(View v)
    {

        Intent i = new Intent("com.example.ashish_pc.allbook.Main2Activity");
        startActivity(i);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this);
        builder.setSmallIcon(R.drawable.team2);
        builder.setContentTitle("AllBook");
        builder.setContentText("registered successfully.AllBook welcomes you.");
        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(0,builder.build());
       //dialog.dismiss();
    }


}
