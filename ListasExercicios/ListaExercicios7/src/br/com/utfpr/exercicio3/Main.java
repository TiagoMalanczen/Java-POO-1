package br.com.utfpr.exercicio3;

public class Main {
    public static void main(String[] args) {
    	//===========Instanciando===========
        Endereco endereco = new Endereco("Avenida Carlos Cavalcanti", 4755, "Uvaranas", "84032-000", "Ponta Grossa", "PR");

        Socio socio = new Socio("Tiago Silva", "2007-05-15", "4299999-9999", endereco, "123.456.789-00");
        Dependente dependente = new Dependente("Pedro Silva", "2012-08-20", "4298888-8888", endereco);

        
    	//===========Testando===========
        socio.atribuirDependente(dependente);

        Filme filme = new Filme("Inception", 148, 10.0, 3.0);

        filme.exibirRelatorioFilme();

        System.out.println("--- Tentativa de Locação 1 ---");
        filme.locarFilme(socio, 10); // Locado no dia 10 (Devolução prevista para o dia 13)

        System.out.println("\n--- Tentativa de Locação 2 (Com filme ocupado) ---");
        filme.locarFilme(dependente, 11);

        filme.exibirRelatorioFilme();

        System.out.println("--- Tentativa de Devolução (Com multa) ---");
        filme.devolverFilme(16);

        filme.exibirRelatorioFilme();
    }
}