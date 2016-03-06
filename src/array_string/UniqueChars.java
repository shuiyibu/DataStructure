/**
 * 
 */
package array_string;

/**
 * @author langdylan
 *
 *         Mar 6, 2016 4:04:03 PM
 */
public class UniqueChars
{
	// specify ASCII
	public boolean isUniqueChars(String string)
	{
		int len = string.length();
		if (len > 256)
		{
			return false;
		}

		boolean[] char_set = new boolean[256];
		for (int i = 0; i < len; i++)
		{
			int val = string.charAt(i);
			if (char_set[val])
			{
				return false;
			}
			char_set[val] = true;
		}

		return true;
	}

	public boolean isUniqueChars2(String string)
	{
		int len = string.length();
		if (len > 26)
		{
			return false;
		}

		int checker = 0;
		for (int i = 0; i < len; i++)
		{
			int val = string.charAt(i) - 'a';
			val=1 << val;
			if ((checker & val) > 0)
			{
				return false;
			}
			checker|=val;
		}
		return true;
	}
	public static void main(String[] args)
	{
		UniqueChars uc=new UniqueChars();
		System.out.println(uc.isUniqueChars2("abc"));
		
	}
}
