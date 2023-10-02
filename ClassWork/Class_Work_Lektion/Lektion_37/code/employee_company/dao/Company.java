package Lektion_37.code.employee_company.dao;


import Lektion_37.code.employee_company.model.Employee;

public interface Company {

    // в интерфейсе мы задаем сигнатуры методов, у методов отсутствуют тела

    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee(int id);

    int size();

    void printEmployees();
}
