package com.dyx.cnc;

import android.app.Application;

import io.realm.Realm;

/**
 * project name：CNodeClient
 * class describe：
 * create person：dayongxin
 * create time：2017/7/8 下午5:16
 * alter person：dayongxin
 * alter time：2017/7/8 下午5:16
 * alter remark：
 */
public class XApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initData();
    }

    private void initData() {
        Realm.init(this);
    }
}
