package br.univille.observer;

public class Cliente {
    public static void main(String[] args) {
        //publicador
        var grupoFamilia = new Publisher();
        
        var zezinho = new ConcreteSubscriber();
        var joao = new ConcreteSubscriber();
        var tia = new ConcreteSubscriber();

        //entrou no grupo da familia
        grupoFamilia.subscribe(zezinho);
        grupoFamilia.subscribe(joao);
        grupoFamilia.subscribe(tia);

        grupoFamilia.setMainState("inter");
        //botao enviar
        grupoFamilia.notifySubscribers();

    }
}
