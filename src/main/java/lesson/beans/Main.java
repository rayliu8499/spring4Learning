package lesson.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ray.liu on 2016/4/22.
 */
public class Main {
    public static void main(String[] args) {

        //创建SpringIoC容器对象
        //ApplicationContext
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从IoC容器中获取Bean实例
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        //调用hello方法
//        helloWorld.hello();
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        car = (Car) ctx.getBean("car2");
        System.out.println(car);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
