package BANCO;

public class Poupanca extends Conta {
    private Double rendimento;

    public Poupanca(Cliente cliente, String tipo) {
        super(cliente, tipo);
        this.rendimento = 0.10;
    }

    public Double getRendimento() {
        return rendimento;

    }

    @Override
    public void depositar(double depositar) {

        super.depositar(depositar);
        this.setSaldo(this.getSaldo() * this.getRendimento());

    }

    @Override
    public void transfere(Conta numero, double valor) {
        super.transfere(numero, valor);
        Double taxa = valor * 5 / 10;
        this.setSaldo(this.getSaldo() - (valor + taxa));
        numero.setSaldo(valor + this.getSaldo());


    }

    public String toString() {
        return "numero da conta: " + this.getNumeroDaConta()
                + "\nSALDO: " + this.getSaldo()
                + "\nTIPO: " + this.getTipo()
                + "\nCLIENTE: " + this.getCliente().getNome();

    }
}