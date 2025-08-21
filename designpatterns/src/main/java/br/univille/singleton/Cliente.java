package br.univille.singleton;

public class Cliente {
    public static void main(String[] args) {
        var segredo = "O Inter já está nas quartas";

        var singleton  = Singleton.getInstance();
        singleton.setSegredo(segredo);

        //Linhas de código

        System.out.println(
            Singleton.getInstance().getSegredo()
        );
    }
}
