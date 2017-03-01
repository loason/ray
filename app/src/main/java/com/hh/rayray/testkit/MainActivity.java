package com.hh.rayray.testkit;

import android.app.Activity;
import android.os.Bundle;

import com.hh.android.stock.testkit.callback.OnAddressChangeListener;
import com.hh.android.stock.testkit.callback.OnGetExtraData;
import com.hh.android.stock.testkit.manager.TestKitManager;

public class MainActivity extends Activity {

    String requestUrl = "http://teststock.ray.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestKitManager.getInstance().init(this);
        TestKitManager.getInstance().setOnAddressChangeListener(new OnAddressChangeListener() {
            @Override
            public void onAddressChange(String address) {
                requestUrl = address;
            }
        });
        TestKitManager.getInstance().setCurrentAddress(requestUrl);
    }
}
