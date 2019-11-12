package br.upf.ads.banco.entities;

public class ContaCorrente extends Conta {

    private int limite;
    private int juro;

    public ContaCorrente(int numero, int saldo, int agencia, int limite, int juro) {
        super(numero, saldo, agencia);
        this.limite = limite;
        this.juro = juro;
    }

    public int getLimite() {
        return limite;
    }

    public int getJuro() {
        return juro;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
