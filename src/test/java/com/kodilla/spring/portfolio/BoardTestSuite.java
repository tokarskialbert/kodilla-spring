package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testBoardWithToDoList() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //when
        String listName = board.getToDoList().getListName();

        //then
        Assert.assertTrue(listName.equals("To Do List"));
    }

    @Test
    public void testBoardWithInProgressList() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //when
        String listName = board.getInProgressList().getListName();

        //then
        Assert.assertTrue(listName.equals("In Progress List"));
    }

    @Test
    public void testBoardWithDoneList() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //when
        String listName = board.getDoneList().getListName();

        //then
        Assert.assertTrue(listName.equals("Done List"));
    }

    @Test
    public void testTaskAddToDoList() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //when
        board.getToDoList().addTaskToList("Zadanie");
        String task = board.getToDoList().tasks.get(0);

        //then
        Assert.assertTrue(task.equals("Zadanie"));
    }

    @Test
    public void testTaskAddInProgressList() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //when
        board.getInProgressList().addTaskToList("Zadanie");
        String task = board.getInProgressList().tasks.get(0);

        //then
        Assert.assertTrue(task.equals("Zadanie"));
    }

    @Test
    public void testTaskDoneList() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //when
        board.getDoneList().addTaskToList("Zadanie");
        String task = board.getDoneList().tasks.get(0);

        //then
        Assert.assertTrue(task.equals("Zadanie"));
    }
}



