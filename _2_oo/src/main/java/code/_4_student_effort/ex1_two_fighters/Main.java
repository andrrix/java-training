package code._4_student_effort.ex1_two_fighters;

public class Main {
    public static void main(String[] args) {
        Fighter jucator1=new Fighter("Andrei", 95, 10);
        Fighter jucator2=new Fighter("Claudiu", 88, 9);
        BoxingMatch boxingMatch=new BoxingMatch(jucator1, jucator2);
        String castigator = boxingMatch.fight();
        System.out.println(castigator);
    }
}
