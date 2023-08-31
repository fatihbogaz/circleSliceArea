package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        int r;
        int angle;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("Daire diliminin yarı çapını giriniz :");
        r = input.nextInt();
        System.out.print("Daire diliminin merkez açısının ölçüsünü giriniz : ");
        angle = input.nextInt();
        area = (pi * (r * r) * angle) / 360;
        System.out.println("Daire diliminin alanı : " + area);
    }
}