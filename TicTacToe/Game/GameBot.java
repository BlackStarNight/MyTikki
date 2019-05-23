package sample.TicTacToe.Game;

import sample.TicTacToe.GameController;

import java.util.Random;

public abstract class GameBot extends Game implements IGameBot{


    @Override
    public void onMove(int[] field,int moveNomber, String intext) {

            field[moveNomber - 1] = (GameController.move ? 2 : 1);
            GameController.n++;
            GameController.move = !GameController.move;
            if (GameController.bot == true)
            botMove(field);

    }


    @Override
    public void botMove(int[] field){
        Random random = new Random();
        while(true) {
            int moveNomber = random.nextInt(9);
            if (GameController.n == 9) break;
            if (field[moveNomber] == 0 && GameController.win == false) {
                field[moveNomber] = (GameController.move ? 2 : 1);
                GameController.n++;
                GameController.move = !GameController.move;
                break;
            }
        }
    }
}
