import java.time.LocalDate;
import java.time.LocalTime;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class PlannerApp extends Application {

  @Override
  public void start(Stage stage) {
    LocalDate date = java.time.LocalDate.now();
    LocalTime time = java.time.LocalTime.now();
    Label l = new Label("Date: " + date + " ; Time: " + time);

    // Scene
    Scene scene = new Scene(new Pane(l), 640, 480);
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}

