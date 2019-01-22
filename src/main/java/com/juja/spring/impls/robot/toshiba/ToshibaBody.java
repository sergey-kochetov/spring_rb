package com.juja.spring.impls.robot.toshiba;

import com.juja.spring.interfaces.Body;

public class ToshibaBody implements Body {
    @Override
    public void work() {
        System.out.println("ToshibaBody working...");
    }
}
