/**
 * @author Anya Biryukova
 */

package chessmoveanalyzer;

public abstract class ChessPiece
{
	private Color color;
	
	public ChessPiece(Color c)
	{
		color = c;
	}
	
	@Override
	public String toString()
	{
		return " - ";
	}
	
	public boolean parseMove(int cRow, int cCol, int dRow, int dCol, ChessPiece[][] board)
	{
		return true;
	}

	public Color getColor() {
		return color;
	}
}
