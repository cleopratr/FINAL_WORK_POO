public class FinalizarCompra {
    private Carrinho carrinho;
    private FormaPagamento formaPagamento;

    public FinalizarCompra(Carrinho carrinho, FormaPagamento formaPagamento) {
        this.carrinho = carrinho;
        this.formaPagamento = formaPagamento;
    }

    public void exibirResumoCompra() {
        System.out.println("Resumo da Compra:");
        for (Produto produto : carrinho.getProdutos()) {
            System.out.println("Produto: " + produto.getNome() + ", Valor: R$" + produto.getValor());
        }
        System.out.println("Forma de Pagamento: " + formaPagamento.getNome());
    }
}