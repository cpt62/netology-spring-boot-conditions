package com.obmachevsky.springbootconditionapp.service.dev;

import com.obmachevsky.springbootconditionapp.service.SystemProfile;

public class DevProfile implements SystemProfile {

    @Override
    public String getProfile() {
        return "Current profile is dev \n";
    }
}
