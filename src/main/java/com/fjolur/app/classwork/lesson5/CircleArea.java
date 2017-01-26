package com.fjolur.app.classwork.lesson5;

import java.util.Scanner;

public class CircleArea {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the circle radius value: ");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle area is " + circleArea);
    }
}


