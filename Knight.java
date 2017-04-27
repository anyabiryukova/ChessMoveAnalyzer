/**
 * @author Anya Biryukova
 */

package chessmoveanalyzer;

public class Knight extends ChessPiece
{
	public Knight(Color c)
	{
		super(c);
	}
	
	@Override
	public String toString()
	{
		return "N ";
	}
}
