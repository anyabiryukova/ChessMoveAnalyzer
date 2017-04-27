/**
 * @author Anya Biryukova
 */

package chessmoveanalyzer;

public class Bishop extends ChessPiece
{
	public Bishop(Color c)
	{
		super(c);
	}
	
	@Override
	public String toString()
	{
		return "B ";
	}
}
