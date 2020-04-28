package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {

        //given //when
        Logger.getInstance().log("log");
        String log = Logger.getInstance().getLastLog();

        //then
        Assert.assertTrue(log.equals("log"));
    }
}
