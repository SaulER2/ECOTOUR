package Ecotour.ecotour.servicio.impl; // Change the package name to Ecotour.ecotour.servicio.impl

import Ecotour.ecotour.dto.UserDTO; // Change the package name to Ecotour.ecotour.dto
import Ecotour.ecotour.modelo.User; // Change the package name to Ecotour.ecotour.modelo
import Ecotour.ecotour.repository.UserRepository; // Change the package name to Ecotour.ecotour.repository
import Ecotour.ecotour.servicio.UserService; // Change the package name to Ecotour.ecotour.servicio
import java.util.List; // Import the List class
import java.util.Optional; // Import the Optional class
import org.springframework.beans.factory.annotation.Autowired; // Import the Autowired class
import org.springframework.stereotype.Service; // Import the Service class

@Service // Add the Service annotation
public class UserServiceImpl implements UserService{ // Change the class name to UserServiceImpl and implement the UserService interface

    @Autowired //Anotación que permite la inyección de dependencias
    private UserRepository userRepository; ////Inyección de dependencia de la clase UserRepository
    
    @Override //Anotación que indica que el método se sobrescribe
    public User save(UserDTO registroDTO) { //Método que recibe un objeto de la clase UserDTO para guardar un usuario
        User user = new User( //Crea un objeto de la clase User
                registroDTO.getUsername(), //Obtiene el nombre de usuario
                registroDTO.getPassword(), //Obtiene la contraseña
                registroDTO.getName(), //Obtiene el nombre
                registroDTO.getLastname(), //Obtiene el apellido
                registroDTO.getEmail(), //Obtiene el correo electrónico
                registroDTO.getPhone() //Obtiene el número de teléfono
        );
        return userRepository.save(user); //Retorna el método save de la clase UserRepository
    }
    
    @Override
    public List<User> findAll(UserDTO registroDTO) { //Método que recibe un objeto de la clase UserDTO para encontrar todos los usuarios
        return userRepository.findAll(); //Retorna el método findAll de la clase UserRepository
   }
    
    @Override
    public Optional<User> findById(Long id){ //Método que recibe un ID para encontrar un usuario por ID
        return userRepository.findById(id); //Retorna el método findById de la clase
    }
    
    @Override
    public Optional<User> updateUser(Long id, UserDTO registroDTO){ //Método que recibe un ID y un objeto de la clase UserDTO para actualizar un usuario
        Optional<User> existingUser = userRepository.findById(id); //Obtiene un usuario por ID
        
        if (existingUser.isPresent()) { //Si el usuario existe
            User registroActualizadoDTO = existingUser.get(); //Obtiene el usuario existente
        
            registroActualizadoDTO.setUsername(registroDTO.getUsername()); //Actualiza el nombre de usuario
            registroActualizadoDTO.setPassword(registroDTO.getPassword()); //Actualiza la contraseña
            registroActualizadoDTO.setName(registroDTO.getName()); //Actualiza el nombre
            registroActualizadoDTO.setLastname(registroDTO.getLastname()); //Actualiza el apellido
            registroActualizadoDTO.setEmail(registroDTO.getEmail()); //Actualiza el correo electrónico
            registroActualizadoDTO.setPhone(registroDTO.getPhone()); //Actualiza el número de teléfono
        
        userRepository.save(registroActualizadoDTO); //Guarda el usuario actualizado
        return Optional.of(registroActualizadoDTO); //Retorna el usuario actualizado
        }
        else{ //Si el usuario no existe
        return Optional.empty(); //Retorna un valor vacío
        }
    }
    
    @Override
    public Optional<User> deleteById(Long id, UserDTO registroDTO){ //Método que recibe un ID y un objeto de la clase UserDTO para eliminar logicamente un usuario por ID
        Optional<User> existingUser = userRepository.findById(id); //Obtiene un usuario por ID
        
        if (existingUser.isPresent()) { //Si el usuario existe
            User registroActualizadoDTO = existingUser.get(); //Obtiene el usuario existente
        
            registroActualizadoDTO.setActive(false); //Actualiza el estado del usuario a inactivo
        
        userRepository.save(registroActualizadoDTO); //Guarda el usuario actualizado
        return Optional.of(registroActualizadoDTO); //Retorna el usuario actualizado
        }
        else{ //Si el usuario no existe
        return Optional.empty(); //Retorna un valor vacío
        }
    }
}
