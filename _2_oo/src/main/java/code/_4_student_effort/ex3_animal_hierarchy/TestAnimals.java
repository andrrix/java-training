package code._4_student_effort.ex3_animal_hierarchy;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d= new Fish();
        Cat c=new Cat("Fluffy");
        Animal a=new Fish();
        Animal e=new Spider();
        Pets p=new Cat();

        d.setName("Fificus");
        System.out.println(d.getName());
        d.walk();
        d.eat();
        d.play();
        System.out.println(c.getName());
        c.eat();
        c.play();
        a.eat();
        a.walk();
        e.eat();
        e.walk();
        p.setName("Pisica1");
        System.out.println(p.getName());
        p.play();

    }
}
