package lesson.annotation.service;

import lesson.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by ray.liu on 2016/4/27.
 */

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(@Qualifier("userRepositoryImpl") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add() {
        System.out.println("UserService add...");
        userRepository.save();
    }
}
