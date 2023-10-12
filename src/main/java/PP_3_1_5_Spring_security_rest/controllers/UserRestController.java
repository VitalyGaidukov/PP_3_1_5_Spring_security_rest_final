package PP_3_1_5_Spring_security_rest.controllers;

import PP_3_1_5_Spring_security_rest.models.Role;
import PP_3_1_5_Spring_security_rest.models.User;
import PP_3_1_5_Spring_security_rest.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Set;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    //http://localhost:8080/api/user

    @GetMapping("/user")
    public ResponseEntity<User> userPage(Principal principal){
        User user = userService.findByUsername(principal.getName());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/user/role")
    public ResponseEntity<Set<Role>> userGetRole(Principal principal){
        User user = userService.findByUsername(principal.getName());
        Set<Role> userRole = user.getRoles();
        return new ResponseEntity<>(userRole, HttpStatus.OK);
    }
}
