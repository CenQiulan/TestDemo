package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String[]stuId={
            "20161707",
            "20161713",
            "20171591",
            "20171592",
            "20171616",
            "20171627",
            "20171641",
            "20171649",
            "20171650",
            "20171653",
            "20171654",
            "20171655",
            "20171656",
            "20171659",
            "20171664",
            "20171666",
            "20171667",
            "20171668",
            "20171669",
            "20171670",
            "20171679",
            "20171688",
            "20171697",
            "20171705",
            "20171707",
            "20171714",
            "20171717",
            "20171731",
            "20171742",
            "20175064",
            "20175980",
            "20175990"
    };
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);
/*        MyAdaptor myAdaptor=new MyAdaptor();
        listView.setAdapter(myAdaptor);*/
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.listitem, R.id.list_item, stuId);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
/*        List<Map<String, String>> data=new ArrayList<>();
        for(int i=0;i<name.length;i++){
            Map<String,String>item=new HashMap<>();
            item.put("name",name[i]);
            data.add(item);
        }
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,data,R.layout.listitem,new String[]{"name"},new int[]{R.id.list_item});
        listView.setAdapter(simpleAdapter);
    }*/
    //give data to listview
  /*  private class MyAdaptor extends BaseAdapter {


        @Override
        public int getCount() {
            return name.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            System.out.println("position:" + position);

            View view = getLayoutInflater().inflate(R.layout.listitem, null);
            TextView textView = (TextView) view.findViewById(R.id.list_item);
            textView.append(name[position]);

            return view;
    }
    }*/
}
