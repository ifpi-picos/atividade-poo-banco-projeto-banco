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
           JOptionPane.showMessageDialog(null, "saque efetuado com sucesso");
       }
       else{
           JOptionPane.showMessageDialog(null, "impossivel realizar o saque");
       }
   
    } 
   
   public void depositar(double depositar){
       if(depositar > 0){
           this.setSaldo(this.getSaldo()+ depositar);
           JOptionPane.showMessageDialog(null, "deposito efetuado com sucesso");
       }
       else{
           JOptionPane.showMessageDialog(null, "impossivel realizar o deposito");
       }
   
   }

@Override
public String toString() {
    return "numero da conta " + this.getNumeroDaConta()
    + "\nSALDO " + this.getSaldo();
}

   }

