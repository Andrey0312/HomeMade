package ru.geekbrains.catch_the_drop;

import javax.swing.*;

public class Main {

    byte b = 1;
    short s = 2;
    int i = 3;
    long l = 4;
    float f = .1f;
    double d = .12;
    char c = 123;
    boolean bo = true;
    String str = "home";

    public static void main(String[] args) {
        t3();
        t4();
        t5();
        t6();
        t7();
    }

    public static void t3() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println(a * (b + (c / d)));
    }

    public static void t4() {
        int x = 5;
        int y = 7;
        if (x + y >= 10 && x + y <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void t5() {
        int c = -33;
        if (c >= 0) {
            System.out.println("Положителльное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static void t6() {
        int r = 100;
        if (r > 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public static void t7() {
        String d = "Andrey";
        System.out.println("Привет" + " " + d + "!");
    }

}

