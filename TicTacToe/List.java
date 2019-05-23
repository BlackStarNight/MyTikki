package sample.TicTacToe;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.TicTacToe.Load.Loading;

public class List {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nickname1;

    @FXML
    private TextField nickname2;

    @FXML
    private TextField nickname3;

    @FXML
    private TextField nickname4;

    @FXML
    private TextField nickname5;

    @FXML
    private TextField nickname6;

    @FXML
    private TextField nickname7;

    @FXML
    private TextField nickname8;

    @FXML
    private TextField nickname9;

    @FXML
    private TextField nickname10;

    @FXML
    private TextField nickname11;

    @FXML
    private TextField nickname12;

    @FXML
    private Button ButtonReady;

    public static Stage tournamentStage;
    public static Stage tournamentGame;
    public static  String[] List = new String [12];
    public static  int amountPlayer = 0;

    @FXML
    void initialize() {

        ButtonReady.setOnMouseClicked(event -> {
            List[0] = nickname1.getText();
            List[1] = nickname2.getText();
            List[2] = nickname3.getText();
            List[3] = nickname4.getText();
            List[4] = nickname5.getText();
            List[5] = nickname6.getText();
            List[6] = nickname7.getText();
            List[7] = nickname8.getText();
            List[8] = nickname9.getText();
            List[9] = nickname10.getText();
            List[10] = nickname11.getText();
            List[11] = nickname12.getText();
            for (int i=0;i<12;i++){
                if (List[i] == ""){
                    amountPlayer = i;
                    break;
                }
            }
            System.out.println(amountPlayer);
            try {
                tournamentStage = Loading.loading("Arena.fxml","Arena",501,372);
            } catch (IOException e) {
                e.printStackTrace();
            }
            tournamentStage.setResizable(false);
            tournamentStage.show();
            try {
                tournamentGame = Loading.loading("GameTournament.fxml","Game",800,600);
            } catch (IOException e) {
                e.printStackTrace();
            }
            tournamentGame.setResizable(false);
            tournamentGame.show();
            Main.fourthStage.hide();


        });

    }
}
