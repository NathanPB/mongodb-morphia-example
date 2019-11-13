package br.upf.ads.banco.entities.conta;

import br.upf.ads.banco.entities.historico.Historico;

import java.util.List;

public class ContaPoupanca extends Conta {

    private double rendimento;

    public ContaPoupanca(){}
    public ContaPoupanca(int numero, int saldo, int agencia, List<Historico> historico, double rendimento) {
        super(numero, saldo, agencia, historico);
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
