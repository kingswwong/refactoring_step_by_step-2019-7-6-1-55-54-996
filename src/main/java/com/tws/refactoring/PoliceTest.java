package com.tws.refactoring;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void should_return_true_in_check_driver_when_driver_age_more_than_18(){
        Driver driver = new Driver(22);
        Police police = new Police();

        assertSame(police.checkDriver(driver),true);
    }

    @Test
    public void should_return_true_in_check_driver_when_driver_age_equal_18(){
        Driver driver = new Driver(18);
        Police police = new Police();

        assertSame(police.checkDriver(driver),true);
    }

    @Test
    public void should_catch_null_pointer_exception_when_driver_is_null(){
        Police police = new Police();

        assertThrows(NullPointerException.class,()->{police.checkDriver(null);});
    }
}
