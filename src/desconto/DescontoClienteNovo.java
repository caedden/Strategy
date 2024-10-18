package desconto;

public class DescontoClienteNovo implements DescontoStrategy {
    private Double  desconto ;

    public DescontoClienteNovo() {
        desconto = 0.0;
    }

    @Override
    public Double calcularDesconto(Double preco) {
        return preco;
    }
}
