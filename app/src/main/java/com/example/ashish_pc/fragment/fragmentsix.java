package com.example.ashish_pc.fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ashish_pc.allbook.R;

/**
 * Created by ashish_pc on 2/15/2016.
 */
public class fragmentsix extends Fragment {

    View rootview;
    Button b1,b2,b3,b4,b5;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        rootview = inflater.inflate(R.layout.fragment_six, container, false);
        b1 = (Button)rootview.findViewById(R.id.but3);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                View v1 = (LayoutInflater.from(getActivity())).inflate(R.layout.helpdialog,null);
                AlertDialog.Builder alertbuilder = new AlertDialog.Builder(getActivity());
                alertbuilder.setView(v1);
                alertbuilder.setCancelable(true);
                Dialog dialog = alertbuilder.create();
                dialog.setTitle("How to sell product?");
                dialog.show();

            }
        });

        b2 = (Button)rootview.findViewById(R.id.but4);
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                View v1 = (LayoutInflater.from(getActivity())).inflate(R.layout.returndialog,null);
                AlertDialog.Builder alertbuilder = new AlertDialog.Builder(getActivity());
                alertbuilder.setView(v1);
                alertbuilder.setCancelable(true);
                Dialog dialog = alertbuilder.create();
                dialog.setTitle("How to return product?");
                dialog.show();

            }
        });

        b3 = (Button)rootview.findViewById(R.id.but5);
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                View v1 = (LayoutInflater.from(getActivity())).inflate(R.layout.canceldialog,null);
                AlertDialog.Builder alertbuilder = new AlertDialog.Builder(getActivity());
                alertbuilder.setView(v1);
                alertbuilder.setCancelable(true);
                Dialog dialog = alertbuilder.create();
                dialog.setTitle("How to cancel product?");
                dialog.show();

            }
        });

        b4 = (Button)rootview.findViewById(R.id.but6);
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                View v1 = (LayoutInflater.from(getActivity())).inflate(R.layout.timedialog,null);
                AlertDialog.Builder alertbuilder = new AlertDialog.Builder(getActivity());
                alertbuilder.setView(v1);
                alertbuilder.setCancelable(true);
                Dialog dialog = alertbuilder.create();
                dialog.setTitle("Time to deliver the product and charges?");
                dialog.show();

            }
        });


        b5 = (Button)rootview.findViewById(R.id.but16);
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                View v1 = (LayoutInflater.from(getActivity())).inflate(R.layout.rentbookdialog,null);
                AlertDialog.Builder alertbuilder = new AlertDialog.Builder(getActivity());
                alertbuilder.setView(v1);
                alertbuilder.setCancelable(true);
                Dialog dialog = alertbuilder.create();
                dialog.setTitle("What is books on rent?");
                dialog.show();

            }
        });

        return rootview;
    }




}
