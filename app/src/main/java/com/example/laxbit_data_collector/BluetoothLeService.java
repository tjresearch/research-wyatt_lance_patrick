package com.example.laxbit_data_collector;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BluetoothLeService extends Service {
    public BluetoothLeService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
