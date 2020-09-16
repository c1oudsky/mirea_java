package com.company;

public class Ball {
    private String type;
    private String color;
    private float radius;
    public void SetType(String a) {
        this.type=a;
    }
    public void SetColor(String a) {
        this.color=a;
    }
    public void SetRadius(float a) {
        this.radius=a;
    }
    public String GetType() {
        return type;
    }
    public String GetColor() {
        return color;
    }
    public float SetRadius() {
        return radius;
    }
    public String ToStr() {
        return ("Type: "+type+", color: "+color+", radius: "+radius);
    }
}
