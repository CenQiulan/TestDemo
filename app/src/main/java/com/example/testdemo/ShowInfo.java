package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowInfo extends AppCompatActivity {
    private int []stuImg={
            R.mipmap.stu_1, R.mipmap.stu_2,R.mipmap.stu_3,R.mipmap.stu_4,R.mipmap.stu_5,
            R.mipmap.stu_6,R.mipmap.stu_7,R.mipmap.stu_8,R.mipmap.stu_9,R.mipmap.stu_10,
            R.mipmap.stu_11,R.mipmap.stu_12,R.mipmap.stu_13,R.mipmap.stu_14,R.mipmap.stu_15,
            R.mipmap.stu_16,R.mipmap.stu_17,R.mipmap.stu_18,R.mipmap.stu_19,R.mipmap.stu_20,
            R.mipmap.stu_21,R.mipmap.stu_22,R.mipmap.stu_23,R.mipmap.stu_24,R.mipmap.stu_25,
            R.mipmap.stu_26,R.mipmap.stu_27,R.mipmap.stu_28,R.mipmap.stu_29,R.mipmap.stu_30,
            R.mipmap.stu_31,R.mipmap.stu_32};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);
        Intent intent=getIntent();
        String string=intent.getStringExtra("stuId");
        int position=intent.getIntExtra("stu_position",0);
        ImageView imageView=findViewById(R.id.show_img);
        imageView.setImageResource(stuImg[position]);

        TextView textView=findViewById(R.id.show_info);
        textView.setText("the student's id is:"+string);

        Button button=findViewById(R.id.btn_return);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShowInfo.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
