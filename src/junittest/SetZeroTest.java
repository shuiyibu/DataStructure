/**
 * 
 */
package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import array_string.SetZero;

/**
 * @author langdylan
 *
 *         Mar 6, 2016 10:00:14 PM
 */
public class SetZeroTest
{
	SetZero sz = new SetZero();

	/**
	 * Test method for {@link array_string.SetZero#setZero(int[][])}.
	 */
	@Test
	public void testAssertArrayEquals()
	{
		int[][] pixels = { { 1, 2, 3 }, { 4, 0, 6 }, { 7, 8, 9 } };
		int[][] pr = { { 1, 0, 3 }, { 0, 0, 0 }, { 7, 0, 9 } };
		assertArrayEquals(pr, sz.setZero(pixels));
	}

}
