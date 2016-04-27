package lesson.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ray.liu on 2016/4/27.
 * ʵ����������: ʵ�������ķ���,������Ҫ������������,�ٵ��ù�����ʵ������������ bean ��ʵ��
 */
public class InstanceCarFactory {
    private Map<String,Car> cars = null;

    public InstanceCarFactory(){
        cars=new HashMap<String, Car>();
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",400000));
    }

    public Car getCar(String brand){
        return cars.get(brand);
    }
}
