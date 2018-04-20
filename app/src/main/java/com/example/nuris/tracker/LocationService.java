package com.example.nuris.tracker;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by nuris on 20/03/2018.
 */

public class LocationService extends Service {
    // Thread initialization
    Thread t = new PeriodicUpdate();

    @Override
    public void onCreate() {
        super.onCreate();
        // starting the thread
        t.start();
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if(!t.isAlive())
        {
            t.start();
        }
        return Service.START_REDELIVER_INTENT;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}