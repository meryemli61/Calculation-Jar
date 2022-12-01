import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);

        System.out.println("Numara 1 i giriniz : ");
        int No1 = klavye.nextInt();

        System.out.println("Numara 2 yi giriniz : ");
        int No2 = klavye.nextInt();

        System.out.println("Yapmak istediginiz islemi giriniz (+, -, *, /) : ");
        char islem = klavye.next().charAt(0);




        int sonuc;

        switch (islem){

            case '+':
                sonuc = No1 + No2;    break;

            case '-':
                sonuc = No1 - No2;     break;

            case '*':
                sonuc = No1 * No2;     break;

            case '/':
                sonuc = No1 / No2;     break;

            default:
                System.out.println("Islem Hatali !!!");
                return;

        }

        System.out.println(No1 + "" + islem + "" + No2 + "=" + sonuc);

    }




}

