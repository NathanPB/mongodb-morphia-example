package br.upf.ads.banco.entities.historico;

import java.time.LocalDateTime;

public abstract class Historico {

    private LocalDateTime data;
    private int valor;

    public Historico(){}
    public Historico(LocalDateTime data, int valor) {
        this.data = data;
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
