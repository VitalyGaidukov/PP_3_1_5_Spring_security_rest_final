package PP_3_1_5_Spring_security_rest.service;



import PP_3_1_5_Spring_security_rest.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> listRoles();

    Role getById(int id);

    void save(Role role);

}
