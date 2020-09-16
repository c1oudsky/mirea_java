package com.company;

public class Circle_MainTest {
    public static void main(String[] args)
    {
        Circle circ = new Circle();
        circ.SetX0(1); circ.SetY0(1);
        circ.SetRadius(2);
        System.out.println("x0="+circ.GetX0()+", y0="+circ.GetY0()+", radius="+circ.GetRadius());

    }
}
