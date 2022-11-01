package org.example;

public class Calculator {

    public static void main(String[] args) {


        System.out.println(topla(34, 67, 7));
        System.out.println(cikar(156, 34, 89));
        System.out.println( carp(3, 5, 7));
        System.out.println(bol(48, 8));


    }

    static int topla(int... deger) { // varargs--parametreye girilen tüm değerlerle işlem yapar
        int result = 1;
        for (int i : deger) {
            result += i;
        }
        return result;
    }

    static int cikar(int... deger) {
        int result = 1;
        for (int i : deger) {
            result -= i;
        }
        return result;
    }

    static int carp(int... deger) {
        int result = 1;
        for (int i : deger) {
            result *= i;
        }
        return result;
    }

    static int bol(int... deger) { // varargs--parametreye girilen tüm değerlerle işlem yapar
        return  deger[0] / deger[1];
    }

    //karealma

    //yazdırma


}
