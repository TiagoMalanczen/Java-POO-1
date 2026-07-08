package chessrating;

public class JogadorComum extends Jogador{

	public JogadorComum(String id, String username) {
		super(id, username);
	}

	@Override
	public void registrarResultado(int resultado, int ratingOponente) {
		if(resultado == 1) {
			super.rating += 15 + (ratingOponente - super.rating) / 10;
		}
		else {
			if(super.rating < 100) {
				return;
			}
			else {
				super.rating -= 10;
			}
		}
	
	}

	
}
