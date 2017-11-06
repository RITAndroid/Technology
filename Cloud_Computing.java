package com.example.ruchita.technology;

/**
 * Created by Ruchita on 10/13/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ruchita.technology.R;

public class Cloud_Computing extends AppCompatActivity {
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud_computing);
        t2 = (TextView) findViewById(R.id.textView2);
        t1 = (TextView) findViewById(R.id.textView);
        t1.setText("Cloud Computing");
        t2.setText("Cloud computing is a computing-infrastructure and software model for enabling ubiquitous access to shared pools of configurable resources (such as computer networks, servers, storage, applications and services),which can be rapidly provisioned with minimal management effort, often over the Internet. Cloud computing allows users and enterprises with various computing capabilities to store and process data either in a privately-owned cloud, or on a third-party server located in a data centre - thus making data-accessing mechanisms more efficient and reliable. Cloud computing relies on sharing of resources to achieve coherence and economy of scale, similar to a utility.the practice of using a network of remote servers hosted on the Internet to store, manage, and process data, rather than a local server or a personal computer");
        /*EditText inputtxt=(EditText) findViewById(R.id.editdata);
        String typedText=inputtxt.getText().toString();
        data.setText(typedText);*/
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.button8:
                Intent i = new Intent(this, cloud_data.class);
                startActivity(i);
                break;
            case R.id.button12:
                Intent i2 = new Intent(this, cloud_data.class);
                startActivity(i2);
                break;

        }
    }
}
