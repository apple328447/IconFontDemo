package com.example.iconfontdemo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    /**
     * 方法一
     * 1.File>New>Folder>Assests Folder
     * 2.把.ttf檔放進去Assests Folder
     * 3.import android.graphics.Typeface;
     * 4.使用Unicode去看編碼 如果遇到&#xe6e0; 這種 就是取後面四位e6e0
     * 5."\u"為保留斜線
     * */

    /**
     * 方法二
     * 1.File>New>Folder>Fond Resource Folder
     * 2.把.ttf檔放進去Fond Resource Folder
     * 3.Xml裡面使用FontFamily:"" + text:""也可以達成效果
     * */
    TextView icon1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        icon1=(TextView)findViewById(R.id.icon1);
        Typeface typeface=Typeface.createFromAsset(getAssets(),
                "Icons/iconfont.ttf");
        icon1.setTypeface(typeface);

        icon1.setText("\ue6a0");

    }

}
