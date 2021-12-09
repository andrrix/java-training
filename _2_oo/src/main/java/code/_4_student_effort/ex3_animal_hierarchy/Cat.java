package code._4_student_effort.ex3_animal_hierarchy;

public class Cat extends Animal implements Pets {

    String name;

    public Cat(String name) {
        super(4);
        this.name = name;

    }

    public Cat() {
        this("");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Cat " + this.name + " plays with mouse");
    }

    @Override
    public void eat() {
        System.out.println("Cat " + this.name + " eat");

    }
}
