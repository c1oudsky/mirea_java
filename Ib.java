package com.company;

public class Ib {
    private float a=1; private int b=0;
    public void main() {
        for (int i=1; i<11; i++) {
            System.out.println(a/i);
            b+=a/i;
        }
        System.out.print(b);
    }
}
