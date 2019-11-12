package br.upf.ads.banco.entities.conta;

import br.upf.ads.banco.entities.historico.Historico;

import java.util.List;

public class ContaCorrente extends Conta {

    private int limite;
    private int juro;

    public ContaCorrente(int numero, int saldo, int agencia, List<Historico> historico, int limite, int juro) {
        super(numero, saldo, agencia, historico);
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
