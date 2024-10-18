import desconto.DescontoClienteNovo;
import desconto.DescontoClienteRegular;
import desconto.DescontoClienteVIP;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta",50.0);
        Produto produto2 = new Produto("Calca",50.0);
        Produto produto3 = new Produto("Tenis",50.0);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.addProduto(produto1);
        carrinho.addProduto(produto2);
        carrinho.addProduto(produto3);

        //ClienteNormal
        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para o cliente novo foi R$ "+ carrinho.retornaTotalCarrinho());

        ;
        System.out.println("Total para o cliente Regular foi R$ "+ carrinho.setDescontoStrategy(new DescontoClienteRegular()));


        System.out.println("Total para o cliente VIP foi R$ "+ carrinho.setDescontoStrategy(new DescontoClienteVIP()));
    }
}