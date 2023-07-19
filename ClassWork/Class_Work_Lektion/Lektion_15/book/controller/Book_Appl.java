package Lektion_15.book.controller;

import Lektion_15.book.model.Book;

public class Book_Appl {
    public static void main(String[] args) {
        Book book1 = new Book("Heart of Dragon" , "Kiril Klevanschi" ,2016 , 1000000);
        Book book2 = new Book("Code Da Vinci" , "Den Brown" ,2003 , 1000000);
        Book book3 = new Book("Jack London" , "White" ,2016 , 1000000);

        book1.display();
        book2.display();
        book3.display();
        Book book4 = new Book("Two capitans", "Kaverin", 956,1000000) ;
        book4.display();


    }
}
