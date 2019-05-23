package sample.TicTacToe.Load;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.TicTacToe.Main;

import java.io.IOException;

public abstract class Loading extends Application implements ILoading {
     public static Stage loading(String resource, String title,int w,int h) throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource(resource));
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.setScene(new Scene(root, w, h));
        return stage;
    }
}
