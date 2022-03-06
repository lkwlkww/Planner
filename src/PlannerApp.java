
import java.time.LocalDate;
import java.time.LocalTime;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import ui.ScheduledEvent;
import java.time.LocalDate;
import java.time.LocalTime;

public class PlannerApp extends Application {

  @Override
  public void start(Stage stage) {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();

    // Scene
    ScheduledEvent event = new ScheduledEvent("cs2030s", "go for lecture !", date, time);
    Scene scene = new Scene(event.getPane(), 640, 480);
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}

