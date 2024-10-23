package Ecotour.ecotour.servicio;

//import Ecotour.ecotour.modelo.Driver;
import Ecotour.ecotour.dto.DriverDTO;
import Ecotour.ecotour.dto.UserDTO; // Se importa la clase UserDTO
import Ecotour.ecotour.modelo.User; // Se importa la clase User
import java.util.List; // Se importa la clase List
import java.util.Optional; // Se importa la clase Optional

public interface UserService { // Se crea la interfaz UserService
    public User save(UserDTO registroDTO); // Se crea el método save que recibe un objeto de tipo UserDTO y retorna un objeto de tipo User
    
    public List<User> findAll(UserDTO registroDTO); // Se crea el método findAll que recibe un objeto de tipo UserDTO y retorna una lista de objetos de tipo User

    public List<User> findOnlyUser(DriverDTO registroDTO); // Se crea el método findOnlyUser que recibe un objeto de tipo UserDTO y retorna una lista de objetos de tipo User
    
    public Optional<User> findById(Long id); // Se crea el método findById que recibe un objeto de tipo Long y retorna un objeto de tipo Optional de tipo User
    
    public Optional<User> updateUser(Long id, UserDTO registroDTO); // Se crea el método updateUser que recibe un objeto de tipo Long y un objeto de tipo UserDTO y retorna un objeto de tipo Optional de tipo User
    
    public Optional<User> deleteById(Long id, UserDTO registroDTO); // Se crea el método deleteById que recibe un objeto de tipo Long y un objeto de tipo UserDTO y retorna un objeto de tipo Optional de tipo User
}
