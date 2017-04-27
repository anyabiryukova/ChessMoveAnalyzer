/**
 * @author Anya Biryukova
 */

package chessmoveanalyzer;

public class Rook extends ChessPiece
{
	public Rook(Color c)
	{
		super(c);
	}
	
	@Override
	public String toString()
	{
		return "R ";
	}
	
	@Override
	public boolean parseMove(int cRow, int cCol, int dRow, int dCol, ChessPiece[][] board)
	{
		if (dRow - cRow == 0) //Checks if there is only horizontal or vertical movement.
		{
			for (int i = cRow + 1; i < dRow; i++)
			{
				if (board[i][cCol] != null)
					return false;
				else
					return true;
			}
			return true;
		}
		if (dCol - cCol == 0)
		{
			for (int i = cCol + 1; i < dCol; i++)
			{
				if (board[cRow][i] != null)
					return false;
				else
					return true;
			}
			return true;
		}
		else 
			return false;
	}
}
