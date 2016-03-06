/**
 * 
 */
package array_string;

/**
 * @author langdylan
 *
 *         Mar 6, 2016 4:38:02 PM
 */
public class Permutation
{
	public boolean permutation(String s, String t)
	{
		int len = s.length();
		int len2 = s.length();

		if (len != len2)
			return false;

		int[] checker = new int[256];

		for (int i = 0; i < len; i++)
		{
			int val = s.charAt(i);
			checker[val]++;
		}

		for (int i = 0; i < len2; i++)
		{
			int val = t.charAt(i);
			if (--checker[val] < 0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		Permutation permutation = new Permutation();

		String s = "dog";
		String t = "god";
		System.out.println(permutation.permutation(s, t));

	}

}
