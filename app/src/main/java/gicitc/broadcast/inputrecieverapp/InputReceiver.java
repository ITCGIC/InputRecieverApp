package gicitc.broadcast.inputrecieverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class InputReceiver extends BroadcastReceiver {
    TextView textView;
    public InputReceiver(){

    }
    public InputReceiver(TextView textView){
        this.textView =textView;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.hasExtra("ContentText"))
        Toast.makeText(context, "Recieved: "+intent.getStringExtra("ContentText"),Toast.LENGTH_LONG).show();
        textView.setText(intent.getStringExtra("ContentText"));
    }
}
