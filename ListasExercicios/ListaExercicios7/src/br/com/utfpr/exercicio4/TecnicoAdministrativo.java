package br.com.utfpr.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class TecnicoAdministrativo extends Funcionario{

	//===========Atributos===========
	private double adicionalNoturno;
	private List<Processos> processos;
	
	//===========Contrutor===========
	public TecnicoAdministrativo(String registro, String nome, double salarioBase, String dataAdmissao,
			double adicionalNoturno) {
		super(registro, nome, salarioBase, dataAdmissao);
		this.adicionalNoturno = adicionalNoturno;
		this.processos = new ArrayList<>();
	}
	
	//===========Metodos===========
	@Override
	public double calcularSalario() {
		return this.salarioBase + this.adicionalNoturno;
	}
	@Override
	public void imprimirDados() {
		System.out.println("Registro = " +this.registro);
		System.out.println("Nome = "+ this.nome);
		System.out.println("Salario base = " +this.salarioBase);
		System.out.println("Adicional noturno  = " +this.adicionalNoturno);
		System.out.println("Data de admissao = "+ this.dataAdmissao);
		System.out.println("Salario total = " + this.calcularSalario());
	}
	
	public void atribuirProcesso(Processos processo) {
		System.out.println("Atribuindo processo de " + processo.getDescricao() + " à " +this.nome);
		this.processos.add(processo);
	}
	
	
	public void removerProcesso(int numProcesso) {
		Processos proc = this.buscarProcesso(numProcesso);
		if( proc == null) {
			System.out.println("Processo nao encontrado");
			return;
		}
		else {
			System.out.println("Removendo processo");
			this.processos.remove(proc);
		}
		
	}
	
	public Processos buscarProcesso(int numProcesso) {
		for(Processos p : this.processos) {
			if(p.getNumero() == numProcesso) 
				return p;
		}
		return null;
	}
}
