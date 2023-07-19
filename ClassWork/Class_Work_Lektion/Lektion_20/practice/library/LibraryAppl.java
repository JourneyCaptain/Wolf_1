package Lektion_20.practice.library;

import Lektion_20.practice.library.models.Library;

public class LibraryAppl {
    public static void main(String[] args) {

        Library library = new Library(1000);
        library.addBook(new Book("War and Peace", "Lev Tolstoi", 1990,2000000000000L));
        library.addBook(new Book("Anna Karenina", "Lev Tolstoi", 1995,2000000000001L));
        library.addBook(new Book("1984", "Oruell", 1985,2000000000002L));
//        books[0] = new Book("War and Peace", "Lev Tolstoi", 1990,2000000000000L);
//        books[1] = new Book("Anna Karenina", "Lev Tolstoi", 1995,2000000000001L);
//        books[2] = new Book("451", "Ray Bredberry", 1965,2000000000002L);
//        books[3] = new Book("1984", "George Orwell", 1985,2000000000003L);

        System.out.println(library.getSize());

        Book bookFinded =  library.findBook(2000000000001L);
        System.out.println(bookFinded);

        System.out.println(library.findBook(2000000000001L));


    }
}