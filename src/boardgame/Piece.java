package boardgame;

public class Piece {
	
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


	
    
}
