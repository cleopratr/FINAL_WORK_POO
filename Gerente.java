import java.util.Map;

public class Gerente extends Funcionario {
    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    public void adicionarProduto(Estoque estoque, Produto produto) {
        estoque.adicionarProduto(produto);
    }

    public void removerProduto(Estoque estoque, Produto produto) {
        estoque.removerProduto(produto);
    }

    public void gerarRelatorioVendas(Map<Produto, Integer> vendas) {
        double valorTotal = 0;
        System.out.println("Relatório de Vendas:");
        for (Map.Entry<Produto, Integer> entry : vendas.entrySet()) {
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            double valorVenda = produto.getValor() * quantidade;
            valorTotal += valorVenda;
            System.out.println("Produto: " + produto.getNome() + ", Quantidade: " + quantidade + ", Valor da Venda: R$" + valorVenda);
        }
        System.out.println("Valor Total de Vendas: R$" + valorTotal);
    }
}