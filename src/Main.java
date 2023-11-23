import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ciag = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String str = ciag.nextLine();



        int iloscZnakow = str.length();

        System.out.println(iloscZnakow);

       if(iloscZnakow > 2){
           int rozpocznij = iloscZnakow / 2;
           int stop = rozpocznij + 1;

           String polaczoneZnaki = str.substring(rozpocznij, stop);

           String wynik = polaczoneZnaki.concat(str);

           System.out.println(wynik);
       }
       else{
           System.out.println("Zbyt krótki ciąg znaków");
       }








       // String drugiZnak  = str.substring();


        //String polaczoneZnaki = pierwszyZnak.concat(drugiZnak);

        //System.out.println(polaczoneZnaki);









    }
}