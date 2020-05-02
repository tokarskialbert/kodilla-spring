package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Circle;
import com.kodilla.patterns.factory.Rectangle;
import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.Square;

public class TaskFactory {

    public static final TASKS DRIVING_TASK  = TASKS.DRIVING_TASK;
    public static final TASKS PAINTING_TASK = TASKS.PAINTING_TASK;
    public static final TASKS SHOPPING_TASK = TASKS.SHOPPING_TASK;

    public final Task makeTask(final TASKS taskEnum) {

        switch (taskEnum) {
            case DRIVING_TASK:
                return new DrivingTask("Driving Task", "Library", "Ford");
            case PAINTING_TASK:
                return new PaintingTask("Painting Task", "black", "car");
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping Task", "car", 100_000);
            default:
                return null;
        }

    }
}
