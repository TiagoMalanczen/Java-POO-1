package chessrating;

public abstract class Jogador {

	protected String id;
	protected String username;
	protected int rating;
	
	public Jogador(String id, String username) {
		super();
		this.id = id;
		this.username = username;
		this.rating = 1000;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getId() {
		return id;
	}

	public int getRating() {
		return rating;
	}
	
	public abstract void registrarResultado(int resultado, int ratingOponente);
	
}
