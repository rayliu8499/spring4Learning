package lesson.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ray.liu on 2016/4/27.
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-generic-di.xml");

        UserService userService = (UserService) ctx.getBean("userService");

        userService.add();
    }


}
