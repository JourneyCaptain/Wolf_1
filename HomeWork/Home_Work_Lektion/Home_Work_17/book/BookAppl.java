package Home_Work_17.book;

public class BookAppl {
    public static void main(String[] args) {
        Dictionary dictionary1 = new Dictionary(  5895265,"English-Russian Dictionary","John Smith",  2021,"English", 1000);
        Dictionary dictionary2 = new Dictionary(4587936,"French-Spanish Dictionary", "Maria Garcia", 2019, "French", 800);


        Book book1 = new Book (864452987, "Die Kreatur von Jekyll Island",  "Edward Griffin", 1994 );
        Book book2 = new Book (799270650, "Философы от мира сего", 1953 );//absence of author
        Book book3 = new Book (423340489, "Die Gesetze der Gewinner", "Bodo Schäfer" );//absence of the year the publisher
        Book book4 = new Book ( "Библия капиталиста",  "Денис Борисов", 2020 );//absence of the ISBN

        book1. display ();
        book2.display();
        book3.display();
        book4.display();




        dictionary1.display();
        dictionary2.display();
    }
}
