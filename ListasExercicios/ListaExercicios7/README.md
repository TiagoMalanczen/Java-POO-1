# 📑 Lista de Exercícios 7 - Abstração Máxima, Polimorfismo e Relacionamentos Complexos

Este diretório contém as resoluções da sétima lista de exercícios da disciplina Orientação a Objetos 1 do curso de ADS-UTFPR (Câmpus Ponta Grossa).

## 🎯 Foco Técnico
* **Classes e Métodos Abstratos:** Emprego de contratos rígidos de comportamento (`abstract`), forçando subclasses a implementarem suas próprias regras de negócio.
* **Polimorfismo Puro:** Execução de chamadas unificadas por meio de referências da superclasse que se comportam de forma distinta em tempo de execução.
* **Associação Dinâmica (Composição e Agregação):** Gerenciamento de relacionamentos complexos onde um objeto detém ou referencia instâncias de outras classes em ciclos de vida voláteis.
* **Gestão de Listas Internas (CRUD de Agregados):** Manipulação de coleções dinâmicas (`ArrayList`) embutidas em objetos para adicionar, buscar e remover dependências por ID ou código.

## 📂 Exercícios
1. **Cálculo de Figuras Geométricas:** Criação de uma superclasse abstrata com métodos abstratos de cálculo para obrigar a implementação das fórmulas específicas de área e perímetro em `Circulo`, `Quadrado`, `Retangulo`, `Trapezio` e `Losango`.
2. **Sistema de Pagamentos Multifuncional:** Uso de abstração para padronizar o comportamento de transações financeiras executadas via `CartaoCredito`, `Pix` e `Boleto`, inicializando atributos obrigatórios e emitindo relatórios de confirmação via console.
3. **Locadora de Filmes (Sócio/Dependente):** Regra de negócio complexa para gerenciar a disponibilidade de mídias, prazos de devolução (janela de 3 dias) e cálculo progressivo de multas por atraso utilizando relacionamentos entre `Filme`, `Socio`, `Dependente` e `Endereco`.
4. **Controle de Atividades Docentes e Técnicas:** Implementação de classes para `Professor` e `TecnicoAdministrativo` contendo listas dinâmicas agregadas (de `Disciplina` e `Processo`). Inclui a remoção cirúrgica de dependências via código/número, uso de enums de titulação e cálculo de folha com gratificações baseadas em ementas e cargas horárias.

---
*Status da Lista: Finalizada* *Ambiente de Desenvolvimento: Eclipse IDE* *Linguagem: Java 21 (LTS)*
