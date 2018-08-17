package gicitc.broadcast.inputrecieverapp;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    InputReceiver inputReceiver = null;
    IntentFilter filter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textview);
        inputReceiver = new InputReceiver(textView);
        filter = new IntentFilter("gicitc.action.ACTION_INPUT");
    }

    @Override
    protected void onStart() {
        super.onStart();
        registerReceiver(inputReceiver,filter);
    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(inputReceiver);
        //Toast.makeText(this,"Stopped",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
