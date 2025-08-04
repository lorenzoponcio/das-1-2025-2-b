## Aula 31/07

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

## Aula 04/08

*Getter e Setter*

São utilizados para encapsular as informações e protege-las


*Coesão*

Toda classe deve implementar uma única responsabilidade, ou seja, ser responsável por fazer uma única função, bem feita. A coesão facilita a implementação de uma classe, seu entendimento e também sua manutanção, facilita a alocação de um único responsável e o reúso e teste de uma classe.


*Acoplamento*

Quando falamos de acoplamento nos referimos a conexão entre duas classes, no qual existem 2 tipos: acomplamento aceitável e acoplamento ruim.
 _____         _______  
|__A__|       |___B___|
|     |  -->  |       |
|_____|       |fazqq()| 
|_____|       |_______|

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


