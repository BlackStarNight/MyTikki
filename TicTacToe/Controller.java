package sample.TicTacToe;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.TicTacToe.Load.Loading;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button startButton;

    @FXML
    private Button statisticsButton;

    @FXML
    private Button exitButton;

    Stage error;

    @FXML
    void initialize() {
        exitButton.setOnAction(event -> {
            System.exit(0);
        });

        statisticsButton.setOnAction(event -> {
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
        startButton.setOnAction(event -> {

            Main.stageFirst.hide();
            Main.thirdStage.show();
        });


    }
}

