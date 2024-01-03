package Models;

import java.util.Date;

public class Book {
    public int ISBN;
    public String bookName;
    public String description;
    public String language;
    public String author;
    public String type;
    public int pageCount;
    public int status; // 1: in stock, 0: out of stock
    private int memberID;
    private Date barrowed_at;
    private Date expected_at;

    public String getMember() { // should return a member object not a string
        return memberID + "";
    }

    public Date getBarrowed_at() {
        return barrowed_at;
    }

    public Date getExpected_at() {
        return expected_at;
    }

    public Book() {
        // empty constructor
    }

    public Book(int ISBN, String bookName, String description, String language, String author, String type, int pageCount, int status) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.description = description;
        this.language = language;
        this.author = author;
        this.type = type;
        this.pageCount = pageCount;
        this.status = status;
    }
}
