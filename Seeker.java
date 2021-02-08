package leapfrog;

import cs15.prj.leapFrogSupport.SeekerSupport;

/**
 * This is the Seeker class. It contains the Seeker constructor and an
 * association to the _hider. Its primary method is the followHider() method that
 * uses a mutator to move the seeker to the lily pad that the hider was just on.
 */
public class Seeker extends SeekerSupport {

	private Hider _hider;

	/**
	 * This is the Seeker's constructor, which constructs an instance of the Seeker.
	 */
	public Seeker(Hider myHider) {
		super();
		//association made with Hider class.
		_hider = myHider;
	}

	/**
	 * This mutator method is called automatically AFTER the Hider has moved and
	 * makes the Seeker move to the lily pad that the hider was just on.
	 */
	@Override
	public void followHider() {
		this.setCurrentLilyPad(_hider.getPreviousLilyPad());
	}

}