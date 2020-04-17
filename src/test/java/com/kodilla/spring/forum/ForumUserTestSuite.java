package com.kodilla.spring.forum;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import org.junit.Assert;
import org.junit.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ForumUserTestSuite {

    @Test
    public void testGetUsername() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser user = context.getBean(ForumUser.class);

        //When
        String userName = user.getUsername();

        //Then
        Assert.assertEquals("John Smith", userName);
    }
}
