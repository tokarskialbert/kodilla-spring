package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //given
        Book book1 = new Book("title1", "author1", LocalDate.now());
        Book book2 = new Book("title2", "author2", LocalDate.now());
        Book book3 = new Book("title3", "author3", LocalDate.now());

        Library library1 = new Library("Main Library");
            library1.getBooks().add(book1);
            library1.getBooks().add(book2);
            library1.getBooks().add(book3);

        //when
        int librarySize = library1.getBooks().size();

        //then
        Assert.assertTrue(librarySize == 3);
    }

    @Test
    public void testShallowCopy() throws CloneNotSupportedException {

        //given
        Book book1 = new Book("title1", "author1", LocalDate.now());
        Book book2 = new Book("title2", "author2", LocalDate.now());
        Book book3 = new Book("title3", "author3", LocalDate.now());

        Library library1 = new Library("Main Library");
        library1.getBooks().add(book1);
        library1.getBooks().add(book2);
        library1.getBooks().add(book3);

        //when
        int librarySize = library1.getBooks().size();
        Library library2 = library1.shallowCopy();

        //then
        Assert.assertTrue(librarySize == library2.getBooks().size());
    }

    @Test
    public void testDeepCopy() throws CloneNotSupportedException {

        //given
        Book book1 = new Book("title1", "author1", LocalDate.now());
        Book book2 = new Book("title2", "author2", LocalDate.now());
        Book book3 = new Book("title3", "author3", LocalDate.now());
        Book book4 = new Book("title4", "author4", LocalDate.now());

        Library library1 = new Library("Main Library");
        library1.getBooks().add(book1);
        library1.getBooks().add(book2);
        library1.getBooks().add(book3);

        //when
        int library1Size = library1.getBooks().size();
        Library library2 = library1.deepCopy();
        library2.getBooks().add(book4);
        int library2Size = library2.getBooks().size();
        boolean conditionTrue = library1Size == 3 && library2Size == 4;


        //then
        Assert.assertTrue(conditionTrue);
    }
}
