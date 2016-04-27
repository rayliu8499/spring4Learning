package lesson.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ray on 2016/4/26.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans-cycle.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        //¹Ø±ÕiocÈÝÆ÷
        ctx.close();
    }
}
