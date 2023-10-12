package PP_3_1_5_Spring_security_rest.service;

import PP_3_1_5_Spring_security_rest.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);

    public void updateUser(User user, int id);

    User findByUsername(String username);

    User findUserById( int id);

}
