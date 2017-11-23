package com.example.ashish_pc.fragment;

import android.app.Fragment;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ashish_pc.allbook.R;

/**
 * Created by ashish_pc on 2/15/2016.
 */
public class fragmentseven extends Fragment {

    View rootview;
    private ImageView myImage;

    private static final String IMAGEVIEW_TAG = "The Android Logo";

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        rootview = inflater.inflate(R.layout.fragment_seven, container, false);

        myImage = (ImageView)rootview.findViewById(R.id.image);
        myImage.setTag(IMAGEVIEW_TAG);

        myImage.setOnLongClickListener(new MyClickListener());

        rootview.findViewById(R.id.toplinear).setOnDragListener(new MyDragListener());



        return rootview;
    }



    private final class MyClickListener implements View.OnLongClickListener {

        public boolean onLongClick(View view) {

            ClipData.Item item = new ClipData.Item((CharSequence)view.getTag());



            String[] mimeTypes = { ClipDescription.MIMETYPE_TEXT_PLAIN };

            ClipData data = new ClipData(view.getTag().toString(), mimeTypes, item);

            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);

            view.startDrag( data,shadowBuilder,view,0);

            view.setVisibility(View.INVISIBLE);

            return true;

        }

    }

    class MyDragListener implements View.OnDragListener {



        public boolean onDrag(View v, DragEvent event) {

            switch (event.getAction()) {

                case DragEvent.ACTION_DRAG_STARTED:

                    break;

                case DragEvent.ACTION_DRAG_ENTERED:



                    break;

                case DragEvent.ACTION_DRAG_EXITED:



                    break;





                case DragEvent.ACTION_DROP:

                    int c = (int)event.getY();
                    if((c>=400)&&(c<=550))
                {
                    Toast.makeText(getActivity(), "call",

                            Toast.LENGTH_LONG).show();
                }

                    if((c>=620)&&(c<=820))
                    {
                        Toast.makeText(getActivity(), "sms",

                                Toast.LENGTH_LONG).show();
                    }

                    if((c>=880)&&(c<=1050))
                    {
                        Toast.makeText(getActivity(), "email",

                                Toast.LENGTH_LONG).show();
                    }


                    break;




                case DragEvent.ACTION_DRAG_ENDED:





                default:

                    break;

            }

            return true;

        }

    }



}
