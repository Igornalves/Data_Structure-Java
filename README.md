## Estrutura de Dados Em Java 

Seja Bem vindo ao repositorio de Estrutura de dados que estarei usando da Linguagem Java 

<div align="center" style="display: inline_block">
<img  alt="java" width="100" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
</div>

<br>

Para que possa aprender o maximo possivel sobre tal parte muito importante da programação que sera utilizada em muitas linguagens existentes.

## Principais Fundamentos da Estrutura de dados 

Aqui no meu repositorio vc verá coisas como: 

- `Arrays Unidimensionais`
- `Arrays Multidimensionais`
- `Listas Duplamente Ligadas`
- `Busca Linear Com Arrays`
- `Collections em java`
- `listas Ligadas`
- `Pilhas e Filas`
- `Árvores`
- `Grafos`

Este são algums dos metodos e tambem conhecimentos sobre a Base de estrutura de dados que esterei aprendendo aqui a fazer para desenvolver mais como desenvolvedor de sistemas de Software.

<br>

<div align="center" style="display: inline_block">
<img  alt="java" width="454" src="image/Colecoes em java.png">
<img  alt="java" width="311" src="image/arvore Estrutura de dados.png">
</div>

<div align="center" style="display: inline_block">
<img  alt="java" width="439" src="image/fila eestrutura de daos.jpg">
<img  alt="java" width="328" src="image/pihla estrutura de dados.jpg">
</div>

<div align="center" style="display: inline_block">
<img  alt="java" width="450" src="image/grafo estrutura de dados.jpg">
</div>

<br>
<br>

> Estarei tambem fazendo algums `codigos de aprendizado` de forma que ajude na `Implementação de estruturas de dados em problemas reais`.

## Os principais fundamentos da estrutura de dados em Java

### Arrays: 

- Arrays são coleções ordenadas de elementos do mesmo tipo. 

- Eles têm um tamanho fixo que é especificado na sua declaração e podem ser usados para armazenar múltiplos elementos do mesmo tipo de dados.

```java
// Declaração e inicialização de um array de inteiros
int[] numeros = {1, 2, 3, 4, 5};

// Declaração de um array de strings com tamanho específico
String[] nomes = new String[3];

// passando os dados por indices
nomes[0] = "Alice";
nomes[1] = "Bob";
nomes[2] = "Carol";
```
### Listas: 

- Listas são coleções que armazenam elementos em uma sequência ordenada. 

- Em Java, a interface List é uma das estruturas de dados mais usadas. Algumas implementações comuns de List em Java são ArrayList e LinkedList.

```java 
// Criando um ArrayList de strings
ArrayList<String> lista = new ArrayList<>();

// Adicionando elementos à lista
lista.add("Maçã");
lista.add("Banana");
lista.add("Laranja");

// Criando uma LinkedList de números inteiros
LinkedList<Integer> numeros = new LinkedList<>();

// Adicionando elementos à lista
numeros.add(10);
numeros.add(20);
numeros.add(30);
```

### Filas (Queues): 

- Filas são estruturas de dados que seguem o princípio FIFO (First-In-First-Out), onde o primeiro elemento inserido é o primeiro a ser removido. 

- A interface Queue em Java é usada para representar filas.

```java
// Criando uma fila utilizando LinkedList
Queue<String> fila = new LinkedList<>();

// Adicionando elementos à fila
fila.offer("Elemento 1");
fila.offer("Elemento 2");
fila.offer("Elemento 3");
```

### Pilhas (Stacks):

- Pilhas são estruturas de dados que seguem o princípio LIFO (Last-In-First-Out), onde o último elemento inserido é o primeiro a ser removido. 
 
- A classe ***Stack*** em Java pode ser usada para implementar pilhas.

```java
// Criando uma pilha
Stack<Integer> pilha = new Stack<>();

// Adicionando elementos à pilha
pilha.push(10);
pilha.push(20);
pilha.push(30);
```

### Conjuntos (Sets): 

- Conjuntos são coleções que não permitem elementos duplicados. Em Java, a interface Set é usada para representar conjuntos. 

- Alguns exemplos de implementações de ***Set*** são ***HashSet*** e ***TreeSet***.

```java
// Criando um HashSet
HashSet<String> conjunto = new HashSet<>();

// Adicionando elementos ao conjunto
conjunto.add("maçã");
conjunto.add("banana");
conjunto.add("laranja");

// Criando um TreeSet
TreeSet<String> conjunto = new TreeSet<>();

// Adicionando elementos ao conjunto
conjunto.add("maçã");
conjunto.add("banana");
conjunto.add("laranja");
```

### Mapas (Maps): 

- Mapas são coleções de pares chave-valor, onde cada chave está associada a um único valor. 

- A interface Map em Java é usada para representar mapas. Exemplos de implementações de ***Map*** são ***HashMap e TreeMap***.

```java
 // Criando um HashMap
HashMap<Integer, String> mapa = new HashMap<>();

// Adicionando pares chave-valor ao mapa
mapa.put(1, "maçã");
mapa.put(2, "banana");
mapa.put(3, "laranja");

// Criando um TreeMap
TreeMap<Integer, String> mapa = new TreeMap<>();

// Adicionando pares chave-valor ao mapa
mapa.put(1, "maçã");
mapa.put(3, "banana");
mapa.put(2, "laranja");
```

### Árvores (Trees): 

- Árvores são estruturas de dados hierárquicas que consistem em nós conectados por arestas. 

- Existem vários tipos de árvores em Java, como árvores binárias, árvores de busca binária, árvores AVL, árvores B, etc.

```java
meu-projeto/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── exemplo/
│   │   │           └── MeuApp.java
│   │   └── resources/
│   │       └── config.properties
│   │
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── exemplo/
│       │           └── MeuAppTest.java
│       └── resources/
│           └── test-config.properties
│
├── lib/
│   └── biblioteca1.jar
│
├── target/
│   ├── classes/
│   │   └── com/
│   │       └── exemplo/
│   │           └── MeuApp.class
│   ├── test-classes/
│   │   └── com/
│   │       └── exemplo/
│   │           └── MeuAppTest.class
│   └── meu-projeto.jar
│
├── pom.xml
└── README.md
```

Em resumo esses são alguns dos principais fundamentos da estrutura de dados em Java. Cada estrutura de dados tem suas próprias características e é escolhida com base nos requisitos específicos do problema a ser resolvido.

