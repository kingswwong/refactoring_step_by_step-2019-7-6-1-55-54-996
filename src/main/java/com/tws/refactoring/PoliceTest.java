package com.tws.refactoring;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Created by KingsWong on 2019/7/15.
 */
public class PoliceTest {
    @Test
    public void should_return_false_in_check_driver_when_driver_age_less_than_18(){
        Driver driver = new Driver(17);
        Police police = new Police();

        assertSame(police.checkDriver(driver),false);
    }

}
