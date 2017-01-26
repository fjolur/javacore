package com.fjolur.app.classwork.lesson5;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter double value: ");
        double sideA = scanner.nextDouble();
        System.out.println("SideA equals to: " + sideA);
        System.out.println("Please enter double value: ");
        double sideB = scanner.nextDouble();
        System.out.println("SideB equals to: " + sideB);
        System.out.println("Please enter double value: ");
        double sideC = scanner.nextDouble();
        System.out.println("SideC equals to: " + sideC);


    if(Math.pow(sideA, 2)+Math.pow(sideB, 2) == Math.pow(sideC, 2))
    {
        System.out.println("Triangle is right-angled");
    }
        else {
            if(Math.pow(sideA, 2) == Math.pow(sideB, 2) + Math.pow(sideC, 2)){
                System.out.println("Triangle is right-angled");
            }
            else {
                if(Math.pow(sideB, 2) == Math.pow(sideA, 2)+Math.pow(sideC, 2)){
                    System.out.println("Triangle is right-angled");
                }
                else {
                    System.out.println("Triangle is NOT right-angled");

                }
            }
    }
    }
}
