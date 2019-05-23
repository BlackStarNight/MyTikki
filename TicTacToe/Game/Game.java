package sample.TicTacToe.Game;

import sample.TicTacToe.GameController;
import sample.TicTacToe.Main;

import javax.xml.soap.Text;

public abstract class Game implements IGame {

    @Override
    public void onMove(int[] field,int moveNomber, String intext) {
        if (intext != "X" && intext != "O" && GameController.win == false) {
            field[moveNomber - 1] = (GameController.move ? 2 : 1);
            GameController.n++;
            GameController.move = !GameController.move;

        }
    }

    @Override
    public boolean cheakWin(int[] field) {
        boolean win = false;
        if ((field[0]==field[1] && field[1]==field[2] && field[0]!=0)||(field[3]==field[4] && field[4]==field[5]&& field[3]!=0)||(field[6]==field[7] && field[7]==field[8]&& field[6]!=0)||
                (field[0]==field[3] && field[3]==field[6]&& field[0]!=0)||(field[1]==field[4] && field[4]==field[7]&& field[1]!=0)||(field[2]==field[5] && field[5]==field[8]&& field[2]!=0)||
                (field[0]==field[4] && field[4]==field[8]&& field[0]!=0)||(field[2]==field[4] && field[4]==field[6]&& field[2]!=0)) win = true;
        return win;
    }

}
