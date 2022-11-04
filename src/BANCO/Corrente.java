package BANCO;

public class Corrente extends Conta  {
    private Double chequeEspecial;


    public Corrente(Cliente cliente) {
        super(cliente);
        this.chequeEspecial = (double) 1000;

        //TODO Auto-generated constructor stub
    }


    public Double getChequeEspecial() {
        return chequeEspecial;
    }
    
}
