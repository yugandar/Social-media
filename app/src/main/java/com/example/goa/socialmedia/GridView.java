package com.example.goa.socialmedia;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;


public class GridView extends AppCompatActivity {

    android.widget.GridView gridView;
    ArrayList<Item> gridArray = new ArrayList<Item>();
    CustomGridViewAdapter customGridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_main);

        //set grid view item
        Bitmap homeIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.home);
        Bitmap userIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.personal);

        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(userIcon,"User"));
        gridArray.add(new Item(homeIcon,"House"));
        gridArray.add(new Item(userIcon,"Friend"));
        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(userIcon,"Personal"));
        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(userIcon,"User"));
        gridArray.add(new Item(homeIcon,"Building"));
        gridArray.add(new Item(userIcon,"User"));
        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(userIcon,"xyz"));




        gridView = (android.widget.GridView)findViewById(R.id.gridView1);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);
    }

}