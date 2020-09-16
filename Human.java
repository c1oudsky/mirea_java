package com.company;

public class Human {
    private int smartness;
    private Hand Lhand = new Hand();
    private Hand Rhand = new Hand();
    private Head head = new Head();
    private Leg Lleg = new Leg();
    private Leg Rleg = new Leg();
    public Hand GetLHand() {
        return Lhand;
    }
    public Hand GetRHand() {
        return Rhand;
    }
    public void SetLHand(Hand hand) {
        this.Lhand = hand;
    }
    public void SetRHand(Hand hand) {
        this.Rhand = hand;
    }
    public Head GetHead() {
        return head;
    }
    public void SetHead(Head head) {
        this.head = head;
    }
    public Leg GetLLeg() {
        return Lleg;
    }
    public Leg GetRLeg() {
        return Rleg;
    }
    public void SetLLeg(Leg leg) {
        this.Lleg = leg;
    }
    public void SetRLeg(Leg leg) {
        this.Rleg = leg;
    }
    public int GetSmartness() {
        return smartness;
    }
    public void SetSmartness(int a) {
        this.smartness = a;
    }
    public String ToStr() {
        return "Human{" +"left hand=" + Lhand +", right hand2=" + Rhand +", head=" + head +", left leg=" +
                Lleg + ", right leg=" + Rleg +", inteligence=" + smartness +'}';
    }
}
