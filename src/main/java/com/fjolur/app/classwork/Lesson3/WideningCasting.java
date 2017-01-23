package com.fjolur.app.classwork.Lesson3;


public class WideningCasting {
    byte byte1 = 127;
    short short1 = 0;
    int int1 = 0;
    long long1 = 0;
    float float1 = 0.0f;
    double double1 = 0.0d;
    public void widening(){
        double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println(double1);

/*
        byte aByte = 127;
    public static void main(String[] args){
        WideningCasting widening = new WideningCasting();
        WideningCasting.widening();
    }
    public void widening(){
        System.out.println(aByte);
        */
    }
}
