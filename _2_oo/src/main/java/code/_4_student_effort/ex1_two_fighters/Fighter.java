package code._4_student_effort.ex1_two_fighters;

public class Fighter {
    final String name;
    int health;
    final int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.health = health;
        this.name = name;
        this.damagePerAttack = damagePerAttack;

    }

    void attack(Fighter opponent) {
        opponent.health = opponent.health - this.damagePerAttack;

    }
}
