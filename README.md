# 📚 Atividade Prática - Estruturas de Dados e Orientação a Objetos em Java

Este repositório contém um conjunto de algoritmos desenvolvidos em **Java** para a entrega de uma atividade prática. Os exercícios abordam desde a manipulação básica de laços de repetição até a implementação de sistemas completos utilizando conceitos de Programação Orientada a Objetos (POO) e coleções do ecossistema Java.

---

## 🛠️ Tecnologias Utilizadas

*   **Linguagem:** Java (Versão 17 ou superior)
*   **Paradigma:** Orientado a Objetos
*   **Estruturas utilizadas:** `ArrayList`, `HashSet`, `HashMap`, `Queue` (LinkedList) e loops avançados (`for-each`).

---

## 📌 Exercícios Resolvidos

Aqui está o resumo do que foi implementado em cada parte do projeto:

### 1. Manipulação de Mapas e Conjuntos de Chaves
*   **Conceito:** Compreensão de laços `for-each` aplicados às chaves de um mapa (`keySet()`).
*   **Descrição:** Leitura passo a passo de como iterar sobre códigos de matrícula e associá-los aos seus respectivos registros.

### 2. Lista de Compras Básica
*   **Coleção:** `ArrayList<String>`
*   **Descrição:** Programa que cria uma lista de compras, adiciona 5 produtos dinamicamente, lista os itens cadastrados e calcula automaticamente a quantidade total de itens no carrinho usando o método `.size()`.

### 3. Cálculo de Média Escolar
*   **Coleção:** `ArrayList<Double>`
*   **Descrição:** Algoritmo que armazena quatro notas usando classes invólucro (`Double`), realiza a soma através de um acumulador em um laço `for-each`, calcula a média aritmética e valida se a turma foi aprovada (média $\ge$ 7.0).

### 4. Controle de Presença Sem Duplicadas
*   **Coleção:** `HashSet<String>`
*   **Descrição:** Demonstração prática de um conjunto que rejeita elementos duplicados. O programa simula a chamada de alunos inserindo nomes repetidos e exibe a listagem limpa final e a contagem de pessoas únicas presentes.

### 5. Dicionário de Alunos (Matrícula e Nome)
*   **Coleção:** `HashMap<Integer, String>`
*   **Descrição:** Mapeamento de chave-valor simétrico a uma lista de presença. O algoritmo permite cadastrar alunos através da matrícula, efetuar buscas diretas em tempo constante com `.get()`, realizar exclusões com `.remove()` e listar o mapa completo iterando pelas chaves.

### 6. Sistema de Fila de Atendimento
*   **Coleção:** `Queue<String>` (implementada através de uma `LinkedList`)
*   **Descrição:** Simulação de uma fila de banco ou lanchonete baseada na regra FIFO (*First In, First Out*). Permite enfileirar clientes, "espiar" o próximo da fila com `.peek()`, realizar atendimentos removendo pessoas da frente com `.poll()` e verificar o estado atualizado da fila.

### 7. Sistema de Gerenciamento de Biblioteca (Mini-Projeto)
*   **Coleção:** `ArrayList<Livro>`
*   **Descrição:** Sistema completo orientado a objetos com um menu interativo controlado por `do-while` e `switch-case`. Possui uma classe modelo `Livro` que encapsula atributos privados e métodos de acesso (`Getters/Setters`). Regras implementadas:
    *   Cadastrar novos livros (com status inicial livre).
    *   Listar acervo mostrando os metadados e se o livro está "Disponível" ou "Emprestado".
    *   Emprestar livro (bloqueia novas locações mudando o status para indisponível).
    *   Devolver livro (retorna o status para disponível).

### 8. Sistema de Controle de Pedidos - Lanchonete (Projeto Final)
*   **Coleção:** `ArrayList<Pedido2>`
*   **Descrição:** Painel de controle para gerenciar ordens de serviço de uma lanchonete. Utiliza encapsulamento estrito na classe modelo `Pedido2`. Funcionalidades inclusas:
    1.  Cadastrar pedidos (nascem com status `"PENDENTE"`).
    2.  Listar fila de produção inteira.
    3.  Atualizar o status de um pedido específico (para `"PREPARANDO"` ou `"FINALIZADO"`).
    4.  Localizar uma comanda filtrando pelo número único do pedido.
    5.  Exibir o faturamento total acumulado de todos os pedidos cadastrados na sessão.

---

## 🚀 Como Executar o Projeto

1.  Certifique-se de ter o **JDK** instalado na sua máquina.
2.  Clone este repositório para o seu ambiente local:
    ```bash
    git clone https://github.com
    ```
3.  Abra os arquivos em sua IDE de preferência (VS Code, IntelliJ IDEA, Eclipse, NetBeans).
4.  Execute a classe que possui o método `main` correspondente ao sistema que deseja testar (ex: `SistemaLanchonete.java`).

---
✒️ **Desenvolvido por:** [Seu Nome Completo]  
📅 **Data de entrega:** Maio de 2026
