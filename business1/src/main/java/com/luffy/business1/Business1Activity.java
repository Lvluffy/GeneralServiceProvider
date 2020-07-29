package com.luffy.business1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.luffy.baselayer.IBusiness2Provider;
import com.luffy.serviceproviderlib.ServiceProvider;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Business1Activity extends AppCompatActivity {

    @BindView(R2.id.txt_content)
    TextView txtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business1);
        ButterKnife.bind(this);
    }

    @OnClick({R2.id.btn_get_data})
    public void onViewClicked(View view) {
        if (view.getId() == R.id.btn_get_data) {
            List<IBusiness2Provider> iBusiness2Providers = ServiceProvider.getServices("business2");
            if (!iBusiness2Providers.isEmpty()) {
                txtContent.setText(iBusiness2Providers.get(0).getData());
            }
        }
    }
}
