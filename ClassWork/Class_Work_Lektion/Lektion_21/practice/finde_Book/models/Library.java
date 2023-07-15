package Lektion_21.practice.finde_Book.models;

// добавление, удаление, поиск книги

import practice.finde_Book.library.Book;

public class Library {
    private Book[] books; // массив типа Book, куда попадут все книги в библиотеке
    private int size; // количество книг в библиотеке

    // метод класса, который задает размер библиотеки, т.е. длину массива Book
    public Library(int capacity) {
        books = new Book[capacity];
    }

    // метод добавление книги
    public boolean addBook(Book book) {
        if ((size == books.length) || findBook(book.getIsbn()) != null) {
            return false; // не можем добавить книгу, так как нем места или такая книга уже есть
        }
        books[size] = book; // помещаем книгу в массив
        size++;
        return true;
    }

    // метод поиска книги по ISBN
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) { // пробегаем по массиву
            if (books[i].getIsbn() == isbn) { // проверяем совпадение ISBN
                return books[i]; // возвращаем элемент массива типа Book
            }
        }
        return null;
    }

    public Book[] findBookAuthor(String author, Book[] books) {
        int count = 0;
        for (int i = 0; i < size; i++) { // пробегаем по массиву
            if (author.equals(books[i].getAuthor())) { // проверяем совпадение ISBN
                count++;
                // return books[i]; // возвращаем элемент массива типа Book
            }

        }
        System.out.println("Number of books: " + count);
        Book[] booksf = new Book[count];
        //int index = 0;
        for (int i = 0; i < booksf.length; i++) {
            // пробегаем по массиву
            for (int j = 0;  i< size; i++)
                if (author.equals(books[j].getAuthor())) { // проверяем совпадение ISBN
                    booksf[i] = books[j];
                    j++;
                }
        }

        return booksf;
    }

    public int getSize () {
        return size;

    }
    public Book removeBook( long isbn, Book[] books){
        Book victim = null;
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn){
               victim = books [i];
               books[i] = books [size -1];
                books [size -1] = null;
                size--;
                break;
            }
        }
        return victim;
    }

}

//    //count how many books of author
//    int count = 0;
//        for (int i = 0; i < books.length; i++) { // пробегаем по массиву
//        if (author.equals(books[i].getAuthor())) { // проверяем совпадение строк в поле author
//        count++; // возвращаем элемент массива типа Book
//        }
//        }
//        System.out.println("Number of books: " + count);
//
//        //заполним массив с результатами поиска
//        Book[] booksf = new Book[count]; // определил массив размером по кол-ву найденных
//        for (int i = 0; i < count; i++) {
//        for (int j = 0; j < books.length; j++) { // пробегаем по массиву
//        if (author.equals(books[j].getAuthor())) { // проверяем совпадение строк в поле author
//        booksf[i] = books[j]; // заполняем массив booksf
//        i++;
//        }
//        }
//        }
//        return booksf;
//        }