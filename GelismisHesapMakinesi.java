package com.company;

import java.util.Scanner;

public class Main {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("çıkarma : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma" + result);
        return result;

    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci Sayı sıfırdan farklı olmalı : ");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }
    static void calc(int a, int b){
        System.out.println("Dikdörtgenin çevresi : " + 2*(a+b));
        System.out.println("Dikdörtgenin Alanı : " + a*b);


    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int select;

        String menü = "1-Toplama İşlemi\n "
                +"2-Çıkarma İşlemi\n "
                +"3-Çarpma İşlemi\n "
                +"4-Bölme İşlemi\n "
                +"5-Üslü Sayı Hesaplama\n "
                +"6-Mod Alma\n"
                +"7-Dikdörtgen Alan ve Çevre Hesabı\n"
                +"0-Çıkış Yap\n";


        while (true) {
            System.out.print("menü" + menü);
            System.out.println("Bir işlem seçiniz :  ");
            select = scanner.nextInt();

            if (select == 0) {
                break;
            }
            System.out.println("ilk sayı");
            int a = scanner.nextInt();
            System.out.println("İkinci sayı: ");
            int b = scanner.nextInt();


            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                case 5:
                    power(a, b);
                case 6:
                    mod(a,b);
                 case 7:
                     calc(a,b);
                     break;
                default:
                    System.out.println("Geçersiz Bir işlem girdiniz.");



            }
            System.out.println("Güle Güle");

        }
    }
}

