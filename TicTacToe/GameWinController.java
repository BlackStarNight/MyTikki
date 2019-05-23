package sample.TicTacToe;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class GameWinController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text PlayerWon;

    @FXML
    void initialize() {
        PlayerWon.setText((GameController.move ? "1" : "2"));
    }
}
