package com.juja.spring.impls.robot.toshiba;

import com.juja.spring.interfaces.Head;
import org.springframework.stereotype.Component;

@Component
public class ToshibaHead implements Head {
    @Override
    public void think() {
        System.out.println("ToshibaHead thinking...");
    }
}
