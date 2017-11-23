package com.example.ashish_pc.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ashish_pc.allbook.R;

/**
 * Created by ashish_pc on 2/16/2016.
 */
public class myaccount extends Fragment {


    View rootview;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        rootview = inflater.inflate(R.layout.myaccount_layout, container, false);

        return rootview;
    }



}
