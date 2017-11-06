package com.example.ruchita.technology;

/**
 * Created by Ruchita on 10/13/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ruchita.technology.R;

public class Robotics extends AppCompatActivity {
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robotics);
        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);
        t1.setText("Robotics");
        t2.setText("Robotics is an interdisciplinary branch of engineering and science that includes mechanical engineering, electrical engineering, computer science, and others. Robotics deals with the design, construction, operation, and use of robots as well as computer systems for their control, sensory feedback, and information processing.\n" +
                "These technologies are used to develop machines that can substitute for humans. Robots can be used in any situation and for any purpose, but today many are used in dangerous environments.\n");


    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.button8:
                Intent i1 = new Intent(this, robotics_data.class);
                startActivity(i1);
                break;
            case R.id.button17:
                Intent i2 = new Intent(this, robotics_data.class);
                startActivity(i2);
                break;
            //Intent i=new Intent(this,robotics_data.class);
            //startActivity(i);
        }
    }
}