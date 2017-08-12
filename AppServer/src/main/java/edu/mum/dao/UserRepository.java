package edu.mum.dao;

import edu.mum.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Rabin Shrestha on 8/10/2017.
 */
public interface UserRepository extends MongoRepository<User, Integer>{
    User findByFirstName(String firstName);
    User findByEmail(String email);
    User findById(String id);

}
