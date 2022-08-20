package hust.soict.hedspi.gui.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Aims extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try{
            AnchorPane root = (AnchorPane)FXMLLoader.load(this.getClass().getResource("aims.fxml"));
            Scene scene = new Scene(root);
            System.out.println(root.getChildren());
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}