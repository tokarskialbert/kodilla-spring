package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> tasks;
    private String listName;

    public TaskList(String listName) {

        this.listName = listName;
        this.tasks = new ArrayList<>();
    }

    public void addTaskToList(String task) {

        tasks.add(task);
    }

    public String getListName() {
        return listName;
    }
}
