package BANCO;

import javax.swing.JOptionPane;

public class Conta {
    private static int ContasDeContas = 1;
    
    private int numeroDaConta;
    private int numeroDaAgencia;
    private double saldo;
    private Cliente cliente;
   
    public Conta(Cliente cliente) {
       this.cliente = cliente;
       this.numeroDaAgencia = 4321;
       this.saldo = 0.0;
       this.numeroDaConta = (int)  (10 + Math.random() * 89 );
   
   }
   
   public int getNumeroDaConta() {
       return numeroDaConta;
   }
   
   public int getNumeroDaAgencia() {
       return numeroDaAgencia;
   }
   
   public double getSaldo() {
       return saldo;
   }
   
   public Cliente getCliente() {
       return cliente;
   }
   
   public void setSaldo(double saldo) {
       this.saldo = saldo;
   }
    public void Sacar(double sacar){
       if(this.getSaldo()>0){
           this.setSaldo(this.getSaldo()-sacar);
           System.out.println("saque efetuado com sucesso");
       }
       else{
        System.out.println("impossivel realizar o saque");
       }
   
    } 
   
   public void depositar(double depositar){
       if(depositar > 0){
           this.setSaldo(this.getSaldo()+ depositar);
           System.out.println("deposito efetuado com sucesso");
        
       }
       else{
          System.out.println("impossivel realizar o deposito");
       }
   
   }
    public void transfere(Conta numero, double valor){
        if(this.getSaldo ()>= valor && valor >0){
            this.setSaldo(this.getSaldo() - valor);
            numero.saldo = numero.saldo + valor;
            System.out.println("tranferencia realizada com sucesso");
            
            
            
        }

    }

@Override
public String toString() {
    return "numero da conta " + this.getNumeroDaConta()
    + "\nSALDO " + this.getSaldo();
}

   }

