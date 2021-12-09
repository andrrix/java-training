package code._3_in_class;

public class Pugilist {
    // state
    public String name;
    public int health;
    public int dammagePerAtack;

    public Pugilist(String name, int health, int dammagePerAtack) {
        this.name = name;
        this.health = health;
        this.dammagePerAtack = dammagePerAtack;
    }

    //behaviour
    public void atack(Pugilist opponent){
        opponent.health=opponent.health- this.dammagePerAtack;
    }
    public void defend(){
        //TODO implementam alta data...

    }
}
