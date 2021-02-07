package leapfrog;

import cs15.prj.leapFrogSupport.LeapFrogFrame;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * This is the App class.
 * Your should instantiate your top-level object in the start method.
 *
 * Your class comments go here.
 */
public class App extends Application {

  /**
   * This method starts the program, by setting up the Leap Frog board GUI.
   *
   * Instantiate the top-level object to start the game.
   */
  public void start(Stage stage) {
    new LeapFrogFrame(stage);
    //Don't change the line above! It instantiates the Hide-and-Seek
    //graphical user interface (GUI).

    //TODO STEP 2: Instantiate top-level object
  }

  /**
   * This is called a mainline.  When you type "java leapfrog.App"
   * this method gets called automatically.  Ignore the "String[] args"
   * for now; you won't need it in CS15.  All this method does is
   * call the launch method, which is a JavaFX method that calls the start
   * method above. So if your code is in that start method then it will be
   * executed and run!
   *
   * DO NOT CHANGE THIS CODE!
   */
  public static void main(String[] args) {
    launch(args);
  }
}
