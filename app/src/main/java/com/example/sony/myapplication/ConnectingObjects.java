package com.example.sony.myapplication;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class ConnectingObjects extends AppCompatActivity {

//    private ImageView img;
//    private ImageView img2;

    private ViewGroup rootLayout;
    private int _xDelta;
    private int _yDelta;
    // movement of start event
    private TextView textView3;
    private RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.objects_connecting);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);

        relativeLayout = (RelativeLayout)findViewById(R.id.connectingObjectLayout);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//
//        Button advanceToDropDown = (Button) findViewById(R.id.BackButtonConnecting);
//        advanceToDropDown.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(ConnectingObjects.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });
        LinearLayout startEventButton = (LinearLayout) findViewById(R.id.startEventButton);
        startEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                i.setImageResource(R.drawable.start_event);
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout seqFlowButton = (LinearLayout) findViewById(R.id.sequenceFlowButton);
        seqFlowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                i.setImageResource(R.drawable.sequenceflow);
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout intermediateButton = (LinearLayout) findViewById(R.id.intermediateButton);
        intermediateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                i.setImageResource(R.drawable.intermediate_event);
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout endButton = (LinearLayout) findViewById(R.id.endEventButton);
        endButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                i.setImageResource(R.drawable.end_event);
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout taskButton = (LinearLayout) findViewById(R.id.taskButton);
        taskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                i.setImageResource(R.drawable.task_activity);
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout subProcessButton = (LinearLayout) findViewById(R.id.subProcessButton);
        subProcessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                i.setImageResource(R.drawable.subprocess);
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout transactionButton = (LinearLayout) findViewById(R.id.transactionButton);
        transactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                i.setImageResource(R.drawable.transaction);
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout callActivityButton = (LinearLayout) findViewById(R.id.callActivityButton);
        callActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                i.setImageResource(R.drawable.call_activity);
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });
//        img = (ImageView) rootLayout.findViewById(R.id.startEvent);
//        textView3 = (TextView) findViewById(R.id.textView3);
//        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(150, 150);
//        img.setLayoutParams(layoutParams);
//        img.setOnTouchListener(new ChoiceTouchListener());
//
//        img2 = (ImageView) rootLayout.findViewById(R.id.ivIntermediateEvent);
//        // textView3 = (TextView) findViewById(R.id.textView3);
//        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(200, 150);
//        img2.setLayoutParams(layoutParams2);
//        img2.setOnTouchListener(new ChoiceTouchListener());
    } // onCreate

    public final class ChoiceTouchListener implements View.OnTouchListener {
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        public boolean onTouch(View view, MotionEvent event) {
            final int X = (int) event.getRawX();
            final int Y = (int) event.getRawY();
            switch (event.getAction() & MotionEvent.ACTION_MASK) {
                case MotionEvent.ACTION_DOWN:
                    RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    _xDelta = X - lParams.leftMargin;
                    _yDelta = Y - lParams.topMargin;
                    break;
                case MotionEvent.ACTION_UP:
                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    break;
                case MotionEvent.ACTION_POINTER_UP:
                    break;
                case MotionEvent.ACTION_MOVE:
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view
                            .getLayoutParams();
                    layoutParams.leftMargin = X - _xDelta;
                    layoutParams.topMargin = Y - _yDelta;
                    layoutParams.rightMargin = -250;
                    layoutParams.bottomMargin = -250;
                    view.setLayoutParams(layoutParams);
                    break;
            }
            Log.d("Loc","X: " + X+ " Y: " + Y);
            textView3.setText("X: " + X + " Y: " + Y);
            rootLayout.invalidate();
            return true;
        }
    }











} // public class Connectingobjects
