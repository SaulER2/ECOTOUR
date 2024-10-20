package Ecotour.ecotour.servicio.impl;

import Ecotour.ecotour.dto.UserDTO;
import Ecotour.ecotour.modelo.User;
import Ecotour.ecotour.repository.UserRepository;
import Ecotour.ecotour.servicio.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public User save(UserDTO registroDTO) {
        User user = new User(
                registroDTO.getUsername(),
                registroDTO.getPassword(),
                registroDTO.getName(),
                registroDTO.getLastname(),
                registroDTO.getEmail(),
                registroDTO.getPhone()
        );
        return userRepository.save(user);
    }
    
    @Override
    public List<User> findAll(UserDTO registroDTO) {
        return userRepository.findAll();
   }
    
    @Override
    public Optional<User> findById(Long id){
        return userRepository.findById(id);
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
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
