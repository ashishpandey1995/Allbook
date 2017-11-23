package com.example.ashish_pc.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.ashish_pc.allbook.Main2Activity;
import com.example.ashish_pc.allbook.R;
import com.example.ashish_pc.allbook.product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashish_pc on 2/13/2016.
 */
public class fragmentmain extends Fragment {

    public fragmentmain()
    {

    }

    ImageView im;
    TextView tv1,tv2,tv3,tv4;
    View rootview;
    ListView lv;
    ProgressDialog dialog;

   private List<product> offerdata = new ArrayList<product>();
    private List<product> offerdat = new ArrayList<product>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         rootview = inflater.inflate(R.layout.fragment_main,container,false);
        populatelist();

        populatelistview();
        new mytask().execute();
        //clickcall();
        return rootview;
    }



    private void clickcall()
    {
        ListView lv=(ListView)rootview.findViewById(R.id.listView);
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
        offerdata.add(new product("Half-girlfriend","chetan bhagat",250,"20%",R.drawable.booksex1));
        offerdata.add(new product("Your dreams are mine now","chetan bhagat",250,"15%",R.drawable.booksex2));
        offerdata.add(new product("Apsara-eraser","chetan bhagat",250,"30%",R.drawable.eraser1));
        offerdata.add(new product("Apsara-marker","chetan bhagat",250,"20%",R.drawable.marker1));
        offerdata.add(new product("Rodger-white board","chetan bhagat",250,"20%",R.drawable.board2));
        offerdata.add(new product("Epson ink 4's combo","chetan bhagat",250,"10%",R.drawable.ink1));
        offerdata.add(new product("Classmate note book","chetan bhagat",250,"50%",R.drawable.copy3));
        offerdata.add(new product("Bestcopy","chetan bhagat",250,"30%",R.drawable.copy4));
        offerdata.add(new product("Apsara Sharpner","chetan bhagat",250,"30%",R.drawable.sharpner1));
        offerdata.add(new product("Cello wall tape","chetan bhagat",250,"30%",R.drawable.tape3));
        offerdata.add(new product("Kangaroo-punch","chetan bhagat",250,"15%",R.drawable.puch1));
        offerdata.add(new product("Cello grip","chetan bhagat",250,"15%",R.drawable.pen7));
        offerdata.add(new product("JK white paper","chetan bhagat",250,"12%",R.drawable.page4));
        offerdata.add(new product("Classmate note book","chetan bhagat",250,"40%",R.drawable.copy4));
        offerdata.add(new product("Kangaroo k-124","chetan bhagat",250,"50%",R.drawable.stepler1));
    }

    private void populatelistview()
        {
        ArrayAdapter<product> adapter = new Mylistadapter();
            lv=(ListView) rootview.findViewById(R.id.listView);
            lv.setAdapter(adapter);


    }


    private class Mylistadapter extends ArrayAdapter<product>
    {
        public Mylistadapter()
        {
            super(getActivity(),R.layout.item_layout,offerdat);
        }

        public View getView(int position,View convertView,ViewGroup parent)
        {
            View itemview = convertView;
            if(itemview==null)
            {
                itemview=((Activity)getContext()).getLayoutInflater().inflate(R.layout.item_layout,parent,false);

            }
            product currentpro = offerdata.get(position);

            im = (ImageView)itemview.findViewById(R.id.imageView4);
            im.setImageResource(currentpro.getid());
            tv1 = (TextView)itemview.findViewById(R.id.textView9);
            tv1.setText(""+currentpro.getname());
            //tv2 = (TextView)itemview.findViewById(R.id.textView10);
           // tv2.setText(""+currentpro.getauthor());
            tv3= (TextView)itemview.findViewById(R.id.textView11);
            tv3.setText(""+currentpro.getprice());
            tv4= (TextView)itemview.findViewById(R.id.textView12);
            tv4.setText(""+currentpro.getoffer()+" offer");
            return itemview;
        }




    }



    class mytask extends AsyncTask<Void,product,Void>
    {
        private ArrayAdapter<product> adapter;
        @Override

        protected void onPreExecute()
        {
            adapter = (ArrayAdapter<product> )lv.getAdapter();
            dialog = new ProgressDialog(getActivity());
            dialog.setTitle("Fetching data");
            dialog.setMessage("please wait.....");
            dialog.show();
        }
        protected Void doInBackground(Void... params) {

            for(product data:offerdata)
            {
             publishProgress(data);
                try {
                    Thread.sleep(200);
                }
                catch (Exception ex)
                {

                }
            }
            return null;
        }

        protected void onProgressUpdate(product... values) {
            adapter.add(values[0]);

        }


        protected void onPostExecute(Void result)
        {
            dialog.dismiss();
        }


    }





}
