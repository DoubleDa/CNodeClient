package com.dyx.cnc.lib.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * project name：CNodeClient
 * class describe：
 * create person：dayongxin
 * create time：2017/7/8 下午6:04
 * alter person：dayongxin
 * alter time：2017/7/8 下午6:04
 * alter remark：
 */
public class ToastUtils {

    public static void show(Context context, String result) {
        Toast.makeText(context, result, Toast.LENGTH_SHORT).show();
    }
}
