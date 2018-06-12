package com.example.goa.socialmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PostActivity extends AppCompatActivity {





    RelativeLayout relativeLayout;

    TextView textView;

    TextView address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);


        relativeLayout = (RelativeLayout)findViewById(R.id.imgUser);

        textView = (TextView)findViewById(R.id.tv_name);
        address = (TextView)findViewById(R.id.tv_address);







    }
}
