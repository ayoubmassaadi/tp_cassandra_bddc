package ma.enset.tp_cassandra_bddc.services;

import ma.enset.tp_cassandra_bddc.entities.User;
import ma.enset.tp_cassandra_bddc.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(String name, int age , String email){
        User user = new User();
        user.setId(UUID.randomUUID());
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
        this.userRepository.insert(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
