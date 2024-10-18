package desconto;

public class DescontoClienteVIP implements DescontoStrategy{
    private Double desconto ;

    public DescontoClienteVIP() {
        this.desconto = 20.0;
    }

    @Override
    public Double calcularDesconto(Double preco) {
        return preco-(preco*(this.desconto / 100));
    }
}
