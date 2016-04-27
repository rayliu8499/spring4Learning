package lesson.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ray.liu on 2016/4/27.
 * ��̬��������: ֱ�ӵΰ���ĳһ����ľ�̬�����Ϳ��Է���Bean��ʵ��
 */
public class StaticCarFactory {

    private static Map<String, Car> cars = new HashMap<String, Car>();

    static {
        cars.put("audi", new Car("audi", 300000));
        cars.put("ford", new Car("ford", 400000));
    }

    //��̬��������
    public static Car getCar(String name) {
        return cars.get(name);
    }
}
