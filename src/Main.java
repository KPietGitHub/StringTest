import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ciag = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String str = ciag.nextLine();

        System.out.println(str);


        int iloscZnakow = str.length();

        System.out.println(iloscZnakow);

       if(iloscZnakow % 2 == 0){
           String pierwszyZnak = str.substring();
           String drugiZnak = str.substring();
       }




       // String drugiZnak  = str.substring();


        //String polaczoneZnaki = pierwszyZnak.concat(drugiZnak);

        //System.out.println(polaczoneZnaki);









    }
}