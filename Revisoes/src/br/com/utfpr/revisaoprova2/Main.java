package br.com.utfpr.revisaoprova2;

public class Main {
    public static void main(String[] args) {
        Imobiliaria imobiliaria = new Imobiliaria();

        // Cadastrando imóveis (Upcasting automático)
        imobiliaria.cadastrarImovel(new ImovelResidencial(101, "Rua XV de Novembro, 450", 1200.0, 350.0));
        imobiliaria.cadastrarImovel(new ImovelComercial(202, "Av. Carlos Cavalcanti, 1200", 3000.0)); // Construtor 1
        imobiliaria.cadastrarImovel(new ImovelComercial(203, "Rua Balduíno Taques, 88", 4500.0, 500.0)); // Construtor 2

        System.out.println("=== RELATÓRIO COMPLETO DE LOCAÇÕES ===");
        imobiliaria.emitirRelatorio();

        System.out.println("\n=== DEPARTAMENTO DE VISTORIA COMERCIAL ===");
        imobiliaria.aplicarVistoriaComercial();
    }
}