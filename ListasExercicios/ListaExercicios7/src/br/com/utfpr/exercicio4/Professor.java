package br.com.utfpr.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario{
	//===========Atributos===========
	private Titulacao titulacao;
	
	
	private List<Diciplina> diciplinas;
	
	//===========Construtor===========
	public Professor(String registro, String nome, double salarioBase, Titulacao titulacao, String dataAdmissao) {
		super(registro, nome, salarioBase, dataAdmissao);
		this.titulacao = titulacao;
		this.dataAdmissao = dataAdmissao;
		this.diciplinas = new ArrayList<>();
	}
	
	//===========Metodos===========
	@Override
	public double calcularSalario() {
		double gratificacao = 0;
		double bonusHora = 1;
		if(this.titulacao == titulacao.DOUTOR) {
			gratificacao = 1000.00;
		}
		else{
			gratificacao = 2000.00;
			bonusHora = 15.00;
		}
		double salario = this.salarioBase + gratificacao + bonusHora*this.somarHora();
		
		return salario;
	}
	@Override
	public void imprimirDados() {
		System.out.println("Registro = " +this.registro);
		System.out.println("Nome = "+ this.nome);
		System.out.println("Salario base = " +this.salarioBase);
		System.out.println("Titulacao = " +this.titulacao);
		System.out.println("Data de admissao = "+ this.dataAdmissao);
		System.out.println("Salario total = " + this.calcularSalario());
	}
	
	
	public void receberNovasDiciplinas(Diciplina diciplina) {
		System.out.println("Atribuindo nova diciplina " + diciplina.getNomeDiciplina()  +" à " + this.nome);
		this.diciplinas.add(diciplina);
	}
	
	public void removerDiciplina(int codDiciplina) {
		Diciplina dis = this.buscarDiciplina(codDiciplina);
		if( dis == null) {
			System.out.println("Diciplina nao encontrada");
			return;
		}
		else {
			System.out.println("Removendo diciplina do professor");
			this.diciplinas.remove(dis);
		}
		
	}
	
	public Diciplina buscarDiciplina(int id) {
		for(Diciplina d : this.diciplinas) {
			if(d.getCodigo() == id) 
				return d;
		}
		return null;
	}
	public double somarHora() {
		int horasTotais = 0;
		for(Diciplina dic : this.diciplinas) {
			horasTotais += dic.getHoras();
		}
		return horasTotais;
	}
	
	
}
