/**
 * @author Anya Biryukova
 */

package chessmoveanalyzer;

public class ChessMoveAnalyzer
{
    public static void main(String[] args)
    {
		Chessboard board = new Chessboard();
		System.out.println(board.toString());
		board.move("c6c5");
		System.out.println(board.toString());
    }
}
