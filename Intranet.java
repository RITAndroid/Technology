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

public class Intranet extends AppCompatActivity {
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intranet);
        t1 = (TextView) findViewById(R.id.textView4);
        t2 = (TextView) findViewById(R.id.textView9);
        t1.setText("Intranet");
        t2.setText("An intranet is a private network accessible only to an organization's staff. Generally a wide range of information and services from the organization's internal IT systems are available that would not be available to the public from the Internet. A company-wide intranet can constitute an important focal point of internal communication and collaboration, and provide a single starting point to access internal and external resources. In its simplest form an intranet is established with the technologies for local area networks (LANs) and wide area networks (WANs).");
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.button10:
                Intent i1 = new Intent(this, intranet_data.class);
                startActivity(i1);
                break;
            case R.id.button14:
                Intent i2 = new Intent(this, intranet_data.class);
                startActivity(i2);
                break;
            // Intent i2=new Intent(this,intranet_data.class);
            //startActivity(i2);
        }
    }
}
