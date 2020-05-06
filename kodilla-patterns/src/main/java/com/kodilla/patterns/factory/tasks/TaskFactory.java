package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final Task makeTask(final Tasks taskEnum) {

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
