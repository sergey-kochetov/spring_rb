package com.juja.spring.impls.robot;

import com.juja.spring.interfaces.Body;
import com.juja.spring.interfaces.Hand;
import com.juja.spring.interfaces.Head;
import com.juja.spring.interfaces.Leg;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {

    private String color;
    private int year;
    private boolean soundEnable;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Body body, Hand hand, Leg leg, String color, int year, boolean soundEnable) {
        super(head, body, hand, leg);
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public ModelT1000(String color, int year, boolean soundEnable) {
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    @Override
    public void action() {
        getHead().think();
        getBody().work();
        getLeg().step();
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("soundEnable: " + soundEnable);
    }

    @Override
    public void fire() {
        getHead().think();
        getHand().manipulate();
        getLeg().run();
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
