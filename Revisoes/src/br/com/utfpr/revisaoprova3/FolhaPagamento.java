package br.com.utfpr.revisaoprova3;

import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {

	private List<Colaborador> equipe;
	
	public FolhaPagamento() {
		
		this.equipe = new ArrayList<>();
		
	}
	
	public void admitirColaborador(Colaborador c) {
		this.equipe.add(c);
	}
	public void processarFolha() {
		for(Colaborador c : equipe) {
			c.exibirHolerite();
			System.out.println("===================");
		}
	}
	public void executarAuditoriaGerencial() {
		for(Colaborador c : equipe) {
			if(c instanceof Gerente) {
				Gerente gerente =  (Gerente) c;
				System.out.println(gerente.nome + " Auditado");
			}
		}
	}
}
