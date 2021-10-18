package programDateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);

        System.out.println(dateToStr);
        //15/10/2021 14:07

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        //15 de outubro de 2021 14:39

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
        //15 de outubro de 2021 15:03:17 BRT

        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formater.format(agora);

        System.out.println(dataFormatada.substring(0, 2));
        System.out.println(dataFormatada.substring(3, 5));
        System.out.println(dataFormatada.substring(6));

        System.out.println(dataFormatada);



        
    }
    
}
