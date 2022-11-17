package BANCO;

import BANCO.notificacoes.Email;
import BANCO.notificacoes.Sms;
import java.util.Scanner;

public class Corrente extends Conta  {
    static Scanner teclado = new Scanner(System.in);
    Sms sms = new Sms();
    Email email = new Email();
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
        if(this.contador <= 2){
        super.transfere(numero, valor);
        }
            else{
                if(this.getSaldo ()>= valor && valor >0){
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.println("----- opcão 1:  SMS-");
                    System.out.println("----- opção 2:  EMAIL---");
                    System.out.println("->");
                    int noti = teclado.nextInt();
                    Double taxa = valor * 3/10;
                    this.setSaldo(this.getSaldo() - (valor + taxa));
                    numero.setSaldo(valor + numero.getSaldo() );
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
        }
    }
    public String toString() {
        return "numero da conta: " + this.getNumeroDaConta()
        + "\nSALDO: " + this.getSaldo()
        + "\nTIPO: " + this.getTipo()
        + "\nCLIENTE: " + this.getCliente().getNome()
        + "\nCHEQUE: " + this.getChequeEspecial();
    
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public int getContador() {
        return contador;
    }

}