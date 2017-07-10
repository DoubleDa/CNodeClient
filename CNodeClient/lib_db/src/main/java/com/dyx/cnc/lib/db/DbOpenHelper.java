package com.dyx.cnc.lib.db;

import io.realm.Realm;

/**
 * project name：CNodeClient
 * class describe：
 * create person：dayongxin
 * create time：2017/7/8 下午5:02
 * alter person：dayongxin
 * alter time：2017/7/8 下午5:02
 * alter remark：
 */
public class DbOpenHelper {
    private volatile static DbOpenHelper mInstance = null;
    private static Realm mRealm;

    private DbOpenHelper() {

    }

    public static DbOpenHelper getInstance() {
        if (mInstance == null) {
            synchronized (DbOpenHelper.class) {
                if (mInstance == null) {
                    mInstance = new DbOpenHelper();
                    mRealm = Realm.getDefaultInstance();
                }
            }
        }
        return mInstance;
    }

    /**
     * 数据库操作：
     * 1、增；
     * 2、删；
     * 3、改；
     * 4、查；
     */
    public void creatingObjects() {

    }
}
