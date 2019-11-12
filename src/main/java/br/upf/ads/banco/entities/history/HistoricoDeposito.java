package br.upf.ads.banco.entities.history;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class HistoricoDeposito extends Historico {

    public HistoricoDeposito(LocalDateTime data, int valor) {
        super(data, valor);
    }

    @Override
    public String toString() {
        return String.format("Saque %s %s", getValor(), new SimpleDateFormat("y-M-d H:m").format(getData()));
    }
}
