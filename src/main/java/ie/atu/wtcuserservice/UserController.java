package ie.atu.wtcuserservice;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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
}
