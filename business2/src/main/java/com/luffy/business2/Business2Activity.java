package com.luffy.business2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.luffy.baselayer.IBusiness1Provider;
import com.luffy.baselayer.IBusiness2Provider;
import com.luffy.serviceproviderlib.ServiceProvider;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Business2Activity extends AppCompatActivity {

    @BindView(R2.id.txt_content)
    TextView txtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business2);
        ButterKnife.bind(this);
    }

    @OnClick({R2.id.btn_get_data})
    public void onViewClicked(View view) {
        if (view.getId() == R.id.btn_get_data) {
            List<IBusiness1Provider> iBusiness1Providers = ServiceProvider.getServices("business1");
            if (!iBusiness1Providers.isEmpty()) {
                txtContent.setText(iBusiness1Providers.get(0).getData());
            }
        }
    }
}
