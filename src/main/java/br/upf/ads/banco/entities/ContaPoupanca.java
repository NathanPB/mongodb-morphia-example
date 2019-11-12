package br.upf.ads.banco.entities;

public class ContaPoupanca extends Conta {

    private double rendimento;

    public ContaPoupanca(int numero, int saldo, int agencia, double rendimento) {
        super(numero, saldo, agencia);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
