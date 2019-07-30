package com.example.student.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


//        Context context = getApplicationContext();
//        CharSequence toastMsg = "Hello toast";
//
//        int duration = Toast.LENGTH_LONG;
//
//        Toast toast = Toast.makeText(context, toastMsg, duration);
//
//        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0,0);
//        toast.show();

        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.customTo));

        TextView text = (TextView) layout.findViewById(R.id.textView);
        text.setText("This is custom toast");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }

}
