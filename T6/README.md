# Trabalho Prático 6 - Isomorfismo de Árvores

## 📚 Disciplina

Resolução de Problemas com Grafos

## 👨‍🏫 Professor

Prof. Me Ricardo Carubbi

---

## 🎯 Objetivo

Este trabalho tem como objetivo implementar um algoritmo para verificar se duas árvores não direcionadas são **isomorfas**, utilizando a técnica de **codificação canônica**.

Duas árvores são consideradas isomorfas quando possuem a mesma estrutura, independentemente da rotulação dos vértices.

---

## 🧠 Abordagem Utilizada

A solução implementada segue os seguintes passos:

1. **Validação da entrada**

   * Verifica se o grafo é uma árvore:

     * Deve ser conexo
     * Deve possuir `E = V - 1`

2. **Cálculo do(s) centro(s)**

   * Remoção iterativa de folhas
   * Pode resultar em:

     * 1 centro
     * 2 centros

3. **Enraizamento da árvore**

   * A árvore é analisada a partir do(s) centro(s)

4. **Codificação canônica**

   * Folha → `()`
   * Nó interno:

     * Codifica filhos recursivamente
     * Ordena os códigos lexicograficamente
     * Concatena dentro de parênteses

5. **Comparação**

   * Se as codificações forem iguais → árvores isomorfas
   * Caso contrário → não isomorfas

---

## ⚙️ Tecnologias Utilizadas

* Java
* Biblioteca base algs4 (Graph, Bag, Stack, In, StdOut)

---

## 📁 Estrutura do Projeto

```
T6/
├── README.md
├── T6.md
├── dados/
│   ├── arvore1.txt
│   ├── arvore2.txt
│   ├── arvore3.txt
│   ├── arvore4.txt
│   ├── arvore5.txt
│   └── arvore6.txt
└── src/
    ├── Main.java
    ├── TreeIsomorphism.java
    ├── Graph.java
    ├── Bag.java
    ├── Stack.java
    ├── In.java
    ├── StdOut.java
    └── StdIn.java
```

---

## ▶️ Como Executar

1. Acesse a pasta `src`:

```bash
cd src
```

2. Compile os arquivos:

```bash
javac *.java
```

3. Execute o programa:

```bash
java Main ../dados/arvore1.txt ../dados/arvore2.txt
```

---

## 📄 Formato da Entrada

Os arquivos devem seguir o padrão:

```
V
E
v1 w1
v2 w2
...
```

Onde:

* `V` = número de vértices
* `E` = número de arestas
* cada linha representa uma aresta não direcionada

---

## 🧪 Casos de Teste

Foram utilizados diferentes cenários:

* Árvores isomorfas
* Árvores não isomorfas
* Árvores com dois centros

---

## ✅ Saída do Programa

O programa exibe:

* Lista de adjacência de cada árvore
* Validação da entrada
* Centros encontrados
* Codificação canônica
* Resultado final (isomorfas ou não)

---