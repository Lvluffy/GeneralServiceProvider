package com.luffy.business1;

import com.luffy.baselayer.IModuleNameProvider;

public class ModuleName1 implements IModuleNameProvider {
    @Override
    public String getModuleName() {
        return "ModuleName1";
    }
}
