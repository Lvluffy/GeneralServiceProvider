package com.luffy.business1;

import com.luffy.baselayer.IBusiness1Provider;

public class Business1Provider implements IBusiness1Provider {
    @Override
    public String getData() {
        return "业务1返回的数据";
    }
}
