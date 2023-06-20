import java.util.HashMap;
import java.util.Map;

public class SuperMercado {
    private Estoque estoque;
    public Map<Produto, Integer> vendas;

    private Gerente gerente;
    private Funcionario funcionario;

    public SuperMercado() {
        estoque = new Estoque();
        vendas = new HashMap<>();
        criarGerente();
        criarFuncionario();
    }

    private void criarGerente() {
        String usernameGerente = "Áquilas";
        String passwordGerente = "2002";
        gerente = new Gerente("Gerente", 30, 5000);
    }

    private void criarFuncionario() {
        String usernameFuncionario = "Henrique";
        String passwordFuncionario = "2003";
        funcionario = new Funcionario("Funcionário", 25, 2500);
    }

    public void realizarVenda(Produto produto, int quantidade, Funcionario funcionario) {
        if (estoque.getProdutos().contains(produto) && produto.getQuantidade() >= quantidade) {
            produto.setQuantidade(produto.getQuantidade() - quantidade);
            vendas.put(produto, vendas.getOrDefault(produto, 0) + quantidade);
            System.out.println("Venda realizada com sucesso!");
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Quantidade: " + quantidade);
        } else {
            System.out.println("Produto indisponível ou quantidade insuficiente.");
        }
    }
}
