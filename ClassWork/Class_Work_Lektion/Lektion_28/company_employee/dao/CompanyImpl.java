package Lektion_28.company_employee.dao;

import Lektion_28.company_employee.model.Employee;

public class CompanyImpl implements Company {
    Employee [] employees;
    private int size;
    public CompanyImpl ( int capacity){
        employees = new Employee[capacity];
    }
    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || size == employees.length) {
            return false;
        }
        employees[size] = employee;
        size++;
        return true;
    }
    @Override
    public Employee removeEmployee(int id) {
        // udalenie sotrudnica iz masiva
        // isem v cycle po vsem employee, perebiraem massiv
        // esli nasolsea sotrudnic s zadonom id
        // 1. sozraniti udaleaemovogo sotrudnica v obiectnuiu peremenoi
        // 2. na mesto udolenogo perenosim poslednego iz massiva
        // 3. poslednego zatiraem s pomusiu null
        // 4. size--
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                Employee victim = employees[i];
                employees[i] = employees [size -1];
                employees [size -1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }
    @Override
    public Employee findeEmployee(int id) {
        for (int i = 0; i < size(); i++) {
            if ( employees [i].getId()==id) {
                return employees[i];
            }

        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printEmployee() {

    }
}
