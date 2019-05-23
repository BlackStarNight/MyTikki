package sample.TicTacToe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.TicTacToe.Load.Loading;

import java.io.IOException;

public class Main extends Application{
    public static Stage stageFirst;
    public static Stage secoundStage;
    public static Stage thirdStage;
    public static Stage fourthStage;


    public static int Player1 = 0;
    public static int Player2 = 0;
    public static int Draw = 0;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stageFirst = Loading.loading("sample.fxml","Game menu",301,318);
        stageFirst.show();
        secoundStage = Loading.loading("Game.fxml","Game",800,600);
        thirdStage = Loading.loading("GameTypes.fxml","Choise",355,378);
        fourthStage = Loading.loading("TournamentList.fxml", "List",285,400);
        stageFirst.setResizable(false);
        thirdStage.setResizable(false);
        fourthStage.setResizable(false);

    }

    public static void main(String[] args) {
        launch(args);

    }
}
