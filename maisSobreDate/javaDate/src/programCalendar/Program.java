package programCalendar;

import java.util.Calendar;

public class Program {

    public static void main(String[] args) {

        //capturando o instante atual com Calendar
        Calendar agora = Calendar.getInstance();

        System.out.println(agora);

        agora.add(Calendar.DATE, -15);//Vai remover 15 dias
        //15 dias atrás 
        System.out.println("15 dias atrás: " + agora.getTime());

        agora.add(Calendar.MONTH, 4);
        
    }
    
}
