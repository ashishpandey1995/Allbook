package com.example.ashish_pc.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ashish_pc.allbook.R;
import com.example.ashish_pc.allbook.product;

import java.util.ArrayList;
import java.util.List;


public class fragmentsecond extends Fragment {
    GridView gv;
    ImageView im;
    ImageButton b1;
    TextView tv1,tv2;
    View rootview;
    private List<product> offerdata = new ArrayList<product>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


         rootview = inflater.inflate(R.layout.fragment_second,container,false);
         b1=(ImageButton)rootview.findViewById(R.id.imageButton);

        check(rootview.findViewById(R.id.imageButton));

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                PopupMenu pm = new PopupMenu(getActivity(), rootview.findViewById(R.id.imageButton));

                MenuInflater inflater = pm.getMenuInflater();
                inflater.inflate(R.menu.my_menu, pm.getMenu());



                pm.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.first1:

                                Toast.makeText(getActivity(), "Action and Adventure", Toast.LENGTH_LONG).show();

                                return true;

                            case R.id.first2:

                                Toast.makeText(getActivity(), "Romance", Toast.LENGTH_LONG).show();

                                return true;

                            case R.id.first3:

                                Toast.makeText(getActivity(), "Mystery and Horror", Toast.LENGTH_LONG).show();

                                return true;

                            case R.id.first4:

                                Toast.makeText(getActivity(), "Health and Guide", Toast.LENGTH_LONG).show();

                                return true;

                            case R.id.first5:

                                Toast.makeText(getActivity(), "Religion, Spirituality & New Age", Toast.LENGTH_LONG).show();

                                return true;

                            case R.id.first6:

                                Toast.makeText(getActivity(), "History", Toast.LENGTH_LONG).show();

                                return true;

                            case R.id.first7:

                                Toast.makeText(getActivity(), "Anthology", Toast.LENGTH_LONG).show();

                                return true;

                            case R.id.first8:

                                Toast.makeText(getActivity(), "Triology", Toast.LENGTH_LONG).show();

                                return true;

                            case R.id.first9:

                                Toast.makeText(getActivity(), "Science and Math", Toast.LENGTH_LONG).show();

                                return true;

                            default:
                                return false;


                        }

                    }
                });

                pm.show();
            }
        });
        populatelist();
        populatelistview();
        //clickcall();


        return rootview;
    }

   public void check(View v)
    {
        PopupMenu pm = new PopupMenu(getActivity(),v);
        MenuInflater inflater = pm.getMenuInflater();
        inflater.inflate(R.menu.my_menu, pm.getMenu());




        pm.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.first1:

                        Toast.makeText(getActivity(), "Action and Adventure", Toast.LENGTH_LONG).show();

                        return true;

                    case R.id.first2:

                        Toast.makeText(getActivity(), "Romance", Toast.LENGTH_LONG).show();

                        return true;

                    case R.id.first3:

                        Toast.makeText(getActivity(), "Mystery and Horror", Toast.LENGTH_LONG).show();

                        return true;

                    case R.id.first4:

                        Toast.makeText(getActivity(), "Health and Guide", Toast.LENGTH_LONG).show();

                        return true;

                    case R.id.first5:

                        Toast.makeText(getActivity(), "Religion, Spirituality & New Age", Toast.LENGTH_LONG).show();

                        return true;

                    case R.id.first6:

                        Toast.makeText(getActivity(), "History", Toast.LENGTH_LONG).show();

                        return true;

                    case R.id.first7:

                        Toast.makeText(getActivity(), "Anthology", Toast.LENGTH_LONG).show();

                        return true;

                    case R.id.first8:

                        Toast.makeText(getActivity(), "Triology", Toast.LENGTH_LONG).show();

                        return true;

                    case R.id.first9:

                        Toast.makeText(getActivity(), "Science and Math", Toast.LENGTH_LONG).show();

                        return true;
                    default:
                        return false;


                }

            }
        });

        pm.show();
    }





    private void clickcall()
    {
        gv=(GridView)rootview.findViewById(R.id.gridView);
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
        gv=(GridView)rootview.findViewById(R.id.gridView);
        gv.setAdapter(adapter);
    }


    private class Mylistadapter extends ArrayAdapter<product>
    {
        public Mylistadapter()
        {
            super(getActivity(),R.layout.item_view,offerdata);
        }

        public View getView(int position,View convertView,ViewGroup parent)
        {
            View itemview = convertView;
            if(itemview==null)
            {
                itemview=((Activity)getContext()).getLayoutInflater().inflate(R.layout.item_view,parent,false);

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
