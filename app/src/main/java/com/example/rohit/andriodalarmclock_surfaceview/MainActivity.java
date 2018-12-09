package com.example.rohit.andriodalarmclock_surfaceview;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;

import com.example.rohit.andriodalarmclock_surfaceview.MySurfaceView;
import com.example.rohit.andriodalarmclock_surfaceview.R;
import com.rtugeek.android.colorseekbar.ColorSeekBar;


public class MainActivity extends Activity {
    MySurfaceView mySurfaceView = null;
    SurfaceView surfaceView1;
    SharedPreferences sp = null;
    Button startAlarmBtn, setColorBtn;
    ColorSeekBar seekBar;
    String hrHand, minHand, secHand, bodyClock;
    int hr, min, sec, body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
        mySurfaceView = new MySurfaceView(this, 300);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.surfaceView);
        linearLayout.addView(mySurfaceView);

    }


    protected void onResume(){
        super.onResume();
        mySurfaceView.onResumeMySurfaceView();
    }

    @Override
    protected void onPause(){
        super.onPause();
        mySurfaceView.onPauseMySurfaceView();
    }





}
