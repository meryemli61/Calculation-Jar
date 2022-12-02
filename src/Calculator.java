import calMethods.CalculationMethods;

import java.util.Scanner;

public class Calculator {
    static Scanner klavye = new Scanner(System.in);

    static int No1,No2,sonuc;

    public static void KulanicidanIkiSayiAlma(){
        System.out.println("Numara 1 i giriniz : ");
        No1 = klavye.nextInt();

        System.out.println("Numara 2 yi giriniz : ");
        No2 = klavye.nextInt();
    }

    public static void main(String[] args) {




        System.out.println("Yapmak istediginiz islemi giriniz (+, -, *, /) : ");
        char islem = klavye.next().charAt(0);






        switch (islem){


            case '+':
             KulanicidanIkiSayiAlma();

                CalculationMethods.add(No1,No2);
                break;

            case '-':
                KulanicidanIkiSayiAlma();

                CalculationMethods.subtract(No1,No2);
                break;

            case '*':
                KulanicidanIkiSayiAlma();

                CalculationMethods.multiply(No1,No2);
                     break;

            case '/':
                KulanicidanIkiSayiAlma();

                CalculationMethods.divide(No1,No2);    break;

            default:
                System.out.println("Islem Hatali !!!");
                return;

        }



    }




}

