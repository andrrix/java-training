package code._4_student_effort.exercises;

public interface Horse {
    default String myself(){return "i m a horse";}
}
interface Flyer extends Horse {
    default String myself(){ return " i m able to fly";}
}
interface Mythical extends Horse{
    //default String myself1(){ return " i m able to be mythical";}
}
class Pegasus implements Flyer, Mythical{
    public static void main(String[] args) {
        Pegasus myApp=new Pegasus();
        System.out.println(myApp.myself());
    }
}
