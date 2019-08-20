package com.tizz.xiaomeng;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.tizz.xiaomeng.UI.fragment.fragment_discovery;
import com.tizz.xiaomeng.UI.fragment.fragment_msg;

public class MainActivity extends FragmentActivity implements
        View.OnClickListener {

    private fragment_msg fg1;
    private fragment_discovery fg2;
    private fragment_discovery fg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v){

    }
}
