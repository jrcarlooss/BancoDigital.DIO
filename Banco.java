package BancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println("Cliente: " + conta.getCliente().getNome() + ", Saldo: " + conta.getSaldo());
        }
    }
}
