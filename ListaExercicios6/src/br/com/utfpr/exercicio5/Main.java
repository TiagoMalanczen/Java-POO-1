package br.com.utfpr.exercicio5;

public class Main {

	public static void main(String[] args) {
//		=================Instanciando=================
		Endereco endNovo = new Endereco("Avenida Silva Jardim", 800, "Rebouças", "Curitiba", "PR");
        ImovelNovo imovelNovo = new ImovelNovo(450000.0, endNovo, 50000.0);

        Endereco endUsado = new Endereco("Rua XV de Novembro", 150, "Centro", "Ponta Grossa", "PR");
        ImovelUsado imovelUsado = new ImovelUsado(300000.0, endUsado, 25000.0);
        
//		=================Testando=================
        System.out.println("--- TESTE IMÓVEL NOVO ---");
        imovelNovo.imprimirDados();
        System.out.println("Valor Final Calculado = " + imovelNovo.calcularFinal());
        System.out.println();

        System.out.println("--- TESTE IMÓVEL USADO ---");
        imovelUsado.imprimirDados();
        System.out.println("Valor Final Calculado = " + imovelUsado.calcularFinal());
	}
}
