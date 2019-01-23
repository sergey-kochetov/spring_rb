package com.juja.spring.impls.robot;

import com.juja.spring.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class BaseModel implements Robot {

    @Autowired
    @Qualifier("sonyHead")
    private Head head;

    @Autowired
    @Qualifier("sonyBody")
    private Body body;

    @Autowired
    @Qualifier("sonyHand")
    private Hand hand;

    @Autowired
    @Qualifier("sonyLeg")
    private Leg leg;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor()");
    }

//    public BaseModel(Head head, Body body, Hand hand, Leg leg) {
//        this();
//        this.head = head;
//        this.body = body;
//        this.hand = hand;
//        this.leg = leg;
//    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
