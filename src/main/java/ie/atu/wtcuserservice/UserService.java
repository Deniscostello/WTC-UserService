package ie.atu.wtcuserservice;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void createUser(User user){
        System.out.println(user);
    }
}
