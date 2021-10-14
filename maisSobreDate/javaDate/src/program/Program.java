package program;

import java.time.Instant;
import java.util.Date;

public class Program {

    public static void main(String[] args) {
        
        /*
        final Date  novaDate = new Date();

        System.out.println(novaDate);
        

        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
        //1633899165618

        Date novaData = new Date(currentTimeMillis);
         
        System.out.println(novaData);
        //Sun Oct 10 17:52:45 BRT 2021

        

        Date dataNoPassado = new Date(1570794183000L);

        Date dataNoFuturo = new Date(1633899165618L);

        Date mesmaDataNoFuturo = new Date(1633899165618L);

        // Comparando se a dataNoPassado é posterior a dataNoFuturo
        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        // false

        // Comparando se a dataNoPassado é anterior a dataNoFuturo
        boolean isBefore = dataNoPassado.before(dataNoFuturo);
        // true

        System.out.println(isAfter);

        System.out.println(isBefore);

        // Comparando se as Datas são iguais
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        System.out.println(isEquals);//true

        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo);// passado -> futuro

        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado);// futuro -> passado

        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo);// futuro -> futuro

        System.out.println(compareCase1);// -1
        System.out.println(compareCase2);// 1
        System.out.println(compareCase3);// 0

        */

        Date dataInicio = new Date(1570794183000L);
        System.out.println(dataInicio);
        //Fri Oct 11 08:43:03 BRT 2019

        Instant instante = dataInicio.toInstant();
        System.out.println(instante);
        //2019-10-11T11:43:03Z

    }
    
}
