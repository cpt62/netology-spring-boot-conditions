package com.obmachevsky.springbootconditionapp.service.production;

import com.obmachevsky.springbootconditionapp.service.SystemProfile;

public class ProductionProfile implements SystemProfile {

    @Override
    public String getProfile() {
        return "Current profile is production\n";
    }
}
