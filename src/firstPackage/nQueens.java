package firstPackage;

public class nQueens {
	public static void main(String[] args) {
		boolean[][] board = {{false,false,false,false},
				                {false,false,false,false},
				                {false,false,false,false},
				                {false,false,false,false}};
		queens(board,0);
		
		
		
	}
	static int queens(boolean[][] board,int row)
	{
	
		
		int count = 0;
		if(board.length==row)
		{
			display(board);
			System.out.println("-----------------");
			return 1;
		}
		for(int col=0;col<board[0].length;col++)
		{
			if(isSafe(board,row,col)==true)
			{
				board[row][col] = true;
				count = count+queens(board,row+1);
				board[row][col] = false;
			}
		}
		return count;
	}
	static void display(boolean [][] array)
	{
		for(int i=0;i<=(array.length-1);i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				if(array[i][j] == true)
				{
					System.out.print("Q |");
				}
				else
				{
					System.out.print("X |");
				}
			}
			
			System.out.println();
		}
	}
	public static boolean isSafe(boolean[][] array,int r, int c)
	{
		//check col
		//check row
		//check r_diag
		//check l_diag
		for(int i=0;i<array.length;i++)
		{
			if(array[i][c]==true)
			{
				return false;
			}
		}
		for(int j=0;j<array[c].length;j++)
		{
			if(array[r][j]==true)
			{
				return false;
			}
		}
		int maxLeft = Math.min(r, c);
		for(int x =1;x<=maxLeft;x++)
		{
			if(array[r-x][c-x]==true)
			{
				return false;
			}
		}
		int maxRight = Math.min(r,array.length-c-1);
		for(int x =1;x<=maxRight;x++)
		{
			if(array[r-x][c+x]==true)
				
			{
				return false;
			}
		}
		return true;
	}
	

}
