package com.juja.spring.impls.robot.sony;

import com.juja.spring.interfaces.Leg;

public class SonyLeg implements Leg {
    public void step() {
        System.out.println("SonyLeg try step...");
    }

    public void run() {
        System.out.println("SonyLeg running...");
    }
}
