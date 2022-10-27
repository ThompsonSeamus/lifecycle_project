package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String createMSG = "The activity has been created: onCreate()";
        Toast.makeText(this, createMSG, Toast.LENGTH_SHORT).show();
        Log.d("msg", createMSG);
    }

    @Override
    protected void onStart() {
        super.onStart();
        String startMSG = "The activity has been launched: onStart()";
        Toast.makeText(this, startMSG, Toast.LENGTH_SHORT).show();
        Log.d("msg", startMSG);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String resumeMSG = "The activity is now in the foreground and running: onResume()";
        Toast.makeText(this, resumeMSG, Toast.LENGTH_SHORT).show();
        Log.d("msg", resumeMSG);
    }

    @Override
    protected void onPause() {
        super.onPause();
        String pauseMSG = "Another activity is now in front of this activity: onPause()";
        Toast.makeText(this, pauseMSG, Toast.LENGTH_SHORT).show();
        Log.d("msg", pauseMSG);
    }

    @Override
    protected void onStop() {
        super.onStop();
        String stopMSG = "The activity is now no longer visible on the screen: onStop()";
        Toast.makeText(this, stopMSG, Toast.LENGTH_SHORT).show();
        Log.d("msg", stopMSG);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        String restartMSG = "The activity is restarting after being stopped: onRestart()";
        Toast.makeText(this, restartMSG, Toast.LENGTH_SHORT).show();
        Log.d("msg", restartMSG);
    }
}