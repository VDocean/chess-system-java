package chess;

import boardgame.Board;
import boardgame.Position;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color=color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}

	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
	
	public int getMoveCount() {
		return moveCount;
	}
	
	public int increaseMoveCount() {
		return moveCount++;
	}
	
	public int decreaseMoveCount() {
		return moveCount--;
	}

}
