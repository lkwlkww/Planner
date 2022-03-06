package ui;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;

/**
 * The event class is illustrated as an event
 * on a timetable/day schedule, containing things like
 * a title, description, type(lecture/homework).
 */

public abstract class Event {
  private final Pane titlePane;
  private final Pane descriptionPane;
  private BorderPane mainPane;

  public Event(String title, String description) {
    this.titlePane = new Pane(new Label(title));
    this.descriptionPane = new Pane(new Label(description));

    //BorderPane mainPane = new BorderPane(this.descriptionPane);
    BorderPane borderPane = new BorderPane(this.descriptionPane);
    borderPane.setTop(this.titlePane);
    this.mainPane = borderPane;
  }
  
  public BorderPane getMainPane() {
    return this.mainPane;
  }

}
