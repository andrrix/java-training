package code._4_student_effort.exercises;

public class DogShow{
    public static void main(String[] args) {
        new DogShow().go();
    }
    void go(){
        new Hound().bark();
        ((Dog) new Hound()).bark();

    }
}