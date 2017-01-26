package com.fjolur.app.classwork.lesson5;

import java.util.Scanner;

public class WhichIsBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value 1 ");
        double value1 = scanner.nextDouble();
        System.out.println("Please enter the value 2 ");
        double value2 = scanner.nextDouble();
        if (value1 - value2 == 0){
            System.out.println("Value1 is equal to value2");
        }
        else{
            if (value1 - value2 > 0){
                System.out.println("Value1 is bigger than value2");
            }
            else System.out.println("Value2 is bigger than value1");
        }
    }
}
