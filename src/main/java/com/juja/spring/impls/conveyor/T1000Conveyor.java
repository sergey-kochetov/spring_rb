package com.juja.spring.impls.conveyor;

import com.juja.spring.interfaces.Robot;
import com.juja.spring.interfaces.RobotConveyor;

public abstract class T1000Conveyor implements RobotConveyor {

    @Override
    public abstract Robot createRobot();
}
