package com.fjolur.app.classwork.lesson5;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value you want to check");
        double value = scanner.nextDouble();
        if(((int)(value / 2))*2 >= value){
        //if ((value % 2) == 0){
            System.out.println("Value is even");
        }
        else System.out.print("Value is odd");
    }
}
