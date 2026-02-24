/**
 * 
 */
package intervallen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervallenTest {
	
	@Test
	void test() {
		Interval myInterval = new Interval(3,7);
		myInterval.setOndergrens(3);
		myInterval.setBovengrens(7);
		int lengte = myInterval.getBovengrens()-myInterval.getOndergrens();
		assertEquals(4,lengte);
	}
}
