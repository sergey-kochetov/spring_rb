package com.juja.spring.impls.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {

    private String color;
    private int year;
    private boolean soundEnable;

    public ModelT1000() {
    }

    public ModelT1000(String color, int year, boolean soundEnable) {
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model1() {
        return new ModelT1000();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model2() {
        return new ModelT1000("black", 2019, true);
    }

    @Override
    public void action() {
        getHead().think();
        getBody().work();
        getLeg().step();
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("soundEnable: " + soundEnable);
    }

    @Override
    public void fire() {
        getHead().think();
        getHand().manipulate();
        getLeg().run();
    }

    @Override
    public void dance() {
        System.out.println("T1000 dancing...");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnable() {
        return soundEnable;
    }

    public void setSoundEnable(boolean soundEnable) {
        this.soundEnable = soundEnable;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this + " method destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this + " method init");
    }
}
