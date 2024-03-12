package com.filip.worklearning.environment;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Browser {
    CHROME(DriverManagerType.CHROME),
    FIREFOX(DriverManagerType.FIREFOX),
    HEADLESS(DriverManagerType.CHROME),
    CHROMIUM(DriverManagerType.CHROMIUM);
    private DriverManagerType driverType;
}
