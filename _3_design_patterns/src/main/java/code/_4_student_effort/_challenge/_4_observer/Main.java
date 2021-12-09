package code._4_student_effort._challenge._4_observer;

public class Main {
    public static void main(String[] args) {
        Teacher teacher= new Teacher();
        Student s1=new Student("Popescule");
        Student s2=new Student("Ionescule");
        Student s3=new Student("Asavescule");

        s1.listenTo(teacher);
        s2.listenTo(teacher);
        s3.listenTo(teacher);

        String[] javaTopics=new String[]{"basics", "oop", "design patterns"};
        for(int i=0;i<javaTopics.length;i++){
            teacher.teach(javaTopics[i]);
        }
    }
}
