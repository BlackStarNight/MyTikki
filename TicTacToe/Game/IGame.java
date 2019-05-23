package sample.TicTacToe.Game;

public interface IGame {
    void onMove(int[] field,int moveNomber, String intext);
    boolean cheakWin(int[] field);
}