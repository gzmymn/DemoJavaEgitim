package org.example;

public class Second {
    public static void main(String[] args){
        topla(1,2);
        topla(1,2,3);//burda hata almamızın sebebi static bir class içerisinde static olmayan bir metod çağıramıyor olmamızdır
        //static class içerisinde static metodları çalıştırabilirim
        carp(1,2);
        carp(1,2,3,4,5);
        carp(1,2,3,4,5,6,7);

    }

    static int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }

    int topla(int sayi1, long sayi2){
        return sayi1 + (int)sayi2;
    }

    // method overloading
    static int topla(int sayi1, int sayi2, int sayi3){
        return sayi1 + sayi2 + sayi3;
    }


    static int carp(int... deger){ // varargs--parametreye girilen tüm değerlerle işlem yapar
        int result = 1;
        for (int i : deger){
            result *= i;
        }
        return result;
    }

    static void studentInfo(Student s){
        System.out.println(s.name);
    }


}
