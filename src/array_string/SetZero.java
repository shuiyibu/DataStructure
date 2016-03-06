/**
 * 
 */
package array_string;

/**
 * @author langdylan
 *
 *         Mar 6, 2016 9:50:42 PM
 */
public class SetZero
{
	public int[][] setZero(int[][] matrix)
	{
		if (matrix == null)
		{
			return matrix;
		}
		int rowLength = matrix.length;
		int colLength = matrix[0].length;

		int row = 0;
		int col = 0;

		for (int i = 0; i < rowLength; i++)
		{
			for (int j = 0; j < colLength; j++)
			{
				if (matrix[i][j] == 0)
				{
					row |= (1 << i);
					col |= (1 << j);
				}

			}
		}

		for (int i = 0; i < rowLength; i++)
		{
			for (int j = 0; j < colLength; j++)
			{
				if((row&(1<<i))>0||(col&(1<<j))>0){
					matrix[i][j]=0;
				}
			}
		}
		return matrix;
	}
}
