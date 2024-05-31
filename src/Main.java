//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente verus = new Cliente();
        verus.setNome("Verusiana");

        Conta cc = new ContaCorrente(verus);
        banco.adicionarConta(cc);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(verus);
        banco.adicionarConta(poupanca);
        cc.transferir(50,poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println("---");
        banco.listarClientes();

    }
}