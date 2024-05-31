import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas() {
        this.contas = contas;
    }

    public void listarClientes() {

        contas.forEach(conta -> System.out.println(conta.cliente.getNome()));

    }

}
