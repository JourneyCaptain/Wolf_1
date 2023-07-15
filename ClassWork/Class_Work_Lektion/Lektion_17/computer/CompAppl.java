package Lektion_17.computer;

public class CompAppl {
    public static void main(String[] args) {
        //tak sozdaeom obiektnuiu peremenuiu klassa Computer s poliami i znacenie

        System.out.println();
        Computer comp1 = new Computer("i5 " ,16 , 512 , "HP ");
        comp1.display();
        Computer comp2 = new Computer("i5 " ,16 , 512 , "Asus ");
        comp2.display();

        Laptop lap1 = new  Laptop ("i7 " , 32 , 1024 , "Acer " ,  13 , 2 , " black " );
        lap1.display();
        System.out.println();
    }
}
