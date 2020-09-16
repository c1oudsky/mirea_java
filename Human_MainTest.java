package com.company;

public class Human_MainTest {
    public static void main(String[] args)
    {
        Human hum = new Human();
        hum.SetSmartness(5);
        hum.GetHead().SetA(4);
        System.out.println(hum.ToStr());
    }
}
