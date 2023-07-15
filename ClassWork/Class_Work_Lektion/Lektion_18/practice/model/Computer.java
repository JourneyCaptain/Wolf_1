package Lektion_18.practice.model;

import java.util.Objects;

public class Computer {

   protected String cpu;
   protected int ram;
   protected int ssd;
   protected String brand;

    public Computer(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", CPU: " + cpu + "RAM: " + ram + ", SSD: " + ssd;
    }
    // metod de comparare a obijectelor
    @Override
    public boolean equals(Object obj) { //semnatura metodei: Modificator, TIP DE INTOARCERE METODEI ZNACENIE, nume
        // tip peremenoi i eeo imea catoroi prinimaet metod
        if (this == obj) return true; // esli mi sravnimaem objekt sam s saboi, vozvroseaem true
        if (!(obj instanceof Computer computer)) return false; // esli sravnivaem s null ili (||) objekti iz raznih klassov
        return ram == computer.ram && ssd == computer.ssd && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand);
    }












    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, ssd, brand);
    }
}
