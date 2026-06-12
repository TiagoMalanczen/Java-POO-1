# 🧱 Aprendendo Polimorfismo - Laboratório de Prática

Diretório dedicado ao isolamento de estudos e testes práticos para consolidação do conceito de **Polimorfismo** e **Abstração** em Java.

## 🧠 Conteúdo Aprendido
* **Contratos Abstratos:** Aplicação prática da palavra-chave `abstract` para padronizar o comportamento de subclasses.
* **Vinculação Dinâmica:** Compreensão de como o Java decide, em tempo de execução, qual método executar com base no objeto real alocado na memória.
* **Coleções Polimórficas:** Capacidade de armazenar e processar diferentes subclasses dentro de um único `ArrayList` referenciado pela classe mãe.

## 📂 Exercícios Implementados

### ✉️ Exercício 1: Sistema de Notificações
* **Foco:** Sintaxe base de herança abstrata.
* **Estrutura:** Classe mãe `Notificacao` derivando em `NotificacaoEmail` e `NotificacaoSMS` com saídas customizadas no console.

### 🚚 Exercício 2: Simulador de Frete
* **Foco:** Polimorfismo aplicado a retornos e cálculos numéricos.
* **Estrutura:** Classe mãe `Frete` calculando taxas distintas para as subclasses `FreteExpresso` e `FreteEconomico`.

### 🛒 Exercício 3: Carrinho de Compras
* **Foco:** Manipulação de subclasses dentro de coleções dinâmicas.
* **Estrutura:** Um único `ArrayList<Produto>` gerenciando e somando os valores finais de `ProdutoFisico` (com taxa) e `ProdutoDigital` (com desconto) via laço de repetição.

---
*Status: Pronto para codificação.* *Ambiente: Eclipse IDE / VS Code* *Linguagem: Java 21 (LTS)*
