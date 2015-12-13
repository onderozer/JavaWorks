package com.sampleDev;
import java.util.*;
/**
 * Created by dedeHan on 5.12.2015.
 */
public class BookTracker {
    public static final int ERROR = -1;

    private  List<LibraryBook> books;

    public BookTracker() {
        books = new LinkedList<LibraryBook>();
    }

    public void add(LibraryBook book)
    {
        books.add(book);
    }

    public double getCharge()
    {
        return getCharge(new GregorianCalendar());
    }

    public double getCharge(GregorianCalendar returnDate)
    {
        if (books.isEmpty())
        {
            return ERROR;
        }
        else
        {
            return totalCharge(returnDate);
        }
    }

    public String getList()
    {
        StringBuffer result = new StringBuffer("");
        String lineSeperator = System.getProperty("line.seperator");
        for (LibraryBook book:books)
        {
            result.append(book.toString() + lineSeperator);
        }

        return result.toString();
    }



    private double totalCharge(GregorianCalendar returnDate)
    {
        double totalCharge = 0.0;
        for(LibraryBook book:books)
        {
           // totalCharge += book.computeCharge(returnDate);
        }

        return totalCharge;
    }
}
