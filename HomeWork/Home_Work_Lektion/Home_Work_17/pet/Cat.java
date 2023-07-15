package Home_Work_17.pet;

public class Cat extends Pet {


// The Cat class (heir to the Pet class)

    private String name;
    private String breed;
    private int age;

    public Cat(String type, double weight, String livingConditions, String name, String breed, int age) {
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
        System.out.println("Cat says Meow!");
    }

    public void sleep() {
        System.out.println("Cat is sleeping.");
    }

    public void eat() {
        System.out.println("Cat is eating.");
    }
}