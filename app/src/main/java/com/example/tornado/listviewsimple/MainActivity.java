package com.example.tornado.listviewsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        // tarrif dasty mohtava
        String [] names=new String[]{"ali","reza","ahmad","majid","mohsen","ali","reza","ahmad","majid","mohsen"};

        //etesal be adapter
        ArrayAdapter<String>  adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, names);

        listView.setAdapter(adapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {


               Toast.makeText(MainActivity.this, position +"", Toast.LENGTH_SHORT).show();
           }
       });



    }
}
