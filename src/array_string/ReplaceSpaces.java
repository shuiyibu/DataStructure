/**
 * 
 */
package array_string;

/**
 * @author langdylan
 *
 *         Mar 6, 2016 5:25:52 PM
 */
public class ReplaceSpaces
{
	public String replaceSpaces(String s)
	{
		int len = s.length();
		int count_space = 0;

		char[] str = s.toCharArray();
		for (int i = 0; i < len; i++)
		{
			// notify char compare
			if (str[i] == ' ')
			{
				count_space++;
			}
		}

		int newLength = len + 2 * count_space;
		char[] noSpace = new char[newLength];
		for (int i = len - 1; i >= 0; i--)
		{
			if (str[i] == ' ')
			{
				noSpace[newLength - 1] = '%';
				noSpace[newLength - 2] = '0';
				noSpace[newLength - 3] = '2';
				newLength -= 3;
			}
			else
			{
				noSpace[newLength - 1] = str[i];
				newLength -= 1;
			}
		}
		return new String(noSpace);
	}

	public static void main(String[] args)
	{
		String string = " a  b   c    d     ";
		ReplaceSpaces rs = new ReplaceSpaces();
		System.out.println(rs.replaceSpaces(string));
	}
}
