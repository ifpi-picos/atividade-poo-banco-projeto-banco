import java.util.ArrayList;
import java.util.Scanner;

import BANCO.Cliente;
import BANCO.Conta;
import BANCO.Endereco;

public class App {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList <Conta> ContasBancarias;
    
    public static void main(String[] args) {
        
    
        ContasBancarias = new  ArrayList<Conta>();
        operacoes();
    }
    public static void operacoes()
    {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("----------------------seja bem vindos a nossa agencia-------------------");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("----------selecione a operçãO que voce deseja realizar------------------");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("----- opcão 1:  Criar conta-");
        System.out.println("----- opção 2:  Depositar---");
        System.out.println("----- opção 3:  Sacar------");
        System.out.println("----- opção 4:  Transferir--");
        System.out.println("----- opção 5:  vê contas----- ");
        System.out.println("----- opção 6:  Sair--------");
        
        int operacao = teclado.nextInt() ;
        switch (operacao) {
            case 1:
            criarconta();
            break;

                case 2:
                depositar();
                break;
                
                    case 3:
                    sacar();
                    break;
                    
                        case 4:
                        transferir();
                        break;

                    case 5:
                    vêcontas();
                    break;

                        case 6:
                        System.out.println("obrigada por escolher nossa agência!");
                        System.exit(0);
                        break;

                        default:
                        System.out.println("opção invalida!");
                        operacoes();
                        break;

                    
            }

            
    }
     public static void criarconta(){
        System.out.println("nome:");
        String  nome = teclado.next();

        System.out.println("cpf:");
        String cpf = teclado.next();

        System.out.println("data:");
        String  data = teclado.next();

        System.out.println("rua:");
        String  rua = teclado.next();

        System.out.println("numero:");
        int numero = teclado.nextInt();

        System.out.println("cidade:");
        String  cidade = teclado.next();
 
        System.out.println("uf:");
        String  uf = teclado.next();
        Endereco endereco = new Endereco(rua, numero, rua, cidade, uf);

        Cliente  cliente = new Cliente(nome ,cpf,data,endereco);

        Conta conta = new Conta(cliente);

        ContasBancarias.add(conta);
        System.out.println(" conta criada com sucesso!");

        operacoes();

     }
    
     private static Conta encontararconta(int numeroConta){
        Conta conta = null;
        if(ContasBancarias.size() >0){
            for(Conta c:ContasBancarias){
                if(c.getNumeroDaConta() == numeroConta){
                conta = c;
            }
        
        }
    }
        return conta;
        
     }
     public static void depositar(){
        System.out.println("numero da conta:");
        int numeroConta = teclado.nextInt();
        
        Conta conta = encontararconta(numeroConta);
        if(conta != null){
            System.out.println(" qual valor voce deseja depositar?");
            double valorDeposito = teclado.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println(" valor depositado com sucesso!");

        }
        else{
            System.out.println(" não foi possivel encontrar a conta!");
        }
        operacoes();
     }
     public static void sacar(){
        System.out.println(" qual valor voce deseja depositar?");
        int numeroConta = teclado.nextInt();
        Conta conta = encontararconta(numeroConta);

        if(conta != null){
            System.out.println(" qual valor voce deseja sacar?");
            Double valorSaque = teclado.nextDouble();
            conta.Sacar(valorSaque);
            System.out.println(" valor sacado  com sucesso!");

        }
        else{
            System.out.println(" não foi possivel encontrar a conta!");
        }
        operacoes();

     }
     public static void transferir(){
        System.out.println(" numero da conta do remetente:");
        int numeroContaRemente = teclado.nextInt();

        Conta contaRemetente = encontararconta(numeroContaRemente);
        if(contaRemetente != null){
            System.out.println(" numero da conta destinatario:");
            int numerocontaDestinatario = teclado.nextInt();

            Conta contaDestinatario = encontararconta(numerocontaDestinatario);
            if ( contaDestinatario != null){
                System.out.println("valor da transferencia");
                Double valor = teclado.nextDouble();
                contaRemetente.transfere(contaDestinatario,valor);

                
            }
      
      }

      operacoes();

     }

     public static void vêcontas(){
        if (ContasBancarias.size()>0){
        for(Conta conta:ContasBancarias){
            System.out.println(conta);
        } 
    }
        else{ 
            System.out.println("não a contas cadastradas");
        
        }
        operacoes();
     }







}



