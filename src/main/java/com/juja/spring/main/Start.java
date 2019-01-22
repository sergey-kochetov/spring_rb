package com.juja.spring.main;

import com.juja.spring.impls.robot.ModelT1000;
import com.juja.spring.interfaces.Robot;
import com.juja.spring.interfaces.RobotConveyor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.action();

        //CreateThreeRobot(context);
    }

    private static void CreateThreeRobot(ApplicationContext context) {
        RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");

        Robot t1 = t1000Conveyor.createRobot();
        Robot t2 = t1000Conveyor.createRobot();
        Robot t3 = t1000Conveyor.createRobot();

        System.out.println("t1 " + t1);
        System.out.println("t2 " + t2);
        System.out.println("t3 " + t3);
    }
}
