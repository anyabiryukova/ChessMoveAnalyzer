/**
 * @author Anya Biryukova
 */

package chessmoveanalyzer;

public class Chessboard
{
	private ChessPiece[][] board = new ChessPiece[8][8];
	private int currentRow;
	private int currentCol;
	private int destinationRow;
	private int destinationCol;
	
	public Chessboard()
	{
		board[0][0] = new Rook(Color.black);
		board[0][1] = new Knight(Color.black);
		board[0][2] = new Bishop(Color.black);
		board[0][3] = new Queen(Color.black);
		board[0][4] = new King(Color.black);
		board[0][5] = new Bishop(Color.black);
		board[0][6] = new Knight(Color.black);
		board[0][7] = new Rook(Color.black);
		board[1][0] = new Pawn(Color.black);
		board[1][1] = new Pawn(Color.black);
		board[1][2] = new Pawn(Color.black);
		board[1][3] = new Pawn(Color.black);
		board[1][4] = new Pawn(Color.black);
		board[1][5] = new Pawn(Color.black);
		board[1][6] = new Pawn(Color.black);
		board[1][7] = new Pawn(Color.black);
		board[2][0] = null;
		board[2][1] = null;
		board[2][2] = null; //new Rook(Color.black);
		board[2][3] = null;
		board[2][4] = null;
		board[2][5] = null;
		board[2][6] = null;
		board[2][7] = null;
		board[3][0] = null;
		board[3][1] = null;
		board[3][2] = null;
		board[3][3] = null;
		board[3][4] = null;
		board[3][5] = null;
		board[3][6] = null;
		board[3][7] = null;
		board[4][0] = null;
		board[4][1] = null;
		board[4][2] = null;
		board[4][3] = null;
		board[4][4] = null;
		board[4][5] = null;
		board[4][6] = null;
		board[4][7] = null;
		board[5][0] = null;
		board[5][1] = null;
		board[5][2] = null;
		board[5][3] = null;
		board[5][4] = null;
		board[5][5] = null;
		board[5][6] = null;
		board[5][7] = null;
		board[6][0] = new Pawn(Color.white);
		board[6][1] = new Pawn(Color.white);
		board[6][2] = new Pawn(Color.white);
		board[6][3] = new Pawn(Color.white);
		board[6][4] = new Pawn(Color.white);
		board[6][5] = new Pawn(Color.white);
		board[6][6] = new Pawn(Color.white);
		board[6][7] = new Pawn(Color.white);
		board[7][0] = new Rook(Color.white);
		board[7][1] = new Knight(Color.white);
		board[7][2] = new Bishop(Color.white);
		board[7][3] = new Queen(Color.white);
		board[7][4] = new King(Color.white);
		board[7][5] = new Bishop(Color.white);
		board[7][6] = new Knight(Color.white);
		board[7][7] = new Rook(Color.white);
	}
	
	public void move(String move)
	{
		if (parseMove(move) == true)
		{
			System.out.println("Yay, it's a valid move!");
			board[destinationRow][destinationCol] = board[currentRow][currentCol];
			board[currentRow][currentCol] = null;
			toString();
		}
		else
			System.out.println("Gurl, you are so dumb. You are really dumb, for real!");
	}
	
	public boolean parseMove(String move)
	{
		if (move.length() != 4) //Checks if move is properly worded.
			return false;
		currentCol = Character.getNumericValue(move.charAt(0)) - 10;
		currentRow = (move.charAt(1) - 56) * -1;
		destinationCol = Character.getNumericValue(move.charAt(2)) - 10;
		destinationRow = (move.charAt(3) - 56) * -1;
		System.out.printf(move + ": [%d][%d] to [%d][%d]\n",currentRow, currentCol, destinationRow, destinationCol);
		if (currentCol < 0 || currentCol > 7 || currentRow < 0 || currentRow > 7) //Checks if current selection is out of bounds.
			return false;
		else if (destinationCol < 0 || destinationCol > 7 || destinationRow < 0 || destinationRow > 7) //Checks if destination is out of bounds.
			return false;
		else if (board[destinationRow][destinationCol] != null && board[currentRow][currentCol].getColor() == board[destinationRow][destinationCol].getColor()) //Check if player is moving on their own color.
			//Technically if we allowed castling, this should be removed. But whatever.
			return false;
		else if (board[currentRow][currentCol].parseMove(currentRow, currentCol, destinationRow, destinationCol, board) == false)
			return false;
		else
			return true;
	}
	
	@Override
	public String toString()
	{
		String layout = "";
		for (int row = 0; row < 8; row++)
		{
			layout += (row - 8) * -1 + "  ";
			for (int col = 0; col < 8; col++)
			{
				if (board[row][col] == null)
					layout += " . ";
				else
					if (board[row][col].getColor() == Color.white)
						layout += "w" + board[row][col].toString();
					else
						layout += "b" + board[row][col].toString();
			}
			layout+= "\n";
		}
		layout += "   A  B  C  D  E  F  G  H ";
		return layout;
	}
}
