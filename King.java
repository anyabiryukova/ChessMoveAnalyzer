/**
 * @author Anya Biryukova
 */

package chessmoveanalyzer;

public class King extends ChessPiece
{
	public King(Color c)
	{
		super(c);
	}
	
	@Override
	public String toString()
	{
		return "K ";
	}
}
