package com.example.debuggers;

import android.content.Context;
import android.widget.Toast;

import java.util.Date;

public class CallReceiver extends com.example.debuggers.PhonecallReceiver {

    @Override
    protected void onIncomingCallReceived(Context ctx, String number, Date start)
    {
        //Context context;

        Toast.makeText(ctx," Incoming Receiver start ",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onIncomingCallAnswered(Context ctx, String number, Date start)
    {
        Toast.makeText(ctx," Incoming Call Picked ",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end)
    {
        Toast.makeText(ctx,"Incoming Call Ended ",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start)
    {
        Toast.makeText(ctx," Outgoing Call Started ",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end)
    {
        Toast.makeText(ctx," Outgoing Call Ended ",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onMissedCall(Context ctx, String number, Date start)
    {
        Toast.makeText(ctx," Missed Call ",Toast.LENGTH_SHORT).show();
    }

}