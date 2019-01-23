package com.juja.spring.impls.pool;

import com.juja.spring.interfaces.Robot;
import com.juja.spring.interfaces.RobotPool;

import java.util.Map;

public class T1000Pool implements RobotPool {

    private Map<String, Robot> robotCollection;

    public T1000Pool(Map<String, Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public void setRobotCollection(Map<String, Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    @Override
    public Map<String, Robot> getRobotCollection() {
        return robotCollection;
    }

    public void action() {
        robotCollection.forEach((key, value) -> {
            System.out.println(key);
            value.action();
        });
    }
}
