package sample.TicTacToe;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.TicTacToe.Load.Loading;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GameTypesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SingleGameButton;

    @FXML
    private Button GameBotButton;

    @FXML
    private Button TournementGameButton;

    @FXML
    private Button OnlineGameButton;

    @FXML
    private Button ReturnButton;

    Stage error;


    @FXML
    void initialize() {

        SingleGameButton.setOnMouseClicked(event -> {
            Main.thirdStage.hide();
            Main.secoundStage.show();
            GameController.bot = false;
        });

        OnlineGameButton.setOnMouseClicked(event -> {
            try {
                error = Loading.loading("ERROR.fxml","error",182,65);
            } catch (IOException e) {
                e.printStackTrace();
            }
            error.setResizable(false);
            error.initModality(Modality.WINDOW_MODAL);
            error.initOwner(Main.thirdStage);
            error.show();
        });

        TournementGameButton.setOnMouseClicked(event -> {
            Main.thirdStage.hide();
            Main.fourthStage.show();


        });

        GameBotButton.setOnMouseClicked(event -> {

            Main.thirdStage.hide();
            Main.secoundStage.show();
            GameController.bot = true;
        });

        ReturnButton.setOnMouseClicked(event -> {
            Main.thirdStage.hide();
            Main.stageFirst.show();

        });


    }


}
