package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

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
    private int []stuImg={
            R.mipmap.stu_1, R.mipmap.stu_2,R.mipmap.stu_3,R.mipmap.stu_4,R.mipmap.stu_5,
            R.mipmap.stu_6,R.mipmap.stu_7,R.mipmap.stu_8,R.mipmap.stu_9,R.mipmap.stu_10,
            R.mipmap.stu_11,R.mipmap.stu_12,R.mipmap.stu_13,R.mipmap.stu_14,R.mipmap.stu_15,
            R.mipmap.stu_16,R.mipmap.stu_17,R.mipmap.stu_18,R.mipmap.stu_19,R.mipmap.stu_20,
            R.mipmap.stu_21,R.mipmap.stu_22,R.mipmap.stu_23,R.mipmap.stu_24,R.mipmap.stu_25,
            R.mipmap.stu_26,R.mipmap.stu_27,R.mipmap.stu_28,R.mipmap.stu_29,R.mipmap.stu_30,
            R.mipmap.stu_31,R.mipmap.stu_32};
    private ListView listView;
    ColorMatrixColorFilter filter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);

        ColorMatrix colorMatrix=new ColorMatrix();
        colorMatrix.setSaturation(0);
        filter=new ColorMatrixColorFilter(colorMatrix);

        MyAdapter myAdapter=new MyAdapter();
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,ShowInfo.class);
                intent.putExtra("stuId",stuId[position]);
                intent.putExtra("stu_position",position);
                startActivity(intent);
                finish();
            }
        });
    }

    private class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return stuImg.length;
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
            View view = getLayoutInflater().inflate(R.layout.listitem, null);
            ImageView imgV =view.findViewById(R.id.item_img);
            TextView textView=view.findViewById(R.id.item_text);

            imgV.setImageResource(stuImg[position]);
            imgV.setColorFilter(filter);
            textView.setText(stuId[position]);
            return view;
        }
    }
}
