package hust.soict.hedspi.gui.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class JavaFxCounter extends Application {
   private TextField tfCount;
   private Button btnCount;
   private int count = 0;

   @Override
   public void start(Stage primaryStage) {
      // Allocate controls
      tfCount = new TextField("0");
      tfCount.setEditable(false);
      btnCount = new Button("Count");
      // Register event handler using Lambda Expression (JDK 8)
      btnCount.setOnAction(evt -> tfCount.setText(++count + ""));

      // Create a scene graph of node rooted at a FlowPane
      FlowPane flow = new FlowPane();
      flow.setPadding(new Insets(15, 12, 15, 12));  // top, right, bottom, left
      flow.setVgap(10);  // Vertical gap between nodes in pixels
      flow.setHgap(10);  // Horizontal gap between nodes in pixels ( distance for horizontal between nodes)
      flow.setAlignment(Pos.CENTER);  // Alignment
      flow.getChildren().addAll(new Label("Count: "), tfCount, btnCount);

      // Setup scene and stage
      primaryStage.setScene(new Scene(flow, 400, 80));
      primaryStage.setTitle("JavaFX Counter");
      primaryStage.show();
   }

   public static void main(String[] args) {
      launch(args);
   }
}
