package com.juja.spring.impls.robot.toshiba;

import com.juja.spring.interfaces.Hand;
import org.springframework.stereotype.Component;

@Component
public class ToshibaHand implements Hand {
    @Override
    public void manipulate() {
        System.out.println("ToshibaHand manipulating...");
    }
}
