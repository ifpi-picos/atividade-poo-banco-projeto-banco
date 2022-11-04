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
    @Override
    public void depositar(double depositar) {
        // TODO Auto-generated method stub
        super.depositar(depositar);
        this.setSaldo(this.getSaldo() * this.getRendimento());
    }
}
