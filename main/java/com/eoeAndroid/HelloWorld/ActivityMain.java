package com.eoeAndroid.HelloWorld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityMain extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //将布局文件设置为main.xml
        setContentView(R.layout.main);
        //得到两个Button控件
        Button mButton1 = (Button)findViewById(R.id.button1);
        Button mButton2 = (Button)findViewById(R.id.button2);
        //为Button1绑定单击事件
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Auto-generated method stub
                //使用intent启动ActivityB
                Intent _intent = new Intent(ActivityMain.this, ActivityB.class);
                startActivity(_intent);
            }
        });
        TextView tv = new TextView(this);
        tv.setText("���,Android");
        setContentView(tv);
    }
}