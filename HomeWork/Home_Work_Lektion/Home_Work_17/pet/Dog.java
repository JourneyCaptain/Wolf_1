package Home_Work_17.pet;

public class Dog extends Pet {

    // The Dog class (heir to the Pet class)

    private String name;
    private String breed;
    private int age;

    public Dog(String type, double weight, String livingConditions, String name, String breed, int age) {
        super(type, weight, livingConditions);
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void voice() {
        System.out.println("Dog says Wow-wow!");
    }

    public void run() {
        System.out.println("Dog is running.");
    }

    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void  sleep() {
        System.out.println("Dog is sleeping.");
    }
}