package Ecotour.ecotour.servicio.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Ecotour.ecotour.repository.DriverRepository;
import Ecotour.ecotour.repository.UserRepository;
import Ecotour.ecotour.servicio.DriverService;
import Ecotour.ecotour.dto.DriverDTO;
import Ecotour.ecotour.dto.UserDTO;
import Ecotour.ecotour.modelo.Driver;
import Ecotour.ecotour.modelo.User;

@Service
public class DriverServiceImpl implements DriverService{

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Driver save(DriverDTO registroDTO){
        Driver driver = new Driver(
            registroDTO.getUsername(),
            registroDTO.getPassword(),
            registroDTO.getName(),
            registroDTO.getLastname(),
            registroDTO.getEmail(),
            registroDTO.getPhone(),
            registroDTO.getEmployeeCode()
        );
        return driverRepository.save(driver);
    } 

    @Override
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
    public List<Driver> findAll(DriverDTO registroDTO){
        return driverRepository.findAll();
    }

    @Override
    public List<Driver> findOnlyDriver(DriverDTO registroDTO){
        return driverRepository.findOnlyDriver(); //Retorna el método findByQuery de la clase DriverRepository
    }

    @Override
    public List<User> findAll(UserDTO registroDTO){
        return userRepository.findAll();
    }

    @Override
    public Optional<Driver> findDriverById(Long id){
        return driverRepository.findById(id);
    }

    @Override
    public List<User> findOnlyUser(DriverDTO registroDTO){
        return userRepository.findOnlyUser(); //Retorna el método findByQuery de la clase UserRepository
    }

    @Override
    public Optional<User> findById(Long id){ //Método que recibe un ID para encontrar un usuario por ID
        return userRepository.findById(id); //Retorna el método findById de la clase
    }

    @Override
    public Optional<Driver> updateDriver(Long id, DriverDTO registroDTO){
        Optional<Driver> existingDriver = driverRepository.findById(id);

        if (existingDriver.isPresent()) {
            Driver registroActualizadoDTO = existingDriver.get();

            registroActualizadoDTO.setUsername(registroDTO.getUsername());
            registroActualizadoDTO.setPassword(registroDTO.getPassword()); 
            registroActualizadoDTO.setName(registroDTO.getName()); 
            registroActualizadoDTO.setLastname(registroDTO.getLastname()); 
            registroActualizadoDTO.setEmail(registroDTO.getEmail()); 
            registroActualizadoDTO.setPhone(registroDTO.getPhone());
            registroActualizadoDTO.setEmployeeCode(registroDTO.getEmployeeCode());

            driverRepository.save(registroActualizadoDTO);
            return Optional.of(registroActualizadoDTO);
        }
        else{
            return Optional.empty();
        }
    }

    @Override
    public Optional<User> updateUser(Long id, UserDTO registroDTO){
        Optional<User> existingUser = userRepository.findById(id);

        if (existingUser.isPresent()) {
            User registroActualizadoDTO = existingUser.get();

            registroActualizadoDTO.setUsername(registroDTO.getUsername());
            registroActualizadoDTO.setPassword(registroDTO.getPassword()); 
            registroActualizadoDTO.setName(registroDTO.getName()); 
            registroActualizadoDTO.setLastname(registroDTO.getLastname()); 
            registroActualizadoDTO.setEmail(registroDTO.getEmail()); 
            registroActualizadoDTO.setPhone(registroDTO.getPhone());

            userRepository.save(registroActualizadoDTO);
            return Optional.of(registroActualizadoDTO);
        }
        else{
            return Optional.empty();
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
