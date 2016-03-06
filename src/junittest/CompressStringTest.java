/**
 * 
 */
package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import array_string.CompressString;

/**
 * @author langdylan
 *
 *         Mar 6, 2016 8:04:35 PM
 */
public class CompressStringTest
{
	CompressString cs = new CompressString();

	@Test
	public void testCompressString()
	{
		assertEquals("aaabccdeeaa", cs.compressString("aaabccdeeaa"));
		assertEquals("a3b1c5d1e2a2", cs.compressString("aaabcccccdeeaa"));
		
	}
}
