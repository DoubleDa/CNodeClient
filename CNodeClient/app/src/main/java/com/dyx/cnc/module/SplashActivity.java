package com.dyx.cnc.module;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.dyx.cnc.R;
import com.dyx.cnc.module.base.BaseActivity;
import com.dyx.cnc.module.home.MainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * project name：CNodeClient
 * class describe：
 * create person：dayongxin
 * create time：2017/7/8 下午7:06
 * alter person：dayongxin
 * alter time：2017/7/8 下午7:06
 * alter remark：
 */
public class SplashActivity extends BaseActivity {
    @BindView(R.id.btn_start_main)
    Button btnStartMain;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_start_main)
    public void onViewClicked() {
        intentTo(MainActivity.class);
    }

    private void intentTo(Class<?> cla) {
        startActivity(new Intent(this, cla));
        finish();
    }
}
