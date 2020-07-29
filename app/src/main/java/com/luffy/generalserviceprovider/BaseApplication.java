package com.luffy.generalserviceprovider;

import android.app.Application;

import com.luffy.baselayer.IBusiness1Provider;
import com.luffy.baselayer.IBusiness2Provider;
import com.luffy.baselayer.IModuleNameProvider;
import com.luffy.serviceproviderlib.ServiceProvider;

/**
 * Created by lvlufei on 2020-07-29
 *
 * @name
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ServiceProvider.register(this, "module_name", IModuleNameProvider.class);
        ServiceProvider.register(this, "business1", IBusiness1Provider.class);
        ServiceProvider.register(this, "business2", IBusiness2Provider.class);
    }
}
