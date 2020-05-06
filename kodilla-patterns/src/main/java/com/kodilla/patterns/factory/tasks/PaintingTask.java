package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isTaskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("executing painting task");
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