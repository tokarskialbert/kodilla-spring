package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean isTaskExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("executing shopping task");
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }

    public void setTaskExecuted(boolean taskExecuted) {
        isTaskExecuted = taskExecuted;
    }
}
