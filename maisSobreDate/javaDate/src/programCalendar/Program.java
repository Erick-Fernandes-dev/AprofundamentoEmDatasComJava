package programCalendar;

import java.util.Calendar;

public class Program {

    public static void main(String[] args) {

        // capturando o instante atual com Calendar
        Calendar agora = Calendar.getInstance();

        System.out.println(agora);

        agora.add(Calendar.DATE, -15);// Vai remover 15 dias
        System.out.println("15 dias atrás: " + agora.getTime());
        // 15 dias atrás: Thu Sep 30 11:30:56 BRT 2021

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        // 4 meses depois: Sun Jan 30 11:30:56 BRT 2022

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime() + "\n");
        // 2 anos depois: Tue Jan 30 11:30:56 BRT 2024

        System.out.printf("%tc\n", agora);
        // ter jan 30 11:39:14 BRT 2024

        System.out.printf("%tF\n", agora);
        // 2024-01-30

        System.out.printf("%tD\n", agora);
        //01/30/24

        System.out.printf("%tr\n", agora);
        //11:54:08 AM

        System.out.printf("%tT%n", agora);
        //11:54:53

    }

}
