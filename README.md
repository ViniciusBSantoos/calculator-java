# 🧮 Java Calculator

Projeto desenvolvido em **Java** para realizar operações de **soma** e **subtração** utilizando múltiplos números informados pelo usuário em uma única entrada, separados por vírgula.

O projeto foi desenvolvido com foco na prática de lógica de programação, Programação Orientada a Objetos (POO) e manipulação de Strings.

---

## 🚀 Funcionalidades

- ✅ Receber vários números separados por vírgula;
- ✅ Realizar a soma de todos os números informados;
- ✅ Realizar a subtração sequencial dos números;
- ✅ Exibir o resultado no terminal;
- ✅ Interface simples via console;
- ✅ Código organizado em classes.

---

## 💻 Exemplo de execução

### Entrada

```text
==================================
      CALCULADORA JAVA
==================================

Digite os números separados por vírgula:

10,20,30,40

Escolha a operação:

1 - Soma
2 - Subtração

Opção: 1
```

### Saída

```text
Resultado da soma: 100
```

---

### Outro exemplo

### Entrada

```text
==================================
      CALCULADORA JAVA
==================================

Digite os números separados por vírgula:

100,20,30

Escolha a operação:

1 - Soma
2 - Subtração

Opção: 2
```

### Saída

```text
Resultado da subtração: 50
```

---

## 🛠️ Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Scanner
- Arrays
- Strings
- Estruturas condicionais (`switch`)
- Estruturas de repetição (`for`)

---

## 📚 Conceitos praticados

Durante o desenvolvimento deste projeto foram aplicados os seguintes conceitos:

- Leitura de dados utilizando `Scanner`;
- Manipulação de `String`;
- Método `split()`;
- Conversão de `String` para inteiro (`Integer.parseInt()`);
- Vetores (`String[]`);
- Estruturas de repetição (`for`);
- Estruturas condicionais (`switch`);
- Criação de métodos;
- Criação de objetos;
- Programação Orientada a Objetos (POO);
- Separação de responsabilidades entre classes.

---

## 📂 Estrutura do projeto

```text
java-calculator/
│
├── src/
│   ├── Main.java
│   └── Calculadora.java
│
└── README.md
```

### Main.java

Responsável por:

- Interagir com o usuário;
- Ler os números digitados;
- Exibir o menu de opções;
- Chamar os métodos da classe `Calculadora`;
- Mostrar o resultado da operação.

### Calculadora.java

Responsável por:

- Realizar a soma dos números;
- Realizar a subtração dos números;
- Retornar o resultado para a classe `Main`.

---

## ▶️ Como executar

1. Clone este repositório.

2. Compile os arquivos Java:

```bash
javac *.java
```

3. Execute o programa:

```bash
java Main
```

4. Digite os números separados por vírgula e escolha a operação desejada.

---

## 🎯 Melhorias futuras

- Adicionar multiplicação;
- Adicionar divisão;
- Adicionar porcentagem;
- Implementar tratamento de exceções;
- Criar interface gráfica utilizando Swing;
- Transformar a calculadora em uma API utilizando Spring Boot.

---

## 👨‍💻 Autor

**Vinicius Batista Santos**

Projeto desenvolvido para praticar lógica de programação, Programação Orientada a Objetos (POO) e fortalecer o portfólio de projetos em Java.
