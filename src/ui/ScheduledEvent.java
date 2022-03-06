package ui;

import java.time.LocalDate;
import java.time.LocalTime;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.geometry.Orientation;

/**
 * This class illusatrates an event that is scheduled,
 * e.g. lecture, or a social gathering.
 */

public class ScheduledEvent extends Event {

  private Pane datePane;
  private Pane timePane;
  //private BorderPane pane;
  //private StackPane pane;
  private BorderPane pane;
  
  public ScheduledEvent(String title, String description, LocalDate date, LocalTime time) {
    super(title, description);
    this.datePane = new Pane(new Label(date.toString()));
    this.timePane = new Pane(new Label(time.toString()));
    //this.pane = new StackPane();

    // Create pane
    BorderPane mainPane = super.getMainPane();
    //BorderPane mainPane = new BorderPane();
    FlowPane bottomPane = new FlowPane(Orientation.HORIZONTAL);
    bottomPane.getChildren().addAll(this.datePane, this.timePane);
    mainPane.setBottom(bottomPane);
    this.pane = mainPane;
  }
    
  public BorderPane getPane() {
    return this.pane;
  }
} 
