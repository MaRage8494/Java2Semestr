package ru.marat.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new
                AnnotationConfigApplicationContext(BeanConfig.class);
        Marat marat = context.getBean("marat",Marat.class);
        marat.getLighter1().doLight();
        marat.getLighter2().doLight();
        marat.getLighter3().doLight();
    }
}
