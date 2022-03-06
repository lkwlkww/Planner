
import java.time.LocalDate;
import java.time.LocalTime;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import ui.ScheduledEvent;
import java.time.LocalDate;
import java.time.LocalTime;
import javafx.geometry.Orientation;

public class PlannerApp2 extends Application {

  @Override
  public void start(Stage stage) {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();

    // Scene
    ScheduledEvent event = new ScheduledEvent("cs2030s", "go for lecture !", date, time);
    Pane pane = event.getPane();
    /**
    Pane datePane = new Pane(new Label(date.toString()));
    Pane timePane = new Pane(new Label(time.toString()));
    FlowPane bottomPane = new FlowPane(Orientation.HORIZONTAL);
    bottomPane.getChildren().addAll(datePane, timePane);
    Label l = new Label("12345");
    BorderPane pane = new BorderPane(l);
    pane.setBottom(bottomPane);
    **/
    //Label l = new Label("asdasd");
    //Pane fpane = new FlowPane(l);
    //BorderPane pane = new BorderPane(l);

    Scene scene = new Scene(pane, 640, 480);
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}

