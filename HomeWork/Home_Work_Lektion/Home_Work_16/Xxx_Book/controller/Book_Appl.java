package Home_Work_16.Xxx_Book.controller;

import Home_Work_16.Xxx_Book.model.Book;

public class Book_Appl {
    public static void main(String[] args) {

        //  Создать класс BookAppl в пакете xxx.book с методом main.
        //  В методе main создать несколько экземпляров Book и вывести
        //  для каждого из них результат работы метода display.


        Book book1 = new Book (864452987, "Die Kreatur von Jekyll Island",  "Edward Griffin", 1994 );
        Book book2 = new Book (799270650, "Философы от мира сего", 1953 );//absence of author
        Book book3 = new Book (423340489, "Die Gesetze der Gewinner", "Bodo Schäfer" );//absence of the year the publisher
        Book book4 = new Book ( "Библия капиталиста",  "Денис Борисов", 2020 );//absence of the ISBN




        book1. display ();
        book2.display();
        book3.display();
        book4.display();


    }
}
