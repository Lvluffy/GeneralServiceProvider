package com.luffy.generalserviceprovider;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.luffy.baselayer.IModuleNameProvider;
import com.luffy.business1.Business1Activity;
import com.luffy.business2.Business2Activity;
import com.luffy.serviceproviderlib.ServiceProvider;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txt_content)
    TextView txtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //显示注册的模块
        List<IModuleNameProvider> providerList = ServiceProvider.getServices("module_name");
        StringBuilder stringBuilder = new StringBuilder("目前注册的模块有：\n");
        for (IModuleNameProvider iModuleNameProvider : providerList) {
            stringBuilder.append(iModuleNameProvider.getModuleName()).append("\n");
        }
        txtContent.setText(stringBuilder.toString());
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
