package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testDrivingTask() {

        //give
        TaskFactory taskFactory = new TaskFactory();

        //when
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        String taskName = drivingTask.getTaskName();

        //then
        Assert.assertEquals("Driving Task", taskName);
    }

    @Test
    public void testShoppingTask() {

        //give
        TaskFactory taskFactory = new TaskFactory();

        //when
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        String taskName = shoppingTask.getTaskName();

        //then
        Assert.assertEquals("Shopping Task", taskName);
    }
}
