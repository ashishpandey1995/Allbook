package com.example.ashish_pc.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ashish_pc.allbook.R;
import com.example.ashish_pc.allbook.product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashish_pc on 2/15/2016.
 */
public class fragmentfour extends Fragment {

    GridView gv;
    ImageView im;
    ImageButton b1;
    TextView tv1,tv2;
    View rootview;
    private List<product> offerdata = new ArrayList<product>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        rootview = inflater.inflate(R.layout.fragment_four, container, false);

        populatelist();
        populatelistview();
      //  clickcall();

        return rootview;
    }




    private void clickcall()
    {
        gv=(GridView)rootview.findViewById(R.id.gridv1);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent("com.example.ashish_pc.allbook.Detail");
                startActivity(i);
            }
        });
    }

    private void populatelist()
    {
        offerdata.add(new product("two-states","chetan bhagat iit bombay",250,"30%",R.drawable.booksex1));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex2));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex1));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex2));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex1));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex1));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex2));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex1));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex2));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex1));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex1));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex2));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex1));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex2));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex1));
    }

    private void populatelistview()
    {
        ArrayAdapter<product> adapter = new Mylistadapter();
        gv=(GridView)rootview.findViewById(R.id.gridv1);
        gv.setAdapter(adapter);
    }


    private class Mylistadapter extends ArrayAdapter<product>
    {
        public Mylistadapter()
        {
            super(getActivity(),R.layout.usedbookslayout,offerdata);
        }

        public View getView(int position,View convertView,ViewGroup parent)
        {
            View itemview = convertView;
            if(itemview==null)
            {
                itemview=((Activity)getContext()).getLayoutInflater().inflate(R.layout.usedbookslayout,parent,false);

            }
            product currentpro = offerdata.get(position);

            im = (ImageView)itemview.findViewById(R.id.imageView3);
            im.setImageResource(currentpro.getid());
            tv1 = (TextView)itemview.findViewById(R.id.textView4);
            tv1.setText(""+currentpro.getname());
            tv2 = (TextView)itemview.findViewById(R.id.textView8);
            tv2.setText(""+currentpro.getprice());

            return itemview;
        }




    }

}
