package lesson.relation;

import lesson.autowire.Address;
import lesson.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ray.liu on 2016/4/25.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
        Address address = (Address) ctx.getBean("address2");
        System.out.println(address);
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
