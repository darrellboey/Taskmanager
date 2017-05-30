package com.example.a15056233.taskmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Button btnadd ;
    ArrayAdapter aa;
    ArrayList<String> al;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.listViewTask);
        btnadd = (Button)findViewById(R.id.buttonAddTask);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AddActivity.class);
                startActivity(intent);
            }
        });

        DBHelper dbh = new DBHelper(this);
        ArrayList<String> task = dbh.getAllData();

        aa = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1, task);
        lv.setAdapter(aa);
        aa.notifyDataSetChanged();

    }
}
