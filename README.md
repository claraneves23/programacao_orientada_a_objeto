# Programação Orientada a Objeto 🤖 

Disciplina ministrada pelo professor Mauricio Conceição Mario

Lattes:  http://lattes.cnpq.br/1664094500114045

## Aula 01

* Abstração: é a decomposição de um sistema complexo em suas partes fundamentais, descrevendo-o em uma linguagem simples e precisa. A descrição das partes de um sistema consiste em atribuir-lhes nomes e descrever suas funcionalidades (Goodrich & Tamassia, 2013).

### Exemplo de abstração no contexto da Fatec:

* Atributos: Identificação da unidade, um curso da unidade.
* Métodos (ações): Funções que retornam as informações desses atributos.
* Classe: Representa uma entidade computacional que contém os objetos.
* Variável de instância: A chave de acesso aos objetos

## Aula 02

* Encapsulamento: Define o que é acessível na classe, e é a forma como os elementos podem ser vistos e utilizados por outras classes.

### Modificadores de Acesso em Java
* public: Permite que a classe, atributo ou método seja acessível por qualquer outra classe.
* private: Restringe o acesso do atributo ou método apenas à própria classe onde ele foi declarado.
* protected: Deixa visível para todas as outras classes que pertencem ao mesmo pacote. A principal diferença é que apenas as classes do mesmo pacote têm acesso mútuo.
* package-private: Quando nenhum modificador é especificado, o atributo ou método fica acessível apenas por classes dentro do mesmo pacote. Ele não pode ser acessado por classes de outros pacotes, nem mesmo por subclasses externas. É útil para restringir o acesso a métodos e atributos que devem ser usados apenas dentro do próprio pacote.

#### This
* this = operador de referência
* Unifica o atributo e a variável recebida como argumento pelo método.

#### Atenção 🚨

* Variáveis encapsuladas como private só podem ser manipuladas e/ou acessadas através de métodos.
 
#### Get e Set

* Os métodos get e set em Java são usados para acessar e modificar atributos de uma classe, respeitando o princípio do encapsulamento.

* Getter (get): Método que retorna o valor de um atributo privado.
* Setter (set): Método que permite modificar o valor de um atributo privado.

## Aula 03

### Métodos Construtores

* O método construtor constrói o objeto com valores, é invocado pelo operador new quando o objeto é criado e aloca espaço na memória para a manipulação do objeto. Deve possuir o mesmo nome da classe .

### Métodos Destrutores (finalizers) 

* Liberam os recursos usados pelos objetos durante a execução do programa. A linguagem Java possui um processo automático para limpeza de objetos não utilizados depois de um certo tempo, nomeado como "Coleta Automática de Lixo" (automatic garbage collection).

### Variável Static 

* Declaração de variável static dentro de uma classe: a atribuição de valor prevalece para a última instância de objeto.
* Declaração de variável static dentro de uma classe: a atribuição de valor estará de acordo com a última instância do objeto.












