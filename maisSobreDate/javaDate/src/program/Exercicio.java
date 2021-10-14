package program;

import java.util.Date;

public class Exercicio {

    public static void main(String[] args) {
        

        /**
         * Aplique o que aprendemos:
         * 
         * - Descubra o -timeInMillis- do dia em vc nasceu; ok
         * 
         * - Converta em um objeto Date;
         * 
         * - Verifique se ele é -anterior- ou -posterior a '15 de maio
         * de 2010.'-
         */

         Date meuNiver = new Date(965444400000L);

         Date dataAntiga = new Date(1273892400000L);
         System.out.println(dataAntiga);

         boolean meuNiverEhAnterior = meuNiver.before(dataAntiga);

         boolean meuNiverEhPosterior = meuNiver.after(dataAntiga);

         System.out.println(meuNiverEhAnterior);
         System.out.println(meuNiverEhPosterior);



    }
    
}
