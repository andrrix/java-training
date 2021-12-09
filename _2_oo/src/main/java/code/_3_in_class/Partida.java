package code._3_in_class;

public class Partida {
    public Pugilist player1;
    public Pugilist player2;

    public Partida(Pugilist player1, Pugilist player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        while (isGameStillPlaying()) {
            player1.atack(player2);
            player2.atack(player1);
        }
        announceWinner();
    }



    private void announceWinner() {
        if (player1.health <= 0) {
            System.out.println(player2.name + "WIN!!");
        } else {
            System.out.println(player1.name + "WIN!!");
        }
    }

    private boolean isGameStillPlaying() {
        return player1.health >= 0 && player2.health >= 0;
    }
}

