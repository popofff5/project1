package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = 5;
        int d = 2;
        float year = 400;
        String s = "переданное_имя";
        n1(a, b, c, d);
        n2(a, b);
        n3(a);
        n4(s);
        n5(year);
    }
    public static void n1(int a, int b, int c, int d){
        float e = 1.0f * a * (b + (c / d));
        System.out.println("1. " + e);
    }

    public static void n2(int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <= 20)
            System.out.println("2. true");
        else System.out.println("2. false");
    }

    public static void n3(int a){
        if (a < 0)
            System.out.println("3. Отрицательное");
        else System.out.println("3. Положительное");
    }

    public static void n4(String s){
        System.out.println("4. Привет, " + s + "_!");
    }

    public static void n5(float year){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            System.out.println("5. Високосный");
        else System.out.println("5. Не високосный");
    }

}
