package leapfrog;

import cs15.prj.leapFrogSupport.LeapFrogFrame;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * This is the leapfrog App class. It is responsible for starting the program
 * and constructing the GUI
 */
public class App extends Application {

  /**
   * This method starts the program, by setting up the Leap Frog board GUI
   * then instantiates the top-level object to start the game
   */
  public void start(Stage stage) {
    new LeapFrogFrame(stage);
    //instantiates the top-level class to start game
    new Game();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
