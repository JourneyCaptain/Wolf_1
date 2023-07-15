package Home_Work_16.Xxx_Book.model;

public class Book {

//    Задача 1. Создать класс Book в пакете xxx.book.model.
//    В этом классе определить поля: private long isbn;
//    private String title; private String author; private int yearOfPublishing;
//    Создать конструкторы для иницализации всех полей,
//    и конструктор для инициализации полей при отсутствии автора.
//    Остальные конструкторы на Ваше усмотрение. Создать геттеры и сеттеры,
//    исходя из логики и необходимости. Создать метод public void display()
//    для печати в консоль информации о книге.
//
//    Создать класс BookAppl в пакете xxx.book с методом main.
//    В методе main создать несколько экземпляров Book и вывести
//    для каждого из них результат работы метода display.

    private long isbn;
    private String title;
    private String author;
    private int yearOfPublishing;

    public Book(long isbn, String title, String author, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;


        }
    //absence of author
     public Book(long isbn, String title, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
    }

    //absence of the year the publisher
    public Book(long isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    //absence of the ISBN
    public Book(String title, String author, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public void display(){
           // System.out.println("ISBN: " + isbn + ", "  + "Title: " + title + ", " + "Author: " + author + ", " + "Year of publishing: " + yearOfPublishing);
        System.out.println();
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of publishing: " + yearOfPublishing);
        System.out.println();
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
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

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}
