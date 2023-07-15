package Lektion_17.beverage;

public class BeverageAppl {
    public static void main(String[] args) {
        System.out.println();
        Beverage bev1 = new  Beverage ();
        bev1.displayStock();
        bev1.toBuy("Cola", "bottle", 5);
        bev1.displayStock();
        System.out.println();

        Beverage bev2 =new Beverage();
        bev2.toBuy("Wine" , "box" , 2);
        bev2.displayStock();
        System.out.println();

        Beer beer1 = new Beer();
        beer1.toBuy("Beer", "box", 3, "weiss beer");
        beer1.displayStock();

    }
}
