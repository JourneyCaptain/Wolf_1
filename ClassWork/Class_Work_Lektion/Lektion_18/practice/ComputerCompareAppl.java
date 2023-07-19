package Lektion_18.practice;

import Lektion_18.practice.model.Computer;

public class ComputerCompareAppl {
    public static void main(String[] args) {
        Computer comp1 = new Computer("i5", 8, 256, "Lenovo");
        Computer comp2 = new Computer("i5", 8, 256, "Lenovo");
        System.out.println(comp1 == comp2);
        System.out.println(comp1.equals(comp2));
    }
}
