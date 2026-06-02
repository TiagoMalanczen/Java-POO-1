# 📑 Lista de Exercícios 6 - Aplicação de Herança e Polimorfismo

Este diretório contém as resoluções da sexta lista de exercícios da disciplina Orientação a Objetos 1 do curso de ADS-UTFPR (Câmpus Ponta Grossa).

## 🎯 Foco Técnico
* **Mecanismos de Herança:** Reaproveitamento de estruturas de dados através do acoplamento entre superclasses e subclasses (`extends`).
* **Sobrecarga de Construtores:** Implementação de múltiplos construtores encadeados invocando comportamentos base com valores padrão.
* **Sobrescrita de Métodos (`super`):** Redefinição e extensão do comportamento de métodos da classe pai nas classes filhas (ex: `exibirData`).
* **Regras de Negócio Dinâmicas:** Implementação de polimorfismo para processamento de cálculos específicos (IPVA, salários e valores imobiliários).

## 📂 Exercícios
1. **Controle de Datas e Feriados:** Sobrecarga de construtores na classe `Data` e especialização na classe `Feriado` com extensão do método de exibição.
2. **Gestão de Contratos de Trabalho:** Modelagem e instanciação de subclasses de funcionários (`Empregado`, `Estagiario`, `Empresa` e `Autonomo`) com métodos de impressão explícitos.
3. **Sistema Acadêmico:** Herança pura entre `Pessoa` e `Aluno`, garantindo o repasse obrigatório de atributos comuns para o construtor da superclasse.
4. **Gerenciamento de Frota:** Extração de uma superclasse `Veiculo` para calcular o IPVA diferenciado de carros ($3,5\%$), motos ($2\%$) e caminhões ($1,5\%$).
5. **Sistema Imobiliário:** Composição de endereço integrada a imóveis novos (cálculo com taxa adicional) e usados (cálculo com desconto).
6. **Folha de Pagamento Dinâmica:** Cálculo de salários finais com regras distintas para cargos administrativos, desenvolvedores (bônus por projeto) e gerentes (participação nos lucros).

---
*Status da Lista: Finalizada* *Ambiente de Desenvolvimento: Eclipse IDE* *Linguagem: Java 21 (LTS)*
