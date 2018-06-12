package com.example.goa.socialmedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    private  Button profile,map,grid,list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            profile =(Button)findViewById(R.id.profile);

            grid =(Button)findViewById(R.id.grid);

            map =(Button)findViewById(R.id.map);

            list =(Button)findViewById(R.id.list);



        profile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent i = new Intent(getApplicationContext(),PostActivity.class);
                    startActivity(i);
                }
            });
            grid.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent i = new Intent(getApplicationContext(),GridView.class);
                    startActivity(i);
                }
            });

            map.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent i = new Intent(getApplicationContext(),MapActvity.class);
                    startActivity(i);
                }
            });

            list.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent i = new Intent(getApplicationContext(),ListActivity.class);
                    startActivity(i);
                }
            });



        }
    }


