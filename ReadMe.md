# Aula 31/07

*Abstrações*

Transformar problemas reais em soluções técnicas

*Api*

Abstraía as funcionalidades do back-end

*Complexidade*

Assim como na vida real a complexidade faz parte do desenvolvimento de software, antes algo que podia ser resolvido com um código simples, hoje, deve ser orientado e divido em classes, porém é passando pela complexidades que podemos evoluir profissionalmente.

*Framework*

Facilita o desenvolvimento do programa, quebrando problemas de comunicação complexos em simples códigos ou até mesmo linhas. A escolha de um framework é extremamente importante para a criação de um sistema.

Para estudos, é importante aprender ao menos 1 framework, pois a maioria é muito semelhante e ao dominar 1 é muito fácil de se aprender outro.


*Estrutura de Dados*

Característica muito valorizada por grandes empresas, a escolha da estrutura correta e aplicação da mesma é o que permite sistemas complexos de funcionarem corretamente.

*Information Hiding*

Oculta a complexidade e a transforma em coisas simples para o dia-a-dia, ou seja, não precisamos saber o que acontece por detrás dos panos para entender como é o funcionamento do produto.

# Aula 04/08

*Getter e Setter*

São utilizados para encapsular as informações e protege-las


*Coesão*

Toda classe deve implementar uma única responsabilidade, ou seja, ser responsável por fazer uma única função, bem feita. A coesão facilita a implementação de uma classe, seu entendimento e também sua manutanção, facilita a alocação de um único responsável e o reúso e teste de uma classe.


*Acoplamento*

Quando falamos de acoplamento nos referimos a conexão entre duas classes, no qual existem 2 tipos: acomplamento aceitável e acoplamento ruim.

A seta entre A e B indíca uma variável

Class A {
    private B b;
    public A(){
        b = new B();
        b.fazqq();
    }
}

Sempre que possível o ideal é reduzir o acoplamento, podendo através de certos métodos criar iterfaces "portas usbs" permitindo que ao trocar um código conectado a esta interface, o sistema não quebre.

"Maximize a coesão das classes e minimize o acoplamento entre elas."


# Aula 11/08

*Princípio de Inversão de Dependências*

Esse princípio recomenda que uma classe cliente deve estabelecer dependências pioritariamente com abstrações e com implementações concretas

Os controladores precisam de uma dependência, no caso, interfaces de serviço e não com a implementação concreta, ou seja, service impl

O cliente não "conversa" diretamente com o código, ele aguarda em uma interface pela resposta do código


*Prefira Composição a Herança*

Existem dois tipos de herança:

Herança de classes: envolve reúso de código (deve ser evitada).

Herança de interfaces: Permite que uma interface herde de outras interfaces, estabelecendo um conjunto de métodos que devem ser implementados por classes que implementam a interface derivada

Ao invés de se utilizar heranças o ideal é se utilizar associações, heranças tendem a introduzir problemas na manutenão e evolução de classes de um sistema.

Heranças só podem ser utilizada se as subclasses nunca irão se juntar, exemplo um "gato" não pode ser um "cachorro" portanto pode se utilizar heranças.


*Princípio de Demeter ou Menor Conhecimento*

Um método deve invocar somentes os seguintes outros métodos:

1- de sua própria classe
2- de objetos passados como parâmetros
3- de objetos criados pelo próprio métodos
4- de atributos da classe do método


*Princípio Aberto/Fechado*

-Uma classe deve estar fechada para modificações e aberta para extensões.  
-*Classe Abstrata*: pegar uma classe e misturar com uma interface (meio incompleta).  
-Isso significa projetá-la de forma a permitir novas funcionalidades sem alterar seu código, usando recursos como herança, funções lambda e padrões de projeto, garantindo flexibilidade e adaptabilidade. 


# Aula 14/08  

*Princípio de Substituição de Liskov (LSP)*

-Herança define uma relação *é-um* entre objetos de uma classe base e objetos de subclasses.  
-Quando se tem uma herança, subclasses precisam dos mesmos métodos que o pai.
-Substitui um filho por outro, sem ter perda.


# Aula 18/08

*Padrões de Projeto*

# Aula 28/08

A estrutura escolhida serve para suportar o que for colocado no código

"Arquitetura é sobre algo importante… seja lá o que for." — Ralph Johnson

Características de Arquitetura como Requisitos Não Funcionais

As características arquiteturais representam os critérios essenciais para o sucesso de um sistema, geralmente relacionados a aspectos não funcionais, como desempenho, segurança e escalabilidade, que são independentes das funcionalidades específicas. Nem sempre é possível atender a todas essas características simultaneamente, sendo necessário priorizar algumas em detrimento de outras, conforme as necessidades do projeto.

Decisões de Arquitetura

O arquiteto de software deve escolher tecnologias e abordagens com as quais tenha maior domínio e que melhor atendam aos objetivos do sistema. Essas decisões estabelecem diretrizes claras sobre como o sistema deve ser desenvolvido, garantindo consistência e qualidade na implementação.

Princípios de Design

Entre os princípios fundamentais, destaca-se a minimização do acoplamento entre componentes para aumentar a modularidade e facilitar a manutenção. Em arquiteturas baseadas em microserviços, recomenda-se o uso de comunicação assíncrona via mensagens para melhorar o desempenho e a escalabilidade dos serviços.

# Aula 01/09

*Expectativas de um Arquiteto* 

Existem 8 expectativas principais para um arquiteto de software

## Orientação é a palavra de ordem nessa primeira expectativa

1- Tomar decisões de arquitetura
2- Analisar continuamente a arquitetura
3- Manter-se atualizado com as últimas tendências
## levando em consideração a relevância para seu contexto
4- Assegurar a conformidade com as decisões
## servir como um guia para a equipe, levando em consideração o contexto do projeto
5- Exposição e experiência diversificadas
## Carreira profissional relevante
6- Ter conhecimento sobre o domínio do negócio
7- Ter habilidades interpessoais
8- Entender e lidar bem com questões políticas





