package com.juja.spring.impls.robot.toshiba;

import com.juja.spring.interfaces.Body;
import org.springframework.stereotype.Component;

@Component
public class ToshibaBody implements Body {
    public ToshibaBody() {
        super();
    }

    @Override
    public void work() {
        System.out.println("ToshibaBody working...");
    }
}
