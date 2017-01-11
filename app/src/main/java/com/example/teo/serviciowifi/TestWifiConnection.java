package com.example.teo.serviciowifi;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class TestWifiConnection extends Service {

    protected String tag = "TestWifiConService"; //Para ponerlo en el log, máximo 23 caracteres.
    protected boolean isEnabled = false;

    public TestWifiConnection() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(tag,getString(R.string.ServCreatedMsg));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(tag,getString(R.string.ServDestroyedMsg));
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(tag,getString(R.string.ServStartedMsg));
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public IBinder onBind(Intent intent) {
        //Servicio unbounded
        return null;
    }
}
