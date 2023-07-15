package Lektion_23.practice.student;

public class Student {
    String name;
    int[] marks;

    public Student(String name) {
        this.name = name;
    }

    public double averageMark(int[] marks) {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];

        }
        return sum/marks.length;

    }
}
