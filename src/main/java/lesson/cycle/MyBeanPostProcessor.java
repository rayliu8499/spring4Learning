package lesson.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by ray on 2016/4/26.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessorBeforeInitialization: " + bean + ", " + beanName);
        if ("car".equals(beanName)){
            //......
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessorAfterInitialization: " + bean + ", " + beanName);
        Car car = new Car();
        car.setBrand("Ford");
        return car;
    }
}
