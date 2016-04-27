package lesson.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by ray.liu on 2016/4/27.
 */
//自动以的FactoryBean 需要实现 FactoryBean 接口
public class CarFactoryBean implements FactoryBean<Car> {

    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car getObject() throws Exception {
        return new Car("BMW", 500000);
    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
