package br.upf.ads.banco.entities;

import br.upf.ads.banco.entities.history.Historico;
import org.mongodb.morphia.annotations.Embedded;

import java.util.List;

public abstract class Conta {
    private int numero;
    private int saldo;
    private int agencia;

    @Embedded
    private List<Historico> historico;

    public Conta(int numero, int saldo, int agencia, List<Historico> historico) {
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
        this.historico = historico;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public List<Historico> getHistorico() {
        return historico;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getNumero(), getAgencia());
    }
}
