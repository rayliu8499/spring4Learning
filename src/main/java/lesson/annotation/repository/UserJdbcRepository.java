package lesson.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by ray.liu on 2016/4/27.
 */
@Repository
public class UserJdbcRepository implements UserRepository {
    public void save() {
        System.out.println("UserJdbcRepository save...");
    }
}
