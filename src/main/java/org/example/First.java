package org.example;

public class First {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //int i = 65;
        //long l = i; // bu şekilde atama yapabiliyorum çünkü long daha büyük olduğu için int atayabilirim
        //i = l; // bu şekilde hata verir -- long int'ten daha büyük

        //casting
        //i = (int) l; // cast ederek belirtmemiz gerekiyor, çünkü int lond'dan daha küçük bu yüzden int'i l'ye direkt atayabiliyoruz
        // ama l'yi int'e atamam (büyük bir kutuyu küçük bir kutuya koyamam gibi düşün..

        byte by = 12;
        int t1 = 130;
        by = (byte) t1;
        System.out.println("byte değeri:" + by); // burda taşma olur
        /*
        int x = 5;
        int y = x++; // x'in değerini bu satır bittikten sonra 1 arttır
        System.out.println("x = " + x); // x=6
        System.out.println("y = " + y); // y=5
        */


        int a = 10;
        int b = ++a; // a'nın değerini bu satırda 1 arttırır
        System.out.println("a = " + a); // a=11
        System.out.println("b = " + b); // b=11

        System.out.println("-----------------");

        int c = 3;
        int d = 5;

        System.out.println("c d'ye eşittir: " + (c == d));
        System.out.println(c != d);
        System.out.println(c > d);
        System.out.println(c >= d);
        System.out.println(c < d);
        System.out.println(c <= d);

        int x = 7;
        int y = 5;

        boolean sonuc1 = x == 7 && x == 5;
        boolean sonuc2 = x == 7 || x == 5;

        System.out.println("--------------------");

        // Karakter Bİrleştirme
        String ad = "Gizem";
        String soyad = "Yaman";
        int t = 3;
        int p = 2;

        System.out.println(ad + " " + soyad);
        System.out.println(t + p);
        System.out.println(ad + t + p); // + operatöründe ilk string görürse devamındakileri de string olarak görür ve Gizem32 çıktısını verir
        System.out.println(t + p + ad);

        System.out.println("toplam = " + t + p); // burada da ilk string göreceği için toplam=32 çıktısını verecektir

        System.out.println("--------------------");

        int not = 60;
        if (not <= 55) {
            System.out.println("Notunuz F");
        } else if (not > 55 && not <= 65) {
            System.out.println("Notunuz D");
        } else if (not > 65 && not <= 75) {
            System.out.println("Notunuz C");
        } else if (not > 75 && not <= 85) {
            System.out.println("Notunuz B");
        } else if (not > 85 && not <= 100) {
            System.out.println("Notunuz A");
        }

        System.out.println("--------------------");

        int sayi = 3;
        switch (sayi) {
            case 1:
                System.out.println("sayi=1'dir");
                break;
            case 2:
                System.out.println("sayi=2'dir");
                break;
            case 3:
                System.out.println("sayi=3'tür");
                break;
        }

        System.out.println("--------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("Gizem Kübra Yaman");
        }

        System.out.println("--------------------");

        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }

        int input = 100;
        do {
            System.out.println(input);
            input--;
        } while (input > 0);

        int input2 = 100;
        while (input2 >= 0) {
            System.out.println(input2);
            input2 -= 5;
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 10 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int deger2 = 21;
        boolean deger3 = false;
        deger3 = deger2 < 30 ? true : false; //ternary operatör

        test:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break test;
                }
                System.out.println("i = " + i + " j = " + j);
            }
        }


        for (int i = 1; i < 100; i++) {

            if (i % 4 == 0) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 1; i < 100; i++) {

            if (i % 2 == 0) {
                break;
            }
            System.out.println(i);
        }

    }
}
