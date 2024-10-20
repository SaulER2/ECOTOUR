
package Ecotour.ecotour.servicio;

import Ecotour.ecotour.dto.UserDTO;
import Ecotour.ecotour.modelo.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    public User save(UserDTO registroDTO);
    
    public List<User> findAll(UserDTO registroDTO);
    
    public Optional<User> findById(Long id);
    
    public Optional<User> updateUser(Long id, UserDTO registroDTO);
    
    public void deleteById(Long id);
}
