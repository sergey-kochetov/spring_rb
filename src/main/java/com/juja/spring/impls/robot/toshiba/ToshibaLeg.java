package com.juja.spring.impls.robot.toshiba;

import com.juja.spring.interfaces.Leg;
import org.springframework.stereotype.Component;

@Component
public class ToshibaLeg implements Leg {
    @Override
    public void step() {
        System.out.println("ToshibaLeg try step...");
    }

    @Override
    public void run() {
        System.out.println("ToshibaLeg running...");
    }
}
