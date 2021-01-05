package com.example.foregroundservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.foregroundservice.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {

    private MainActivityBinding mMainActivityBinding;

//Service can be started from an Activity or Broadcast Listener or Fragment.

    //    Step 1 : We create our foreground service by extending the Service class and overriding onStartCommand,
    //    where we then promote our service to the foreground by calling startForeground and passing a notification to it, which we build with the NotificationCompat.Builder.

    //    Step 2 : NOTE : With target API level 26 (Android Oreo) or higher, we have to create notification channels in order to be able to display notifications, and we will do this is in the Application class.

    //    Step 3 : Depending if we want to restart the service if the system kills it, we return either START_STICKY, START_NOT_STICKY or START_REDELIVER_INTENT from onStartCommand.
    //    Additional we can override onCreate and onDestroy, where we can do an initial setup and a cleanup.

    //    IMPORTANT : We also have to override onBind, but since we are creating a started service and not a bound service,
    //    we can just ignore this method and return null.
    //    IMPORTANT : We register our service in the AndroidManifest.xml file and then we can start it by calling startService, startForegroundService or ContextCompat.startForegroundService,
    //    where we have to pass an intent, which can optionally contain data in form of extras.
    //    We stop the service by calling either stopSelf from within, or stopService from another app component.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mMainActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}