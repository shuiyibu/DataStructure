/**
 * 
 */
package array_string;

/**
 * @author langdylan
 *
 *         Mar 6, 2016 8:57:34 PM
 */
public class RotatePicture
{
	public int[][] rotate(int[][] matrix, int n)
	{
		for (int layer = 0; layer < n / 2; layer++)
		{
			int first = layer;
			int last = n - 1 - first;
			for (int i = layer; i <last; i++)
			{

				int offset = i - first;
				int top = matrix[layer][i];

				// left ---> top
				matrix[layer][i] = matrix[last - offset][layer];

				// bottom ---> left
				matrix[last - offset][layer] = matrix[last][last - offset];

				// right ---> bottom
				matrix[last][last - offset] = matrix[i][last];

				// top ---> right
				matrix[i][last] = top;
			}
		}

		return matrix;
	}
	
	
}
