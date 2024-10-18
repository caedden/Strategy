package desconto;

public class DescontoClienteRegular implements DescontoStrategy {

    private Double desconto = 10.0;

    public DescontoClienteRegular() {
        this.desconto = 10.0;
    }

    @Override
    public Double calcularDesconto(Double preco) {
        return preco-(preco*(desconto/100));
    }
}
