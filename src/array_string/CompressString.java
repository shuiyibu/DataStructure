/**
 * 
 */
package array_string;

/**
 * @author langdylan
 *
 *         Mar 6, 2016 7:47:41 PM
 */
public class CompressString
{
	public String compressString(String string)
	{
		int len = string.length();
		if (len == 0 || string.isEmpty() == true)
			return string;

		char last = string.charAt(0);
		int count = 1;
		StringBuffer sb = new StringBuffer();

		for (int i = 1; i < len; i++)
		{
			if (string.charAt(i) == last)
			{
				count++;
			}
			else
			{
				sb.append(last);
				sb.append(count);
				last=string.charAt(i);
				count = 1;
			}
		}

		sb.append(last);
		sb.append(count);

		String cs = sb.toString();

		if (cs.length() >= len)
			return string;
		else
			return sb.toString();
	}

	
}
