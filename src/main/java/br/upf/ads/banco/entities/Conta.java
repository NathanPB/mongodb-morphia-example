package br.upf.ads.banco.entities;

public abstract class Conta {
    private int numero;
    private int saldo;
    private int agencia;

    public Conta(int numero, int saldo, int agencia) {
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
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

    @Override
    public String toString() {
        return String.format("%s %s", getNumero(), getAgencia());
    }
}
