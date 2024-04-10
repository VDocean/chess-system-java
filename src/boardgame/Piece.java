package boardgame;

public abstract class Piece {
	
	protected Position position;// protected pois nao quero que ela seja visivel para o tabuleiro
    private Board board;
    
	public Piece(Board board) {// construtor não tem a posicao pois no inicio do jogo
		                       //ela deve ser nula
		this.board = board;
	}

	protected Board getBoard() {// sem set para o board pois não posso
		                     //permitir que o tabuleiro seja alterado
		return board;        // visualização protected pois só deve estar 
		                     // visivel para o meu pacote e subclasses
	}
	
	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
    // os movimentos da peça no tabuleiro serão representados por uma matriz que contem
	//true nas posições de movimento possível e false onde o movimento nao é possível
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}


	
    
}
