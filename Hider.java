package leapfrog;

import cs15.prj.leapFrogSupport.CS15LilyPad;
import cs15.prj.leapFrogSupport.HiderSupport;

/**
 * Welcome to the Hider class! You should read all the commented hints, as well
 * as the JavaDocs for this class, before coding here.
 *
 * Remember to use the support methods for this class, which you can call
 * using the "this" keyword (e.g. this.getCurrentLilyPad()):
 *     setCurrentLilyPad
 *     getCurrentLilyPad
 *     putOnCloak
 *
 * Don't worry about the 'extends' stuff. That just gives you access to
 * support code methods written for the Hider (see the Javadocs!), which you
 * should call. Pretend like it just says 'public class Hider'.
 */
public class Hider extends HiderSupport {

	// We've declared this instance variable for you to keep track
	// of the hider's previous lily pad.
	private CS15LilyPad _previousLilyPad;
	//TODO STEP 4: Declare instance variable for cloak

	/**
	 * This is the Hider's constructor, which constructs an instance of the Hider.
	 */
	public Hider() {
		super();
		//Don't remove the line above - it is necessary for the Hider to appear onscreen.

		// We've also initialized this instance variable for you.
		_previousLilyPad = null;
		
		//TODO STEP 4: Initialize and put on the cloak
	}

	/**
	 * This method is called automatically on each click.
	 * You should never call this method yourself.
	 * The CS15LilyPad passed in corresponds to the tile clicked.
	 *
	 * Make the hider move to its new lily pad and hide itself using the CS15Cloak.
	 */
	@Override
	public void moveAndHide(CS15LilyPad newLilyPad) {
		// The previous lily pad updates to the current lily pad *before* it moves.
		_previousLilyPad = this.getCurrentLilyPad();

		//TODO STEP 3: Make the hider move to its new lily pad

		//TODO STEP 4: Change the color of the cloak to match the lily pad
	}

	//TODO 5: Create a getter method to get the previous lily pad
}