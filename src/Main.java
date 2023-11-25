import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ciag = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String str = ciag.nextLine();



        int ilosc = str.length() / 2 ;


       if(str.length() >= 3) {

           String wycieteZnaki = str.substring(ilosc, ilosc + 2);
           String pierwszaCzesc = str.substring(0, ilosc);
           String drugaCzesc = str.substring(ilosc + 2, str.length());

           String wynik = wycieteZnaki.concat(pierwszaCzesc).concat(drugaCzesc);

           System.out.println(wynik);
       }

       else {
           System.out.println("Zbyt krótki ciąg znaków");
       }




//           String polaczoneZnaki = str.substring(rozpocznij, stop);
//
//           String wycieteZnaki = str.substring(0, rozpocznij).concat(str.substring(stop));
//           System.out.println(polaczoneZnaki);
//           System.out.println(wycieteZnaki);



//           System.out.println(wycieteZnaki);
//           String wynik = polaczoneZnaki.concat(str);








       // String drugiZnak  = str.substring();


        //String polaczoneZnaki = pierwszyZnak.concat(drugiZnak);

        //System.out.println(polaczoneZnaki);









    }
}