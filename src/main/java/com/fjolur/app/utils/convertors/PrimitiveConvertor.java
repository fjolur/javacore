package com.fjolur.app.utils.convertors;

public class PrimitiveConvertor {
    int int1= 123;
    char char1 = 11;
    float float1 = 0.0f;

    public void floatToChar(float float1){
        char1 = (char) float1;
        System.out.println("Input int value is " + float1 + ". Output char value is " + char1);
    }
    public void intToChar(int int1){
        char1 = (char) int1;
        System.out.println("Input int value is " + int1 + ". Output char value is " + char1);
    }
    public void charToInt(char char1){
        int1 = (int) char1;
        System.out.println("Input int value is " + char1 + ". Output char value is " + int1);
    }

}
