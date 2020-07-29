package com.luffy.business2;

import com.luffy.baselayer.IBusiness2Provider;

public class Business2Provider implements IBusiness2Provider {
    @Override
    public String getData() {
        return "业务2返回的数据";
    }
}
