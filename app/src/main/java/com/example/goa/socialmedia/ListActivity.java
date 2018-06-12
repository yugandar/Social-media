package com.example.goa.socialmedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

public class ListActivity extends AppCompatActivity {


    Toolbar toolbar;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);




            listView = (ListView) findViewById(R.id.listview);

            ArrayAdapter<String> mAdapter;
            mAdapter = new ArrayAdapter<String>(ListActivity.this,
                    android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.countries));

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(ListActivity.this, ListActivity.class);
                    intent.putExtra("CountryName", listView.getItemAtPosition(i).toString());
                    startActivity(intent);
                }
            });
            listView.setAdapter(mAdapter);
        }

}
