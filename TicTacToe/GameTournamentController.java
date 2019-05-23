package sample.TicTacToe;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.TicTacToe.Game.GameBot;
import sample.TicTacToe.Load.Loading;

public class GameTournamentController extends GameBot {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane area1;

    @FXML
    private Text text1;

    @FXML
    private AnchorPane area7;

    @FXML
    private Text text7;

    @FXML
    private AnchorPane area4;

    @FXML
    private Text text4;

    @FXML
    private AnchorPane area3;

    @FXML
    private Text text3;

    @FXML
    private AnchorPane area2;

    @FXML
    private Text text2;

    @FXML
    private AnchorPane area5;

    @FXML
    private Text text5;

    @FXML
    private AnchorPane area6;

    @FXML
    private Text text6;

    @FXML
    private AnchorPane area8;

    @FXML
    private Text text8;

    @FXML
    private AnchorPane area9;

    @FXML
    private Text text9;

    @FXML
    private Button resetButton;

    @FXML
    private Button exitGameButton;

    @FXML
    private Text firstStatistic;

    @FXML
    private Text secoundStatistic;

    @FXML
    private Text darwStatistic;


    public static Stage winStage;
    public static int n=0;
    public static boolean bot = false;
    public static boolean win = false;
    public static boolean move = false;
    public static int[] field ={0,0,0,
            0,0,0,
            0,0,0};

    @FXML
    void initialize() {
        exitGameButton.setOnAction(event -> {
            Main.thirdStage.show();
            List.tournamentStage.close();
            List.tournamentGame.close();


        });

        resetButton.setOnAction(event -> {
            text1.setText("-");
            text2.setText("-");
            text3.setText("-");
            text4.setText("-");
            text5.setText("-");
            text6.setText("-");
            text7.setText("-");
            text8.setText("-");
            text9.setText("-");
            n=0;
            win=false;
            for (int i=0;i<9;i++)
                field[i] = 0;
        });



        area1.setOnMouseClicked(event -> {
            if (field[0] == 0) {
                onMove(field, 1, text1.getText());
                cheakMove();
            }
            if (win == false)gameEnd();




        });
        area2.setOnMouseClicked(event -> {
            if (field[1] == 0) {
                onMove(field, 2, text2.getText());
                cheakMove();
            }
            if (win == false)gameEnd();


        });
        area3.setOnMouseClicked(event -> {
            if (field[2] == 0) {
                onMove(field, 3, text3.getText());
                cheakMove();
            }
            if (win == false)gameEnd();

        });
        area4.setOnMouseClicked(event -> {
            if (field[3] == 0) {
                onMove(field, 4, text4.getText());
                cheakMove();
            }

            if (win == false)gameEnd();

        });
        area5.setOnMouseClicked(event -> {
            if (field[4] == 0) {
                onMove(field, 5, text5.getText());
                cheakMove();
            }
            if (win == false)gameEnd();

        });
        area6.setOnMouseClicked(event -> {
            if (field[5] == 0 ) {
                onMove(field, 6, text6.getText());
                cheakMove();
            }
            if (win == false)gameEnd();

        });
        area7.setOnMouseClicked(event -> {
            if (field[6] == 0 ) {
                onMove(field, 7, text7.getText());
                cheakMove();
            }
            if (win == false)gameEnd();

        });
        area8.setOnMouseClicked(event -> {
            if (field[7] == 0 ) {
                onMove(field, 8, text8.getText());
                cheakMove();
            }
            if (win == false)gameEnd();
        });
        area9.setOnMouseClicked(event -> {
            if (field[8] == 0 ) {
                onMove(field, 9, text9.getText());
                cheakMove();
            }
            if (win == false)gameEnd();
        });

    }


    public GameTournamentController() {

    }

    public void cheakMove(){
        if (field[0] > 0 && field[0] == 1){
            text1.setText("X");
        }else if (field[0] > 0 && field[0] == 2)
        {
            text1.setText("O");
        }
        if (field[1] > 0 && field[1] == 1){
            text2.setText("X");
        }else if (field[1] > 0 && field[1] == 2)
        {
            text2.setText("O");
        }
        if (field[2] > 0 && field[2] == 1){
            text3.setText("X");
        }else if (field[2] > 0 && field[2] == 2)
        {
            text3.setText("O");
        }
        if (field[3] > 0 && field[3] == 1){
            text4.setText("X");
        }else if (field[3] > 0 && field[3] == 2)
        {
            text4.setText("O");
        }
        if (field[4] > 0 && field[4] == 1){
            text5.setText("X");
        }else if (field[4] > 0 && field[4] == 2)
        {
            text5.setText("O");
        }
        if (field[5] > 0 && field[5] == 1){
            text6.setText("X");
        }else if (field[5] > 0 && field[5] == 2)
        {
            text6.setText("O");
        }
        if (field[6] > 0 && field[6] == 1){
            text7.setText("X");
        }else if (field[6] > 0 && field[6] == 2)
        {
            text7.setText("O");
        }
        if (field[7] > 0 && field[7] == 1){
            text8.setText("X");
        }else if (field[7] > 0 && field[7] == 2)
        {
            text8.setText("O");
        }
        if (field[8] > 0 && field[8] == 1){
            text9.setText("X");
        }else if (field[8] > 0 && field[8] == 2)
        {
            text9.setText("O");
        }
    }

    public void gameEnd(){
        win = cheakWin(field);
        if (win == true){
            if (move == false){
                Main.Player2++;
                secoundStatistic.setText(""+ Main.Player2);
                n=0;
                winWindow();

            }else {
                Main.Player1++;
                firstStatistic.setText(""+ Main.Player1);
                n=0;
                winWindow();

            }
        } else if (n == 9){
            win = true;
            Main.Draw++;
            darwStatistic.setText(""+ Main.Draw);
            n=0;


        }
    }

    public void winWindow() {
        try {
            winStage = Loading.loading("GameWin.fxml","Win",300,150);
        } catch (IOException e) {
            e.printStackTrace();
        }
        winStage.initModality(Modality.WINDOW_MODAL);
        winStage.initOwner(Main.secoundStage);
        winStage.show();
    }
}