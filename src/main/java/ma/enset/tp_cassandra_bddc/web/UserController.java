package ma.enset.tp_cassandra_bddc.web;

import ma.enset.tp_cassandra_bddc.entities.User;
import ma.enset.tp_cassandra_bddc.services.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping()
    public String saveUser(@RequestParam String name,@RequestParam int age,@RequestParam String email){
        userService.addUser(name,age,email);
        return "user saved";
    }
}
