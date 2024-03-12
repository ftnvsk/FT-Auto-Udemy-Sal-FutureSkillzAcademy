package com.filip.worklearning.environment;

import io.github.bonigarcia.wdm.config.OperatingSystem;

public class OperatingSysFactory {

    public static OperatingSystem getCurrentOs() {
        String opSystem = System.getProperty("os.name").toLowerCase();
        if (opSystem.startsWith("mac")) {
            return OperatingSystem.MAC;
        }
        if (opSystem.startsWith("windows")) {
            return OperatingSystem.WIN;
        }
        return OperatingSystem.LINUX;
    }

}
