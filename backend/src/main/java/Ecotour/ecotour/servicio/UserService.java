
package Ecotour.ecotour.servicio;

import Ecotour.ecotour.dto.UserDTO;
import Ecotour.ecotour.modelo.User;

public interface UserService {
    public User save(UserDTO registroDTO);
}
