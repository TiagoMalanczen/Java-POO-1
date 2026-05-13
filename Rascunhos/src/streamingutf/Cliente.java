package streamingutf;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	//==============Atributos==============
	private int id;
	private int limiteFilmes;
	private Plano plano;
	
	private List<Filme> filmesAlugados;

	//==============Construtor==============
	public Cliente(int id, int limiteFilmes, Plano plano) {
		 
		this.id = id;
		this.limiteFilmes = limiteFilmes;
		this.plano = plano;
		this.filmesAlugados = new ArrayList<>();
	}
	
	//==============Getters==============
	public int getId() {
		return id;
	}

	public int getLimiteFilmes() {
		return limiteFilmes;
	}

	public Plano getPlano() {
		return plano;
	}

	public List<Filme> getFilmesAlugados() {
		return filmesAlugados;
	}
	
}
