package Home_Work_20.voter.model;

import java.time.LocalDate;

public class Voter {
    // Задача 2. Реализовать класс Избиратель (модель).
    // Обеспечить невозможность регистрации в качестве избирателя лица,
    // которому еще не исполнилось 18 лет в классе-апликации.
    private String name;
    private int age;

    // Конструктор класса
    public Voter(String name, LocalDate birthDate) {
        this.name = name;
        this.age = calculateAge(birthDate);
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//   // public int getAge() {
//        return age;
//    }
//
//   // public void setAge(int age) {
//        this.age = age;
//    }

    // Метод для проверки возраста
    public boolean isEligible() {
        return age >= 18;
    }

    // Приватный метод для вычисления возраста из даты рождения
    private int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - birthDate.getYear();
    }

}