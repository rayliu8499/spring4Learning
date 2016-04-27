package lesson.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by ray.liu on 2016/4/27.
 */
//�Զ��Ե�FactoryBean ��Ҫʵ�� FactoryBean �ӿ�
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
