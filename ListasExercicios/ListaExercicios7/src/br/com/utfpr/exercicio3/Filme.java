package br.com.utfpr.exercicio3;

public class Filme {
	//===========Atributos===========
	private String titulo;
	private int duracao;
	private double precoLocacao;
	private double valorDiaAtraso;
	private Cliente cliente;
	
	private int diaLocacao;
	private int diaPrevistoDevolucao;
	private int diaDevolucao;
	
	//===========Construtor===========
	public Filme(String titulo, int duracao, double precoLocacao, double valorDiaAtraso) {
	    this.titulo = titulo;
	    this.duracao = duracao;
	    this.precoLocacao = precoLocacao;
	    this.valorDiaAtraso = valorDiaAtraso;
	    
	    this.cliente = null;
	    this.diaLocacao = 0;
	    this.diaPrevistoDevolucao = 0;
	    this.diaDevolucao = 0;
	}
	
	//===========Metodos===========
	public void locarFilme(Cliente cliente, int diaLocacao) {
	    if (this.cliente != null) {
	        System.out.println("Insucesso: O filme já está locado.");
	    } else {
	        this.cliente = cliente; 
	        this.diaLocacao = diaLocacao;
	        this.diaPrevistoDevolucao = diaLocacao + 3;
	        
	        System.out.println("Filme '" + this.titulo + "' locado com sucesso por " + cliente.nome);
	        System.out.println("Data de devolução prevista: Dia " + this.diaPrevistoDevolucao);
	    }
	}
	
	
	public void devolverFilme(int diaDevolucao) {
	    if (this.cliente == null) {
	        System.out.println("Insucesso: Este filme não está locado no momento.");
	    } else {
	        this.diaDevolucao = diaDevolucao; 
	        
	        double multa = 0.0;
	        
	        if (diaDevolucao > this.diaPrevistoDevolucao) {
	            int diasAtraso = diaDevolucao - this.diaPrevistoDevolucao;
	            multa = calcularMulta(diasAtraso);
	        }
	        
	        double valorTotal = this.precoLocacao + multa;
	        
	        System.out.println("\n=== RELATÓRIO DE DEVOLUÇÃO ===");
	        System.out.println("Título: " + this.titulo);
	        System.out.println("Cliente: " + this.cliente.nome);
	        System.out.println("Dia da Locação: " + this.diaLocacao);
	        System.out.println("Dia Previsto para Devolução: " + this.diaPrevistoDevolucao);
	        System.out.println("Dia Real da Devolução: " + this.diaDevolucao);
	        System.out.println("Valor da Locação: R$ " + this.precoLocacao);
	        System.out.println("Valor da Multa: R$ " + multa);
	        System.out.println("Valor Total: R$ " + valorTotal);
	        System.out.println("==============================\n");
	        
	        this.cliente = null; 
	    }
	}
	
	public double calcularMulta(int diasAtraso) {
		return diasAtraso*this.valorDiaAtraso;
	}
	
	public void exibirRelatorioFilme() {
	    System.out.println("\n=== RELATÓRIO DO FILME ===");
	    System.out.println("Título: " + this.titulo);
	    System.out.println("Duração: " + this.duracao + " minutos");
	    System.out.println("Preço da Locação: R$ " + this.precoLocacao);
	    System.out.println("Multa por Dia de Atraso: R$ " + this.valorDiaAtraso);
	    
	    if (this.cliente == null) {
	        System.out.println("Status: DISPONÍVEL");
	    } else {
	        System.out.println("Status: LOCADO");
	        System.out.println("--- Dados do Cliente em Posse ---");
	        System.out.println("Nome: " + this.cliente.nome);
	        System.out.println("Data de Nascimento: " + this.cliente.dataNascimento);
	        System.out.println("Telefone: " + this.cliente.telefone);
	        
	        // Acessando a composição Endereco através do Cliente
	        if (this.cliente.endereco != null) {
	            System.out.println("Endereço: " + this.cliente.endereco.getLogradouro() + ", " +
	                               this.cliente.endereco.getNumero() + " - " +
	                               this.cliente.endereco.getBairro() + " | CEP: " +
	                               this.cliente.endereco.getCep() + " | Cidade: " +
	                               this.cliente.endereco.getCidade() + "-" +
	                               this.cliente.endereco.getUf());
	        }
	    }
	    System.out.println("==========================\n");
	}
}
