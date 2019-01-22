package com.juja.spring.impls.robot;

import com.juja.spring.interfaces.*;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ModelT1000 implements Robot, InitializingBean, DisposableBean {
    private Head head;
    private Body body;
    private Hand hand;
    private Leg leg;

    private String color;
    private int year;
    private boolean soundEnable;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Body body, Hand hand, Leg leg) {
        this.head = head;
        this.body = body;
        this.hand = hand;
        this.leg = leg;
    }
    public ModelT1000(Head head, Body body, Hand hand, Leg leg, String color, int year, boolean soundEnable) {
        this.head = head;
        this.body = body;
        this.hand = hand;
        this.leg = leg;
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }


    @Override
    public void action() {
        head.think();
        body.work();
        leg.step();
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("soundEnable: " + soundEnable);
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

    public void initObject() {
        System.out.println("init...");
    }

    public void destroyObject() {
        System.out.println("destroy...");
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnable() {
        return soundEnable;
    }

    public void setSoundEnable(boolean soundEnable) {
        this.soundEnable = soundEnable;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this + " method destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this + " method init");
    }
}
