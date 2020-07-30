package com.luffy.generalserviceprovider;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.luffy.business1.Business1Activity;
import com.luffy.business2.Business2Activity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_1, R.id.btn_2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                startActivity(new Intent(this, Business1Activity.class));
                break;
            case R.id.btn_2:
                startActivity(new Intent(this, Business2Activity.class));
                break;
        }
    }
}
