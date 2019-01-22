package com.juja.spring.impls.robot.sony;

import com.juja.spring.interfaces.Hand;

public class SonyHand implements Hand {
    public void manipulate() {
        System.out.println("SonyHand manipulating...");
    }
}
