package com.example.demo;

//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//
//public class HelloApplication extends Application {
//
//  @Override
//  public void start(Stage stage) throws IOException {
//    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//    Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//    stage.setTitle("Hello!");
//    stage.setScene(scene);
//    stage.show();
//  }
//
//  public static void main(String[] args) {
//    launch();
//  }
//}

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class HelloApplication extends Application{
  private int count = 0;
  @Override
  public void start(Stage stage) throws Exception {
    Button btn = new Button("Counter");
    TextField txt = new TextField("0");
    btn.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        count++;
        txt.setText(count+"");
      }
    });
//    Pane pane = new Pane();;
    FlowPane pane = new FlowPane();
    pane.getChildren().add(btn);
    pane.getChildren().add(txt);
    Scene scene = new Scene(pane, 300, 300);

    stage.setTitle("Counter");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}