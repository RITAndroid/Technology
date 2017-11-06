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

import org.w3c.dom.Text;

public class Web_Technology extends AppCompatActivity {
    TextView t1, t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_technology);
        t1 = (TextView) findViewById(R.id.textView7);
        t2 = (TextView) findViewById(R.id.textView6);
        t2.setText("Web Technology");
        t1.setText("Web development is a broad term for the work involved in developing a web site for the Internet (World Wide Web) or an intranet (a private network). Web development can range from developing the simplest static single page of plain text to the most complex web-based internet applications (or just 'web apps') electronic businesses, and social network services. A more comprehensive list of tasks to which web development commonly refers, may include web engineering, web design, web content development, client liaison, client-side/server-side scripting, web server and network security configuration, and e-commerce development. Among web professionals, \"web development\" usually refers to the main non-design aspects of building web sites: writing markup and coding.");

    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.button11:
                Intent i1 = new Intent(this, web_data.class);
                startActivity(i1);
                break;
            case R.id.button16:
                Intent i2 = new Intent(this, web_data.class);
                startActivity(i2);
                break;
            //Intent i=new Intent(this,web_data.class);
            //startActivity(i);
        }
    }
}