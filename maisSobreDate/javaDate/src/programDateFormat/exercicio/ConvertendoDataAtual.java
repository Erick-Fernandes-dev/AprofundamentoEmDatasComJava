package programDateFormat.exercicio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertendoDataAtual {

    public static void main(String[] args) {
        
        Date dt = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mmm");

        String dataFormatada = sdf.format(dt);

        System.out.println(dataFormatada);


    }
    
}
