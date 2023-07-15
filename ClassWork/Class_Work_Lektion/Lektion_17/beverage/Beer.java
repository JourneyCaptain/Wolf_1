package Lektion_17.beverage;

public class Beer extends Beverage {
    String type; // white or dark
    public Beer(String title, String packing, int quantity) {
        super(title, packing, quantity);
    }
    public void toBuy (String title, String packing, int quantity, String type) {
        super.toBuy(title, packing, quantity);
        this.type = type;
    }
    public void displayStock () {
        super.displayStock();
        System.out.println("This is " + type + " beer. ");
    }

    public Beer(String title, String packing, int quantity, String type) {
        super(title, packing, quantity);
        this.type = type;
    }

    public Beer(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Beer() {
    }
}
