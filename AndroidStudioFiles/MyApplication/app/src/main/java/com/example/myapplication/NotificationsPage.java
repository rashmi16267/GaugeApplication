package com.example.myapplication;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;


public class NotificationsPage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificationspage);
    }

    public void goToSettingsFromNotifications (View view){
        Intent intent = new Intent (this, SettingsPage.class);
        startActivity(intent);
    }


    // initiate a Switch

    Switch simpleSwitch = (Switch) findViewById(R.id.notificationSwitch);

    // check current state of a Switch (true or false).

    // Boolean switchState = simpleSwitch.isChecked();

    public void setSimpleSwitch(Switch simpleSwitch) {
        if(simpleSwitch.isChecked()) {

            // Notification.Builder mBuilder = new Notification.Builder(this);

            // public NotificationCompat.Builder setContentTitle(@Nullable CharSequence "Notifications On!");
            //mBuilder.getSmallIcon(R.drawable.ic_notification_icon);

            Notification.Builder mBuilder
                    = new Notification.Builder(this)
                    .setSmallIcon(R.drawable.ic_notification_icon)
                    .setStyle(new Notification.BigTextStyle().bigText("Notifications On!"))
                    .setContentTitle("Notifications On!")
                    .setPriority(Notification.PRIORITY_HIGH)
                    .setContentText("Notifications are switched on! To disable go to Menu > Settings > Notifications");

                //setContentTitle("New mail from " + sender.toString())
            //mBuilder.tickerText("Notifications are switched on! To disable go to Menu > Settings > Notifications");

            Intent resultIntent = new Intent(this, NotificationsPage.class);
            TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
            stackBuilder.addParentStack(NotificationsPage.class);

            stackBuilder.addNextIntent(resultIntent);
            PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
            mBuilder.setContentIntent(resultPendingIntent);

            NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

            mNotificationManager.notify(0, mBuilder.build());
        }
        else {
            Toast toast=Toast.makeText(getApplicationContext(),"Notifications are switched off",Toast.LENGTH_LONG);
            toast.setMargin(50,50);
            toast.show();
        }
    }
}


/*
    Switch sw = (Switch) findViewById(R.id.notificationSwitch);
    sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {
                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
                //public NotificationCompat.Builder setContentTitle(@Nullable CharSequence title)
                mBuilder.setSmallIcon(R.drawable.ic_notification_icon);
                mBuilder.setContentTitle("Notifications On!");
                mBuilder.setContentText("Notifications are switched on! To disable go to Menu > Settings > Notifications");

                Intent resultIntent = new Intent(this, NotificationsPage.class);
                TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
                stackBuilder.addParentStack(NotificationsPage.class);

                stackBuilder.addNextIntent(resultIntent);
                PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
                mBuilder.setContentIntent(resultPendingIntent);

                NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                mNotificationManager.notify(0, mBuilder.build());

            } else {
                Toast toast=Toast.makeText(getApplicationContext(),"Notifications are switched off",Toast.LENGTH_LONG);
                toast.setMargin(50,50);
                toast.show();
            }
            }
        }
    });
    */


