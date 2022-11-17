package BANCO;

import java.util.Scanner;

import BANCO.notificacoes.Emaill;
import BANCO.notificacoes.Sms;


public class Conta {
    static Scanner teclado = new Scanner(System.in);
    Sms sms = new Sms();
    Emaill email = new Emaill();


    private static int ContasDeContas = 1;
    
    private int numeroDaConta;
    private int numeroDaAgencia;
    private double saldo;
    private Cliente cliente;
    private String tipo;
   

    public Conta(Cliente cliente,String tipo) {
       this.cliente = cliente;
       this.numeroDaAgencia = 4321;
       this.saldo = 0.0;
       this.numeroDaConta = (int)  (10 + Math.random() * 89 );
       this.tipo = tipo;
   
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

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("----- opcão 1:  SMS-");
        System.out.println("----- opção 2:  EMAIL---");
    
        System.out.println("->");
        int noti = teclado.nextInt();
       if(this.getSaldo()>0){
           this.setSaldo(this.getSaldo()-sacar);
           System.out.println("saque efetuado com sucesso");
           if (noti == 1){
            sms.enviarNoticacao("saque",sacar);
        }
        if(noti == 2){
            email.enviarNoticacao("saque", sacar);
        }
        else{
            System.out.println("você optou por nao esolher notificacao");
        }
        }

       else{
        System.out.println("impossivel realizar o saque");
       }
   
    } 
    public static int getContasDeContas() {
        return ContasDeContas;
    }

    public String getTipo() {
        return tipo;
    }
   
   public void depositar(double depositar){
    System.out.println("-----------------------------------------------------------------------");
        System.out.println("----- opcão 1:  SMS-");
        System.out.println("----- opção 2:  EMAIL---");
    
        System.out.println("->");
        int noti = teclado.nextInt();
       if(depositar > 0){
           this.setSaldo(this.getSaldo()+ depositar);
           System.out.println("deposito efetuado com sucesso");
        if (noti == 1){
            sms.enviarNoticacao("deposito",depositar);
        }
        if(noti == 2){
            email.enviarNoticacao("deposito", depositar);
        }
        else{
            System.out.println("você optou por nao esolher notificacao");
        }
        }
       
       else{
          System.out.println("impossivel realizar o deposito");
       }
   
   }
    public void transfere(Conta numero, double valor){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("----- opcão 1:  SMS-");
        System.out.println("----- opção 2:  EMAIL---");
    
        System.out.println("->");
        int noti = teclado.nextInt();
        if(this.getSaldo ()>= valor && valor >0){
            this.setSaldo(this.getSaldo() - valor);
            numero.saldo = numero.saldo + valor;
            System.out.println("tranferencia realizada com sucesso"); 
            if (noti == 1){
                sms.enviarNoticacao("transferência",valor);
            }
            if(noti == 2){
                email.enviarNoticacao("transferência",valor);
            }
            else{
                System.out.println("você optou por nao esolher notificacao");
            } 
        }
        
            else{
                    System.out.println("impossivel realizar a transferência");
            }
        }

    

@Override
public String toString() {
    return "numero da conta: " + this.getNumeroDaConta()
    + "\nSALDO " + this.getSaldo()
    + "\nTIPO: " + this.getTipo()
    + "\nCLIENTE " + this.getCliente();


}

   }