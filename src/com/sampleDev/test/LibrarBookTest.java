package com.sampleDev.test;
import com.sampleDev.LibraryBook;

import java.util.*;
/**
 * Created by dedeHan on 5.12.2015.
 */
public class LibrarBookTest {

    public static void main(String[] args) {

        GregorianCalendar dueDate;
        LibraryBook book1, book2, book3, book4;

        dueDate = new GregorianCalendar(2015, Calendar.MARCH, 14);
        book1 = new LibraryBook(dueDate);

        dueDate = new GregorianCalendar(2015, Calendar.FEBRUARY,13);
        book2 = new LibraryBook(dueDate,0.75);

        dueDate = new GregorianCalendar(2015, Calendar.JANUARY, 12);
        book3 = new LibraryBook(dueDate, 1.00, 100.00);

        dueDate = new GregorianCalendar(2015, Calendar.JANUARY, 1);
        book4 = new LibraryBook(dueDate, 1.50, 230.00, "Me and My java");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());


    }
}
