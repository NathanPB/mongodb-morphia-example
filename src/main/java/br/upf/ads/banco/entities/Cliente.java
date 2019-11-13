package br.upf.ads.banco.entities;

import br.upf.ads.banco.entities.conta.Conta;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;

@Entity(value = "cliente", noClassnameStored = true)
public class Cliente {

    @Id
    private ObjectId id;

    private String nome;

    @Embedded
    private Endereco endereco;

    @Embedded
    private List<Conta> contas;

    public Cliente(){}

    public Cliente(String nome, Endereco endereco, List<Conta> contas) {
        this.nome = nome;
        this.endereco = endereco;
        this.contas = contas;
    }

    public ObjectId getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Conta> getContas() {
        return contas;
    }


    @Override
    public String toString() {
        return String.format("%s %s", getId(), getNome());
    }
}
