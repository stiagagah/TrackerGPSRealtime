package com.example.nuris.tracker;

import android.util.Log;

import java.text.DecimalFormat;

/**
 * Created by nuris on 20/03/2018.
 */


public class PeriodicUpdate extends Thread {
    //...declaration etc
DecimalFormat df;


    @Override
    public void run() {
        df = new DecimalFormat("##########.######");
        while (true) {
            try {
                sendLocation("Cyber", 1.0, 1.1);

                //pause thread every 10 seconds
                Thread.sleep(10000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
    //...declaration etc

    private void sendLocation(String username, double lat,double lng)
    {
        Log.d("Username",username);
    }
}
