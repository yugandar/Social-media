package com.example.goa.socialmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.MapView;

public class MapActvity extends AppCompatActivity {


    MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_actvity);

        mapView = (MapView)findViewById(R.id.mapView);



    }
}
