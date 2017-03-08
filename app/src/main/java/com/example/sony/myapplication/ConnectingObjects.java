package com.example.sony.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ConnectingObjects extends AppCompatActivity {

    private ImageView img;
//    private ImageView img2;

//    private ScaleGestureDetector scaleGestureDetector;

    private ViewGroup rootLayout;
    private int _xDelta;
    private int _yDelta;
    // movement of start event
    private TextView textView3;
    private RelativeLayout relativeLayout;

//    private class MySimpleOnScaleGestureListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{
//        ImageView viewMyImage;
//
//        float factor;
//
//        public MySimpleOnScaleGestureListener(ImageView iv) {
//            super();
//            viewMyImage = iv;
//        }
//
//        @Override
//        public boolean onScaleBegin(ScaleGestureDetector detector) {
//            factor = 1.0f;
//            return true;
//            //return super.onScaleBegin(detector);
//        }
//
//        @Override
//        public boolean onScale(ScaleGestureDetector detector) {
//
//            float scaleFactor = detector.getScaleFactor() - 1;
//            factor += scaleFactor;
//            viewMyImage.setScaleX(factor);
//            viewMyImage.setScaleY(factor);
//            return true;
//            //return super.onScale(detector);
//        }
//    }
//
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        scaleGestureDetector.onTouchEvent(event);
//        return true;
//        //return super.onTouchEvent(event);
//    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.objects_connecting);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);
        img = (ImageView) rootLayout.findViewById(R.id.startEvent);

        relativeLayout = (RelativeLayout)findViewById(R.id.connectingObjectLayout);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

//        scaleGestureDetector = new ScaleGestureDetector(
//                this, new MySimpleOnScaleGestureListener(img));


//        Button advanceToDropDown = (Button) findViewById(R.id.BackButtonConnecting);
//        advanceToDropDown.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(ConnectingObjects.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });

        // Let 'tips' button open the tips dialogue
        Button loadTipsDialogue = (Button) findViewById(R.id.tipsDialogue);
        loadTipsDialogue.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(ConnectingObjects.this);
                dialog.setCancelable(false);
                dialog.setTitle("Tips");
                dialog.setMessage("Tip 1: For description, click on flashing text-field, press done, press 'T' " +
                        "Tip 2: A BPM must begin with a start EVENT and end with an end event");


                dialog.setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                    }
                });
                final AlertDialog alert = dialog.create();
                alert.show();
            }
        }); //Tips onClick









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

        LinearLayout gatewayNoneButton = (LinearLayout) findViewById(R.id.gatewayNoneButton);
        gatewayNoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                i.setImageResource(R.drawable.gateway_none);
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout gatewayParallelButton = (LinearLayout) findViewById(R.id.gatewayParallelButton);
        gatewayParallelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                i.setImageResource(R.drawable.gateway_parallel);
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout gatewayXorButton = (LinearLayout) findViewById(R.id.gatewayXorButton);
        gatewayXorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                i.setImageResource(R.drawable.gateway_xor);
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout gatewayEventBasedButton = (LinearLayout) findViewById(R.id.gatewayEventBasedButton);
        gatewayEventBasedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                i.setImageResource(R.drawable.gateway_eventbased);
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout gatewayComplexButton = (LinearLayout) findViewById(R.id.gatewayComplexButton);
        gatewayComplexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                i.setImageResource(R.drawable.gateway_complex);
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout gatewayOrButton = (LinearLayout) findViewById(R.id.gatewayOrButton);
        gatewayOrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                i.setImageResource(R.drawable.gateway_or);
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout rightButton = (LinearLayout) findViewById(R.id.rightButton);
        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
//                i.setImageResource(R.drawable.right);
                Bitmap bmp;
                bmp = BitmapFactory.decodeResource(getResources(),R.drawable.right);
                bmp=Bitmap.createScaledBitmap(bmp,1000,312,true);
                i.setImageBitmap(bmp);
                i.setLayoutParams(new RelativeLayout.LayoutParams(800,100));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout leftButton = (LinearLayout) findViewById(R.id.leftButton);
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                Bitmap bmp;
                bmp = BitmapFactory.decodeResource(getResources(),R.drawable.left);
                bmp=Bitmap.createScaledBitmap(bmp,1000,312,true);
                i.setImageBitmap(bmp);
                i.setLayoutParams(new RelativeLayout.LayoutParams(800,100));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });


        LinearLayout upButton = (LinearLayout) findViewById(R.id.upButton);
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                Bitmap bmp;
                bmp = BitmapFactory.decodeResource(getResources(),R.drawable.up);
                bmp=Bitmap.createScaledBitmap(bmp,252,800,true);
                i.setImageBitmap(bmp);
                i.setLayoutParams(new RelativeLayout.LayoutParams(80,800));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });

        LinearLayout upRightButton = (LinearLayout) findViewById(R.id.upRightButton);
        upRightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView3 = (TextView) findViewById(R.id.textView3);
                ImageView i = new ImageView(ConnectingObjects.this);
                Bitmap bmp;
                bmp = BitmapFactory.decodeResource(getResources(),R.drawable.up_right);
                bmp=Bitmap.createScaledBitmap(bmp,1000,1000,true);
                i.setImageBitmap(bmp);
                i.setLayoutParams(new RelativeLayout.LayoutParams(300,300));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);

            }
        });





        // TEXTFIELDS
        LinearLayout addTextButton = (LinearLayout) findViewById(R.id.addTextButton);
        addTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTxt = (EditText) findViewById(R.id.txtView);
                TextView i = new TextView(ConnectingObjects.this);
                i.setText(editTxt.getText());
                i.setLayoutParams(new RelativeLayout.LayoutParams(150,150));
                i.setOnTouchListener(new ChoiceTouchListener());
                relativeLayout.addView(i);
                editTxt.setText("");

            }
        });




//        textView3 = (TextView) findViewById(R.id.textView3);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(150, 150);
//        img.setLayoutParams(layoutParams);
//        img.setOnTouchListener(new ChoiceTouchListener());
//
//        img2 = (ImageView) rootLayout.findViewById(R.id.ivIntermediateEvent);
//        // textView3 = (TextView) findViewById(R.id.textView3);
//        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(200, 150);
//        img2.setLayoutParams(layoutParams2);
//        img2.setOnTouchListener(new ChoiceTouchListener());
    } // onCreate


    // Delaroy Studios, Youtube
    public final class ChoiceTouchListener implements View.OnTouchListener {
//        TextView textView3 = (TextView) findViewById(R.id.textView3);
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
//            textView3.setText("X: " + X + " Y: " + Y);
            rootLayout.invalidate();
            return true;
        }
    }











} // public class Connectingobjects
