/**
 * @author Anya Biryukova
 */

package chessmoveanalyzer;

public class Pawn extends ChessPiece
{
	public Pawn(Color c)
	{
		super(c);
	}
	
	@Override
	public String toString()
	{
		return "P ";
	}
}
