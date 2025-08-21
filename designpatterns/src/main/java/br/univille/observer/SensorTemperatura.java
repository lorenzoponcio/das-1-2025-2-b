package br.univille.observer;

import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura {
    private List <Observador> observador = new ArrayList<>();
    private int temperatura;

    public void adicionarObservador(Observador curioso) {
        observador.add(curioso);
    }

    public void removerObervador(Observador curioso) {
        observador.remove(curioso);
    }

    public void adicionarTemperatura(int novaTemperatura){
        this.temperatura = novaTemperatura;
        notificarObservador();
    }

}
