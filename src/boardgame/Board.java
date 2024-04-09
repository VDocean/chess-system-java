package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		
		this.rows = rows;
		this.columns = columns;
		pieces=new Piece[rows][columns];
		
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
 	
	//nao fiz um metodo get e set para pieces, pois elas devem ser retornadas de
	//forma individual e não a matriz toda de uma vez
	
	public Piece piece(int row,int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()]=piece; // atribui a minha matriz de peças a peca passada como argumento
		piece.position=position;
	}
	
	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}if (piece(position)==null) {
			return null;
		}
		Piece aux=piece(position);
		aux.position=null;
		pieces[position.getRow()][position.getColumn()]=null;
		return aux;
	}
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}

}

