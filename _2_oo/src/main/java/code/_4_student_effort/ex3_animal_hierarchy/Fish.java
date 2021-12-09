package code._4_student_effort.ex3_animal_hierarchy;

public class Fish extends Animal implements Pets {
    public String name;

    public Fish() {
        super(0);
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public void walk() {
        System.out.println("The fish "  + this.name + " can't walk");
    }

    @Override
    public void eat() {
        System.out.println("The fish " + this.name + " is eating");
    }


    @Override
    public void play() {
        System.out.println("The fish " + this.name + " is playing");
    }
}
