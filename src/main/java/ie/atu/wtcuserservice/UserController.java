package ie.atu.wtcuserservice;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/createUser")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@Valid @RequestBody User user){
        userService.createUser(user);

    }

    @PostMapping("/user/getUser")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Map<String, List<User>>> getUser(){
        List<User> userToSend= userService.getUser();
        Map<String, List<User>> response = new HashMap<>();
        response.put("user", userToSend);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

}
