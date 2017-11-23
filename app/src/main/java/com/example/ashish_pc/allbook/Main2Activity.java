package com.example.ashish_pc.allbook;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.example.ashish_pc.fragment.fragmentfive;
import com.example.ashish_pc.fragment.fragmentfour;
import com.example.ashish_pc.fragment.fragmentmain;
import com.example.ashish_pc.fragment.fragmentsecond;
import com.example.ashish_pc.fragment.fragmentseven;
import com.example.ashish_pc.fragment.fragmentsix;
import com.example.ashish_pc.fragment.fragmentthird;
import com.example.ashish_pc.fragment.myaccount;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    ImageView im,im1,im2,im3,im4,im5;
    TextView tv1,tv2,tv3,tv4;
    Dialog dialog;
    int c=0;
    View v2;
    private List<product> offerdata = new ArrayList<product>();
    private List<trackpro> data = new ArrayList<trackpro>();
    private List<notfic> data1 = new ArrayList<notfic>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        populatelist();
        populatelist1();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                // .setAction("Action", null).show();
               // Toast.makeText(Main2Activity.this, "cheacking", Toast.LENGTH_SHORT).show();


                View v = (LayoutInflater.from(Main2Activity.this)).inflate(R.layout.feedback,null);
                AlertDialog.Builder alertbuilder = new AlertDialog.Builder(Main2Activity.this);
                alertbuilder.setView(v);
                alertbuilder.setCancelable(true);
                Dialog dialog = alertbuilder.create();
                dialog.show();



            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.fragment_frame,new fragmentmain()).commit();

    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        FragmentManager fm = getFragmentManager();
        switch (id)
        {
            case R.id.prof1:

                fm.beginTransaction().replace(R.id.fragment_frame, new myaccount()).commit();

                return true;

            case R.id.prof2:

                Toast.makeText(Main2Activity.this, "My Orders", Toast.LENGTH_LONG).show();

                return true;

            case R.id.prof3:

                Toast.makeText(Main2Activity.this, "Wishlist", Toast.LENGTH_LONG).show();

                return true;

            case R.id.prof4:

                v2 = (LayoutInflater.from(Main2Activity.this)).inflate(R.layout.ratinglayout,null);
                AlertDialog.Builder alertbuilder = new AlertDialog.Builder(Main2Activity.this);
                alertbuilder.setView(v2);
                alertbuilder.setCancelable(true);
                dialog = alertbuilder.create();
                dialog.setTitle("Rate our app");
                c=0;
                dialog.show();


                return true;
            case R.id.shipitem:

               /* View v = (LayoutInflater.from(Main2Activity.this)).inflate(R.layout.feedback,null);
                AlertDialog.Builder alertbuilder = new AlertDialog.Builder(Main2Activity.this);
                alertbuilder.setView(v);
                alertbuilder.setCancelable(true);
                 dialog = alertbuilder.create();
                dialog.show();*/


               View v3 = (LayoutInflater.from(Main2Activity.this)).inflate(R.layout.notice,null);
               // populatelist();
                alertbuilder = new AlertDialog.Builder(Main2Activity.this);
                alertbuilder.setView(v3);
                alertbuilder.setCancelable(true);
                //dialog = alertbuilder.create();
                //populatelist();
                populatelistview(v3);
               // clickcall(v3);
                dialog = alertbuilder.create();
                dialog.setTitle("Track Orders");
                dialog.show();

                return true;

            case R.id.cartitem:



                return true;

            case R.id.notitem:


                View v4 = (LayoutInflater.from(Main2Activity.this)).inflate(R.layout.noticc,null);

                alertbuilder = new AlertDialog.Builder(Main2Activity.this);
                alertbuilder.setView(v4);
                alertbuilder.setCancelable(true);
                //dialog = alertbuilder.create();
                //populatelist();
                populatelistview1(v4);
                dialog = alertbuilder.create();
                dialog.setTitle("Notification");
                dialog.show();






                return true;


            default:
                return  false;

        }

        //return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        FragmentManager fm = getFragmentManager();
        int id = item.getItemId();

        if (id == R.id.nav_camara) {

            fm.beginTransaction().replace(R.id.fragment_frame, new fragmentsecond()).commit();

        }
        else if (id == R.id.nav_offer) {
            fm.beginTransaction().replace(R.id.fragment_frame,new fragmentmain()).commit();

        }
        else if (id == R.id.nav_gallery) {

            fm.beginTransaction().replace(R.id.fragment_frame,new fragmentfive()).commit();


        } else if (id == R.id.nav_manage) {

            fm.beginTransaction().replace(R.id.fragment_frame,new fragmentthird()).commit();

        }else if (id == R.id.nav_used) {

            fm.beginTransaction().replace(R.id.fragment_frame,new fragmentfour()).commit();


        }
        else if (id == R.id.nav_share) {

            fm.beginTransaction().replace(R.id.fragment_frame,new fragmentsix()).commit();


        } else if (id == R.id.nav_send) {

            fm.beginTransaction().replace(R.id.fragment_frame, new fragmentseven()).commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private void clickcall(View v)
    {
        ListView lv=(ListView)v.findViewById(R.id.listView2);
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
        data.add(new trackpro("two-states","In transit",250,R.drawable.booksex1,R.drawable.track));
        data.add(new trackpro("two-states","Shipped",250,R.drawable.booksex1,R.drawable.ship));
        data.add(new trackpro("two-states", "Packaging", 250, R.drawable.booksex1, R.drawable.fill));

    }

    private void populatelist1()
    {
        data1.add(new notfic("Thanks to shop from AllApp. Improve your knowledge.",R.drawable.happy,R.drawable.happy,R.drawable.happy));
        data1.add(new notfic("You have missed exciting offer.",R.drawable.cry,R.drawable.cry,R.drawable.cry));
        data1.add(new notfic("Don't get angry.we wil solve your issue so be happy.",R.drawable.angry,R.drawable.hand,R.drawable.happy));
        data1.add(new notfic("Mega book sale, grab profit as much as you can.",R.drawable.basket,R.drawable.basket,R.drawable.basket));
    }

    private void populatelistview(View v)
    {
        ArrayAdapter<trackpro> adapter = new Mylistadapter();
        ListView lv = (ListView)v.findViewById(R.id.listView2);
        lv.setAdapter(adapter);
    }

    private void populatelistview1(View v)
    {
        ArrayAdapter<notfic> adapter = new Mylistadapterr();
        ListView lv = (ListView)v.findViewById(R.id.listView3);
        lv.setAdapter(adapter);
    }


    private class Mylistadapter extends ArrayAdapter<trackpro>
    {
        public Mylistadapter()
        {
            super(Main2Activity.this,R.layout.trackorder,data);
        }

        public View getView(int position,View convertView,ViewGroup parent)
        {
            View itemview = convertView;
            if(itemview==null)
            {
                itemview=getLayoutInflater().inflate(R.layout.trackorder,parent,false);

            }
            trackpro currentpro = data.get(position);

            im = (ImageView)itemview.findViewById(R.id.imageView12);
            im.setImageResource(currentpro.getid());
            im = (ImageView)itemview.findViewById(R.id.imageView15);
            im.setImageResource(currentpro.getid2());
            tv1 = (TextView)itemview.findViewById(R.id.textView17);
            tv1.setText(""+currentpro.getname());
           // tv2 = (TextView)itemview.findViewById(R.id.textView10);
          //  tv2.setText(""+currentpro.getauthor());
            tv3= (TextView)itemview.findViewById(R.id.textView18);
            tv3.setText(""+currentpro.getprice());
            tv4= (TextView)itemview.findViewById(R.id.textView23);
            tv4.setText(""+currentpro.getstatus());
            return itemview;
        }




    }

    private class Mylistadapterr extends ArrayAdapter<notfic>
    {
        public Mylistadapterr()
        {
            super(Main2Activity.this,R.layout.notificationk,data1);
        }

        public View getView(int position,View convertView,ViewGroup parent)
        {
            View itemview = convertView;
            if(itemview==null)
            {
                itemview=getLayoutInflater().inflate(R.layout.notificationk,parent,false);

            }
            notfic currentpro = data1.get(position);

            tv1 = (TextView)itemview.findViewById(R.id.textView26);
            tv1.setText(""+currentpro.getname());
            im = (ImageView)itemview.findViewById(R.id.imageView30);
            im.setImageResource(currentpro.getid());
            im = (ImageView)itemview.findViewById(R.id.imageView31);
            im.setImageResource(currentpro.getid1());
            im = (ImageView)itemview.findViewById(R.id.imageView32);
            im.setImageResource(currentpro.getid3());


            return itemview;
        }




    }


    public void rate(View v)
    {
        if(c<=4) {

            switch (v.getId()) {
                case R.id.imageButton11:
                    if (c == 0)
                        im1 = (ImageView) v2.findViewById(R.id.imageView37);
                    else if (c == 1)
                        im1 = (ImageView) v2.findViewById(R.id.imageView39);
                    else if (c == 2)
                        im1 = (ImageView) v2.findViewById(R.id.imageView40);
                    else if (c == 3)
                        im1 = (ImageView) v2.findViewById(R.id.imageView41);
                    else if (c == 4)
                        im1 = (ImageView) v2.findViewById(R.id.imageView42);
                    im1.setImageResource(R.drawable.fillstar);
                    ++c;
                    break;
                case R.id.imageButton12:

                    if (c == 0)
                        im1 = (ImageView) v2.findViewById(R.id.imageView37);
                    else if (c == 1)
                        im1 = (ImageView) v2.findViewById(R.id.imageView39);
                    else if (c == 2)
                        im1 = (ImageView) v2.findViewById(R.id.imageView40);
                    else if (c == 3)
                        im1 = (ImageView) v2.findViewById(R.id.imageView41);
                    else if (c == 4)
                        im1 = (ImageView) v2.findViewById(R.id.imageView42);

                    im1.setImageResource(R.drawable.halfstar);
                    ++c;
                    break;
                case R.id.imageButton13:


                    if (c == 0)
                        im1 = (ImageView) v2.findViewById(R.id.imageView37);
                    else if (c == 1)
                        im1 = (ImageView) v2.findViewById(R.id.imageView39);
                    else if (c == 2)
                        im1 = (ImageView) v2.findViewById(R.id.imageView40);
                    else if (c == 3)
                        im1 = (ImageView) v2.findViewById(R.id.imageView41);
                    else if (c == 4)
                        im1 = (ImageView) v2.findViewById(R.id.imageView42);

                    im1.setImageResource(R.drawable.outline);
                    ++c;
                    break;
                default:
                    break;

            }
        }

    }

public void submit(View v)
{
    dialog.dismiss();
}


}
