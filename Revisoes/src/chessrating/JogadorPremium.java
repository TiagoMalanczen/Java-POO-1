package chessrating;

public class JogadorPremium extends Jogador{

	private double taxaInscricao;
	
	public JogadorPremium(String id, String username , double taxaInscricao) {
		super(id, username);
		this.taxaInscricao = taxaInscricao;
	}

	@Override
	public void registrarResultado(int resultado, int ratingOponente) {
		if(resultado == 1) {
			super.rating += 25 + (ratingOponente - super.rating) / 10;
		}
		else {
			if(super.rating < 100) {
				return;
			}
			else {
				super.rating -= 5;
			}
		}
	}

	
}
