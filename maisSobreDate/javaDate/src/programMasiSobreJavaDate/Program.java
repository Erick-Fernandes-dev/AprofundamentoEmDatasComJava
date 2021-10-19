package programMasiSobreJavaDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Program {

    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        LocalTime agora = LocalTime.now();

        System.out.println(hoje);
        //2021-10-19

        System.out.println(ontem);
        //2021-10-18       

        System.out.println(agora);
        //16:08:44.671038

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        //17:10:52.918838

        LocalDateTime agora1 = LocalDateTime.now();

        System.out.println(agora1);
        //2021-10-19T16:24:30.739625

        LocalDateTime futuro = agora1.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        //2021-10-21T17:24:42.739625


    }
    
}
