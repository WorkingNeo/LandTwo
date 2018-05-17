package com.neo.landtwo;

import android.app.Application;

import com.neo.landtwo.emas.EmasInit;

/**
 * Created by Administrator on 2018/5/17.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        EmasInit emas = new EmasInit(this);
        //初始化高可用
//        emas.initHA();
//        //初始化应用更新
        emas.initUpdate();
        //初始化Weex
        emas.initWeex();
    }
}
