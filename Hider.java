package leapfrog;

import cs15.prj.leapFrogSupport.CS15LilyPad;
import cs15.prj.leapFrogSupport.HiderSupport;
import cs15.prj.leapFrogSupport.CS15Cloak;
import cs15.prj.leapFrogSupport.SeekerSupport;

/**
 * This is the Hider class. It contains methods for the instance of Hider and
 * instantiates the Cloak, CS15LilyPad and Seeker classes. When constructing the hider,
 * the instances of cloak and seeker are instantiated and an association with the seeker
 * class is formed. The hider puts on their cloak and when a lily pad is
 * clicked, the moveAndHide() method is executed whereupon the hider moves to the lily pad
 * that's clicked and assumes the color of that pad. This class also contains an accessor that
 * the Seeker class uses to tell the seeker what lily pad the hider was just on.
 */
public class Hider extends HiderSupport {

	private CS15LilyPad _previousLilyPad;
	private CS15Cloak _cloak;
	private SeekerSupport _seeker;

	/**
	 * This is the Hider's constructor, which constructs an instance of the Hider.
	 */
	public Hider() {
		super();
		_previousLilyPad = null;
		_cloak = new CS15Cloak();
		this.putOnCloak(_cloak);
		_seeker = new Seeker(this);
	}

	/**
	 * This method is called automatically on each click.
	 */
	@Override
	public void moveAndHide(CS15LilyPad newLilyPad) {
		// The previous lily pad updates to the current lily pad *before* it moves.
		_previousLilyPad = this.getCurrentLilyPad();
		this.setCurrentLilyPad(newLilyPad);
		_cloak.setColor(newLilyPad.getColor());
	}

	/**
	 * This method is an accessor to get the previous lily pad that the
	 * _hider was just on.
	 */
	public CS15LilyPad getPreviousLilyPad() {
		return _previousLilyPad;
	}
}