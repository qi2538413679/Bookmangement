package com.ctgu.j12.vo;

public class bookinfo {

    private String ISBN;
    private String bookname;
    private String classnumber;
    private String author;
    private int nownumber;

    public String getISBN() {
        return ISBN;
    }

    public String getBookname() {
        return bookname;
    }

    public String getClassnumber() {
        return classnumber;
    }

    public String getAuthor() {
        return author;
    }

    public int getNownumber() {
        return nownumber;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setClassnumber(String classnumber) {
        this.classnumber = classnumber;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNownumber(int nownumber) {
        this.nownumber = nownumber;
    }
}
