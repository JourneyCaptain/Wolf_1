package Home_Work_15.employee.controller;

import Home_Work_15.employee.model.Employee;


public class Firma_Appl {
    public static void main(String[] args) {

        Employee employee1 = new Employee (818520, "Sylvester", "Stallone", "M", 3455.20 ,(byte)4);
        Employee employee2 = new Employee (818521, "Linda", "Hamilton", "F", 3580.35 ,(byte)3);
        Employee employee3 = new Employee (818522, "Arnold", "Schwarzenegger", "M", 3238.68 ,(byte)1);
        Employee employee4 = new Employee (818523, "Maria", "Shriver", "F", 3689.25 ,(byte)2);
        Employee employee5 = new Employee (818524, "Warren", "Buffett", "M", 4689.75 ,(byte)5);
        employee1.firma();
        employee2.firma();
        employee3.firma();
        employee4.firma();
        employee5.firma();
    }
}
