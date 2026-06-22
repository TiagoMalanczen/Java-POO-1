package br.com.utfpr.revisaoprova2;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {

	private List<Imovel> cadastroImoveis;
	
	public Imobiliaria() {
		
		this.cadastroImoveis = new ArrayList<>();
		
	}
	
	public void cadastrarImovel(Imovel i) {
		this.cadastroImoveis.add(i);
	}
	
	public void emitirRelatorio() {
		for(Imovel i: this.cadastroImoveis) {
			i.exibirDados();
		}
	}
	public void aplicarVistoriaComercial() {
		for(Imovel i : this.cadastroImoveis) {
			
			if(i instanceof ImovelComercial) {
				
			ImovelComercial comercial = (ImovelComercial) i;
				System.out.println("istoria técnica agendada para o imóvel comercial situado em: [" +comercial.endereco + "]");
			}
			
		}
	}
}
