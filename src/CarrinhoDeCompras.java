import desconto.DescontoStrategy;

import java.util.ArrayList;

public class CarrinhoDeCompras   {

    private ArrayList<Produto> lista
            = new ArrayList<>();

    public void addProduto(Produto produto){
        this.lista.add(produto);
    }

    public Double retornaTotalCarrinho() {
        Double totalProdutos = 0.0;

        for(Produto produto : this.lista){
            totalProdutos += produto.getPreco();
        }

        return totalProdutos;
    }
    public  double setDescontoStrategy(DescontoStrategy descontoStrategy){
        return descontoStrategy.calcularDesconto(retornaTotalCarrinho());
    }
}
