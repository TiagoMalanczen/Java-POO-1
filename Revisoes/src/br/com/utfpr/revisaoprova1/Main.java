package br.com.utfpr.revisaoprova1;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        // Testando Upcasting e Sobrecarga de construtores
        loja.adicionarJogo(new JogoFisico(1, "Elden Ring", 250.0, 20.0));
        loja.adicionarJogo(new JogoDigital(2, "Cyberpunk 2077", 199.0)); // Sem cupom
        loja.adicionarJogo(new JogoDigital(3, "The Witcher 3", 100.0, 15.0)); // Com cupom de 15%

        System.out.println("--- RELATÓRIO DO CATÁLOGO ---");
        loja.relatorioCatalogo();

        System.out.println("\n--- VERIFICAÇÃO DE SERVIDORES ---");
        loja.aplicarManutencaoDigital();
    }
}
