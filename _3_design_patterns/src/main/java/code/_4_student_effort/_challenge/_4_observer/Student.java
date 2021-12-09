package code._4_student_effort._challenge._4_observer;

public class Student implements Observer{
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String message){
        System.out.println("Student "+ getName() +" learned about " + message );

    }
    void listenTo( Teacher teacher){
        teacher.register(this);
    }
}
