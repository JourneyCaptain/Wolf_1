package Lektion_15.book.model;

public class Book {
    //поля класса Book
    public String title;// title
    public String author;// author
    public int year;// year
    public long isbn;// ISBN number of book




    public void display() {
        System.out.print("Title " + title + " , ");
        System.out.print("Author " + author + " , ");
        System.out.print("Year " + year + " , ");
        System.out.print(" ISBN " + isbn + " , ");
        System.out.println();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (!(year < 1450 || year > 2023)){
            System.out.println("This year is not allowed");
            this.year = -1;

        }else {
            this.year = year;

        }

    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public Book(String title, String author, int year, long isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;

    }
}
