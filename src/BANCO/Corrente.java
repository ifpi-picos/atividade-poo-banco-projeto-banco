package BANCO;

public class Corrente extends Conta  {
    private Double chequeEspecial;
    private int contador;


    public Corrente(Cliente cliente,String tipo) {
        super(cliente,tipo);
        this.chequeEspecial = (double) 1000;
        this.contador = 0;
    }


    @Override
    public void Sacar(double sacar) {
        double che = sacar - this.getSaldo();
        if(sacar > this.getSaldo())
        this.setSaldo(this.getSaldo() - sacar);
        this.setSaldo(this.getChequeEspecial() - che);
        System.out.println("saque realizado com sucesso");
    }


    @Override
    public void depositar(double depositar) {
    
        super.depositar(depositar);
    }

    @Override
    public void transfere(Conta numero, double valor) {

        this.contador += 1;
        if(this.contador < 2){
        super.transfere(numero, valor);
        }
            else{
                if(this.getSaldo ()>= valor && valor >0){
                    Double taxa = valor * 3/10;
                    this.setSaldo(this.getSaldo() - valor);
                    numero.setSaldo(valor + (numero.getSaldo() - taxa));
                    System.out.println("tranferencia realizada com sucesso");
                    
            
                }
        }
    }
    public String toString() {
        return "numero da conta: " + this.getNumeroDaConta()
        + "\nSALDO: " + this.getSaldo()
        + "\nTIPO: " + this.getTipo()
        + "\nCLIENTE: " + this.getCliente()
        + "\nCHEQUE: " + this.getChequeEspecial();
    
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public int getContador() {
        return contador;
    }
    
}
