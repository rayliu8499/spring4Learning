package lesson.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ray.liu on 2016/4/22.
 */
public class Main {
    public static void main(String[] args) {

        //����SpringIoC��������
        //ApplicationContext
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //��IoC�����л�ȡBeanʵ��
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        //����hello����
//        helloWorld.hello();
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        car = (Car) ctx.getBean("car2");
        System.out.println(car);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
