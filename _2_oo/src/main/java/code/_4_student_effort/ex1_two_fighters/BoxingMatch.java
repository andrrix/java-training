package code._4_student_effort.ex1_two_fighters;

public class BoxingMatch {
    private Fighter jucator1;
    private Fighter jucator2;

    public BoxingMatch(Fighter juc1, Fighter juc2) {
        this.jucator1 = juc1;
        this.jucator2 = juc2;
    }

    String fight() {
        while (jucator1.health > 0 && jucator2.health > 0) {
            jucator1.attack(jucator2);
            jucator2.attack(jucator1);
        }
        if (jucator1.health <= 0) {
            return jucator2.name;
        } else {

            return jucator1.name;
        }
    }
}
