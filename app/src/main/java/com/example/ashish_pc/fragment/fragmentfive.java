package com.example.ashish_pc.fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ashish_pc.allbook.R;

/**
 * Created by ashish_pc on 2/15/2016.
 */
public class fragmentfive extends Fragment {

    View rootview;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        rootview = inflater.inflate(R.layout.fragment_five, container, false);

        return rootview;
    }
}
