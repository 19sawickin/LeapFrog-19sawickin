package leapfrog;

import cs15.prj.leapFrogSupport.SeekerSupport;

/**
 * Welcome to the Seeker class! You should read all the commented hints, as well
 * as the JavaDocs for this class, before coding here.
 *
 * Remember to use the support methods for this class, which you can call
 * using the "this" keyword (e.g. this.setCurrentLilyPad(myLilyPad)):
 *     setCurrentLilyPad
 *
 * Don't worry about the 'extends' stuff. That just gives you access to
 * support code methods written for the Seeker (see the Javadocs!), which you
 * should call. Pretend like it just says 'public class Seeker'.
 */
public class Seeker extends SeekerSupport {

	//TODO STEP 5: Create an association so the Seeker knows about the Hider

	/**
	 * This is the Seeker's constructor, which constructs an instance of the Seeker.
	 *
	 * Hint: Feel free to add parameters to this constructor for the association.
	 */
	public Seeker() {
		super();
		//Don't remove the line above - it's necessary for the Seeker to appear onscreen.
	}

	/**
	 * This method is called automatically AFTER the Hider has moved.
	 * You should never call this method yourself.
	 *
	 * Make the Seeker follow the Hider, by moving to the hider's previous lily pad.
	 */
	@Override
	public void followHider() {
		//TODO STEP 5: Make the seeker move to its new lily pad position, which is the hider's
		// PREVIOUS lily pad. Watch the demo for an example of how the seeker should follow.
	}
}