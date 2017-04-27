/**
 * @author Anya Biryukova
 */

package chessmoveanalyzer;

public class Queen extends ChessPiece
{
	public Queen(Color c)
	{
		super(c);
	}
	
	@Override
	public String toString()
	{
		return "Q ";
	}
}
