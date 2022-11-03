package BANCO;

public class Poupanca extends Conta {
    private Double rendimento;
    public Poupanca( Cliente cliente) {
        super(cliente);
        this.rendimento = 0.10;
    }
    public Double getRendimento() {
        return rendimento;
    }
}
