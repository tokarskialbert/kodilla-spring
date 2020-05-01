package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Circle;
import com.kodilla.patterns.factory.Rectangle;
import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.Square;

public class TaskFactory {

    public static final String DRIVING_TASK  = "driving task";
    public static final String PAINTING_TASK  = "painting task";
    public static final String SHOPPING_TASK  = "shopping task";

    public final Task makeTask(final String taskClass) {

        switch (taskClass) {
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
