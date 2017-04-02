import java.util.*;

public class Solution
{
	static void nextMove(int n, int r, int c, String[] grid, int iIndex, int jIndex)
	{
		if (jIndex < c)
		{
			System.out.println("LEFT");
		} else if (jIndex > c)
		{
			System.out.println("RIGHT");
		} else if (iIndex > r)
		{
			System.out.println("DOWN");
		} else if (iIndex < r)
		{
			System.out.println("UP");
		}

	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n, r, c, iIndex = 0, jIndex = 0;
		n = in.nextInt();
		r = in.nextInt();
		c = in.nextInt();
		in.useDelimiter("\n");
		String grid[] = new String[n];

		for (int i = 0; i < n; i++)
		{
			grid[i] = in.next();
			for (int j = 0; j < n; j++)
			{
				if (grid[i].charAt(j) == 'p')
				{
					iIndex = i;
					jIndex = j;
				}
			}
		}
		nextMove(n, r, c, grid, iIndex, jIndex);
	}
}
