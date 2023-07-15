package Lektion_2;

public class Salary {
    public static void main(String[] args) {
        int salaryBrutto = 5000;
        String salaryBruttoText = "Zarplata brutto v razmere ";
        System.out.println(salaryBruttoText + salaryBrutto);

        int churchTax = 45;
        int salaryTax = 490;
        int pensionTax = 460;
        int unemploymentTax = 65;
        int medicalTax = 400;
        int careTax = 95;

        String taxText = "Suma nalogov ";
        int tax = churchTax + salaryTax + pensionTax + unemploymentTax + medicalTax + careTax;
        System.out.println(taxText + tax);

        String salaryNettoText = "Na bankovschii scheot prihodit summa ";
        int salaryNetto = salaryBrutto - tax;
        System.out.println(salaryBruttoText + salaryNetto);


    }
}
