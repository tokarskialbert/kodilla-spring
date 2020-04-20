package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Board {

    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    @Autowired
    public Board(@Qualifier("toDoList")TaskList toDoList, @Qualifier("inProgressList")TaskList inProgressList, @Qualifier("doneList")TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
