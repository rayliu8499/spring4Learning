package lesson.annotation.repository;

import lesson.annotation.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by ray.liu on 2016/4/27.
 */

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired(required = false)
    private TestObject testObject;

    public void save() {
        System.out.println("UserRepository Save...");
        System.out.println(testObject);
    }
}
