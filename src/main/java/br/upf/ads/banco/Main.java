package br.upf.ads.banco;

import br.upf.ads.banco.entities.Cliente;
import br.upf.ads.banco.entities.Endereco;
import br.upf.ads.banco.entities.conta.ContaCorrente;
import br.upf.ads.banco.entities.conta.ContaPoupanca;
import br.upf.ads.banco.entities.historico.HistoricoDeposito;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("173.249.45.183", 27017);

        Morphia morphia = new Morphia();
        Datastore datastore = morphia.createDatastore(mongoClient, "banco");

        datastore.ensureIndexes();

        datastore.save(Arrays.asList(
            new Cliente(
                "Márcio",
                new Endereco("Rua das Pitangas", "Passo Fundo", "RS"),
                Arrays.asList(
                    new ContaCorrente(1, nextInt(), 1, new ArrayList<>(), nextInt(), nextInt()),
                    new ContaPoupanca(2, nextInt(), 1, new ArrayList<>(), nextInt())
                )
            ),
            new Cliente(
                "Carol",
                new Endereco("Rua Independencia", "Rio de Janeiro", "RJ"),
                Arrays.asList(
                    new ContaCorrente(3, nextInt(), 7, new ArrayList<>(), nextInt(), nextInt()),
                    new ContaCorrente(4, nextInt(), 7, new ArrayList<>(), nextInt(), nextInt()),
                    new ContaCorrente(5, nextInt(), 7, new ArrayList<>(), nextInt(), nextInt())
                )
            )
        ));

        Cliente cli = datastore.find(Cliente.class).get();
        cli.getContas()
            .get(0)
            .getHistorico()
            .add(new HistoricoDeposito(LocalDateTime.now(), nextInt()));

        datastore.save(Arrays.asList(cli));

        datastore.delete(datastore.find(Cliente.class).get());
    }

    private static int nextInt() {
        int i;
        do {
            i = new Random().nextInt();
        } while (i <= 0);
        return i;
    }
}
