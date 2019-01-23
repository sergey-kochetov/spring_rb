package com.juja.spring.main;

import com.juja.spring.impls.pool.T1000Pool;
import com.juja.spring.impls.robot.ModelT1000;
import com.juja.spring.interfaces.Robot;
import com.juja.spring.interfaces.RobotConveyor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        createOneRobot(context);
        //CreateThreeRobot(context);
        //createPoolRobots(context);
        //searcPoolGoldenRobots(context);
    }
    private static void searcPoolGoldenRobots(ApplicationContext context) {
        T1000Pool pool = (T1000Pool) context.getBean("t1000GoldenPool");
        pool.action();
    }

    private static void createPoolRobots(ApplicationContext context) {
        T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000Pool");
        t1000Pool.action();
    }

    private static void createOneRobot(ApplicationContext context) {
        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.action();
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
