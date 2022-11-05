package BANCO.notificacoes;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.event.CaretListener;

public class Email
 implements Notificacao { 
    Calendar calendario = Calendar.getInstance();
     Date data = calendario.getTime();
     DateFormat fd = DateFormat.getDateInstance(DateFormat.FULL);
     
     
     

    
    
    @Override
    public void enviarNoticacao(String operacao, double valor) {
        System.out.println("enviando um email\n"+ operacao +  " no valor de"+ valor + "\n data" + fd.format(data));

        
    }




    private DateFormat DateFormat() {
        return null;
    }
     
   
        
    }
    

