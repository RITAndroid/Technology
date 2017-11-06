package com.example.ruchita.technology;

/**
 * Created by Ruchita on 10/13/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.ruchita.technology.R;

public class Android_Technology extends AppCompatActivity {
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_technology);

        t2=(TextView)findViewById(R.id.textView8);
        t1=(TextView)findViewById(R.id.textView5);
        t1.setText("Android Technology");
        t2.setText("Android is a mobile operating system developed by Google, based on the Linux kernel and designed primarily for touchscreen mobile devices such as smartphones and tablets. Android's user interface is mainly based on direct manipulation, using touch gestures that loosely correspond to real-world actions, such as swiping, tapping and pinching, to manipulate on-screen objects, along with a virtual keyboard for text input.");


    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.button9:
                Intent i1=new Intent(this,android_data.class);
                startActivity(i1);
                break;
            case R.id.button13:
                Intent i2=new Intent(this,android_data.class);
                startActivity(i2);
                break;

        }

    }
}
