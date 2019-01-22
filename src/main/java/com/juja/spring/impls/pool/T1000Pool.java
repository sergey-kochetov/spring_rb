package com.juja.spring.impls.pool;

import com.juja.spring.interfaces.Robot;
import com.juja.spring.interfaces.RobotPool;

import java.util.Collection;

public class T1000Pool implements RobotPool {

    private Collection<Robot> robotCollection;

    public void setRobotCollection(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    @Override
    public Collection<Robot> getRobotCollection() {
        return null;
    }

    public void action() {
        for (Robot robot : robotCollection) {
            robot.action();
        }
    }
}
