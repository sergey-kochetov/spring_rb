package com.juja.spring.impls.robot;

import com.juja.spring.interfaces.*;

public class ModelT1000 implements Robot {
    private Head head;
    private Body body;
    private Hand hand;
    private Leg leg;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Body body, Hand hand, Leg leg) {
        this.head = head;
        this.body = body;
        this.hand = hand;
        this.leg = leg;
    }


    @Override
    public void action() {
        head.think();
        body.work();
        leg.step();
    }

    @Override
    public void fire() {
        head.think();
        hand.manipulate();
        leg.run();
    }

    @Override
    public void dance() {
        System.out.println("T1000 dancing...");
    }
}
