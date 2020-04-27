package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean(name = "toDoList")
    public TaskList getToDoList() {
        return new TaskList("To Do List");
    }

    @Bean(name = "inProgressList")
    public TaskList getInProgressList() {
        return new TaskList("In Progress List");
    }

    @Bean(name = "doneList")
    public TaskList getDoneList() {
        return new TaskList("Done List");
    }
}