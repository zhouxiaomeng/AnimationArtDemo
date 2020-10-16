package com.zxm.animationartdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.zxm.animationartdemo.demo1.Demo1Activity;
import com.zxm.animationartdemo.demo10.Demo10Activity;
import com.zxm.animationartdemo.demo2.Demo2Activity;
import com.zxm.animationartdemo.demo3.Demo3Activity;
import com.zxm.animationartdemo.demo4.Demo4Activity;
import com.zxm.animationartdemo.demo5.Demo5Activity;
import com.zxm.animationartdemo.demo6.Demo6Activity;
import com.zxm.animationartdemo.demo7.Demo7Activity;
import com.zxm.animationartdemo.demo8.Demo8Activity;
import com.zxm.animationartdemo.demo9.Demo9Activity;


/**
 * 有道精品课
 * AnimationArtDemo
 * Description:
 * Created by zxm on 2020/10/16 11:56 AM
 * Copyright @ 2020 网易有道. All rights reserved.
 **/
public class MainActivity extends AppCompatActivity {
    public void demo1(View paramView) {
        startActivity(new Intent(this, Demo1Activity.class));
    }

    public void demo10(View paramView) {
        startActivity(new Intent(this, Demo10Activity.class));
    }

    public void demo2(View paramView) {
        startActivity(new Intent(this, Demo2Activity.class));
    }

    public void demo3(View paramView) {
        startActivity(new Intent(this, Demo3Activity.class));
    }

    public void demo4(View paramView) {
        startActivity(new Intent(this, Demo4Activity.class));
    }

    public void demo5(View paramView) {
        startActivity(new Intent(this, Demo5Activity.class));
    }

    public void demo6(View paramView) {
        startActivity(new Intent(this, Demo6Activity.class));
    }

    public void demo7(View paramView) {
        startActivity(new Intent(this, Demo7Activity.class));
    }

    public void demo8(View paramView) {
        startActivity(new Intent(this, Demo8Activity.class));
    }

    public void demo9(View paramView) {
        startActivity(new Intent(this, Demo9Activity.class));
    }

    @Override
    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_main);
    }
}
