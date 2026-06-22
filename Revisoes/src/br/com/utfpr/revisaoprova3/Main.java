package br.com.utfpr.revisaoprova3;

public class Main {
    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();

        // Admitindo colaboradores (Upcasting)
        folha.admitirColaborador(new Desenvolverdor(1, "Tiago Malanczen", 5000.0, 3)); // 3 projetos concluídos
        folha.admitirColaborador(new Gerente(2, "Alice Souza", 9000.0)); // Bônus padrão
        folha.admitirColaborador(new Gerente(3, "Bruno Lima", 11000.0, 3000.0)); // Bônus customizado

        System.out.println("=== PROCESSAMENTO DA FOLHA DE PAGAMENTO ===");
        folha.processarFolha();

        System.out.println("\n=== ROTINA DE AUDITORIA INTERNA ===");
        folha.executarAuditoriaGerencial();
    }
}