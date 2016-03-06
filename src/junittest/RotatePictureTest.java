/**
 * 
 */
package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import array_string.RotatePicture;

/**
 * @author langdylan
 *
 *         Mar 6, 2016 9:30:13 PM
 */
public class RotatePictureTest
{
	RotatePicture rp = new RotatePicture();

	/**
	 * Test method for {@link array_string.RotatePicture#rotate(int[][], int)}.
	 */
	@Test
	public void testAssertArrayEquals()
	{
		int[][] pixels = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] pr = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
		assertArrayEquals(pr, rp.rotate(pixels, 3));
	}

}
