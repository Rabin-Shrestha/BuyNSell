package edu.mum.service;

import edu.mum.dao.UserRepository;
import edu.mum.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rabin Shrestha on 8/10/2017.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User add(User u) {
         return userRepository.save(u);
    }

    @Override
    public User update(User user, String id) {
        user.setId(id);
        return userRepository.save(user);
    }

    @Override
    public User delete(User user) {
         userRepository.delete(user);
         return user;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User get(String id) {
        return userRepository.findById(id);
    }


    public User getByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
