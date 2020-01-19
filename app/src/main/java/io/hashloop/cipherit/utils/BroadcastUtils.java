package io.hashloop.cipherit.utils;

import android.content.Context;
import android.content.Intent;

public class BroadcastUtils {

    public static final String CLOSE_FLOATING_WINDOWS_ACTION = "io.hashloop.cipherit.CLOSE_FLOATING_WINDOWS";

    public static void sendCloseFloatingWindowsBroadcast(Context context) {
        Intent intent = new Intent();
        intent.setAction(CLOSE_FLOATING_WINDOWS_ACTION);
        context.sendBroadcast(intent);
    }

}
