package com.company;

public class Dog {
    private String type;
    private float age;
    private String color;
    public void SetColor(String a) {
        this.color=a;
    }
    public void SetAge(float a) {
        this.age=a;
    }
    public void SetType(String a) {
        this.type=a;
    }
    public String GetType() {
        return type;
    }
    public String GetColor() {
        return color;
    }
    public float SetAge() {
        return age;
    }
    public float HumanAge(float DogAge) {
        return DogAge * 7;
    }
    Dog(String a,float b,String c) {
        this.type=a; this.age=b; this.color=c;
    }
    public String ToStr() {
        return ("Type: "+type+", color: "+color+", age: "+age);
    }
}
