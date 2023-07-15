package Home_Work_15.employee.model;

public class Employee {


//    Задача 2. Создать класс Работник (Employee) c полями:
//
//    уникальный номер
//    имя
//    фамилия
//    пол
//    зарплата
//    уровень налогообложения Создать приложение FirmaAppl
//    в котором принять на работу несколько сотрудников.

    public int uniqueNumber;
    public String surname;
    public String lastName;
    public String sex;
    public double salary;
    public byte levelOfTaxation;



    public void firma() {
        System.out.print("Unique number: " + uniqueNumber + " , ");
        System.out.print("Surname: " + surname + " , ");
        System.out.print("Last name: " + lastName + " , ");
        System.out.print("Sex: " + sex + " , ");
        System.out.print("Salary: " + salary + " , ");
        System.out.print("Level of taxation: " + levelOfTaxation + " , ");
        System.out.println();

    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public byte getLevelOfTaxation() {
        return levelOfTaxation;
    }

    public void setLevelOfTaxation(byte levelOfTaxation) {
        this.levelOfTaxation = levelOfTaxation;
    }

    public Employee(int uniqueNumber, String surname, String lastName, String sex, double salary, byte levelOfTaxation) {
        this.uniqueNumber = uniqueNumber;
        this.surname = surname;
        this.lastName = lastName;
        this.sex = sex;
        this.salary = salary;
        this.levelOfTaxation = levelOfTaxation;
    }
}
