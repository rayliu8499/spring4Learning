package lesson.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ray.liu on 2016/4/27.
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-beanfactory.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
    }
}
