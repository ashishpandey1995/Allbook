package com.example.ashish_pc.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ashish_pc.allbook.R;
import com.example.ashish_pc.allbook.product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashish_pc on 2/14/2016.
 */
public class fragmentthird extends android.app.Fragment{

    ImageView im;
    TextView tv1,tv2,tv3,tv4;
    View rootview;
    private List<product> offerdata = new ArrayList<product>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        rootview = inflater.inflate(R.layout.fragment_third, container, false);

        populatelist();
        populatelistview();
      //  clickcall();


        return rootview;
    }

    private void clickcall()
    {
        ListView lv=(ListView)rootview.findViewById(R.id.listView4);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent("com.example.ashish_pc.allbook.Detail");
                startActivity(i);
            }
        });
    }

    private void populatelist()
    {
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
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex1));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex2));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex1));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex2));
        offerdata.add(new product("two-states","chetan bhagat",250,"30%",R.drawable.booksex1));
    }

    private void populatelistview()
    {
        ArrayAdapter<product> adapter = new Mylistadapter();
        ListView lv=(ListView)rootview.findViewById(R.id.listView4);
        lv.setAdapter(adapter);
    }


    private class Mylistadapter extends ArrayAdapter<product>
    {
        public Mylistadapter()
        {
            super(getActivity(),R.layout.accessrieslayout,offerdata);
        }

        public View getView(int position,View convertView,ViewGroup parent)
        {
            View itemview = convertView;
            if(itemview==null)
            {
                itemview=((Activity)getContext()).getLayoutInflater().inflate(R.layout.accessrieslayout,parent,false);

            }
            product currentpro = offerdata.get(position);

            im = (ImageView)itemview.findViewById(R.id.imageView33);
            im.setImageResource(currentpro.getid());
            tv1 = (TextView)itemview.findViewById(R.id.textView28);
            tv1.setText(""+currentpro.getname());
            tv3= (TextView)itemview.findViewById(R.id.textView29);
            tv3.setText(""+currentpro.getprice());

            return itemview;
        }




    }






}
