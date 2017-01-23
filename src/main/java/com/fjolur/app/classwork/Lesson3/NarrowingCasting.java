package com.fjolur.app.classwork.Lesson3;

public class NarrowingCasting {
    /*
    int int1 = 127;
    float float1 = 0.0f;

    public void narrowing(){
        float1 = int1;
        System.out.println(float1);
    }
    */

    /*
    int int1 = 0;
    float float1 = 3.14159f;

    public void narrowing(){
    int1 = float1;
    System.out.println(int1);
    }
     */

    /*
    int int1 = 0;
    float float1 = 3.14159f;

    public void narrowing(){
    int1 = (int) float1;
    System.out.println(int1);
    }
     */

    double double1 = 3.14159d;
    float float1 = 0.0f;

    public void narrowing() {
        float1 = (float) double1;
        System.out.println(float1);
    }
}

