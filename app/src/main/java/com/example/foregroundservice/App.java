package com.example.foregroundservice;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

//Notification Channel can only be created in Application extended class.
//Reason : it has to be alive throughout the life time of the application.

class App extends Application {

    public static final String CHANNEL_ID = "ServiceChannel";

    @Override
    public void onCreate() {
        super.onCreate();

        createNotificationChannel();
    }

    private void createNotificationChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            //Importance of foreground service has to be atleast LOW, or higher.
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Foreground Service", NotificationManager.IMPORTANCE_DEFAULT);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
