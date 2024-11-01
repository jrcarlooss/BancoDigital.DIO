package BancoDigital;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        Cliente cliente1 = new Cliente("Carlos");
        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente1);
        
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);
        
        contaCorrente.depositar(500);
        contaCorrente.transferir(200, contaPoupanca);
        
        banco.listarContas();
    }
}


