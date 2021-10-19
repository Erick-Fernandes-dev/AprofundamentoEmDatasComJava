package programMasiSobreJavaDate.exercicio;

import java.time.LocalDateTime;

public class ExercicioFinal {

    public static void main(String[] args) {
        
        //Adcione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00

        LocalDateTime agora = LocalDateTime.now();

        LocalDateTime futuro = agora.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(futuro);

    }
    
}
