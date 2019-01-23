package com.juja.spring.impls.robot;

import com.juja.spring.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseModel implements Robot {

    @Autowired
    private Head head;

    @Autowired
    private Body body;

    @Autowired
    private Hand hand;

    @Autowired
    private Leg leg;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor()");
    }

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
