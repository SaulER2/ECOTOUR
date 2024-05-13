package Ecotour.ecotour.servicio.impl;

import Ecotour.ecotour.dto.UserDTO;
import Ecotour.ecotour.modelo.User;
import Ecotour.ecotour.repository.UserRepository;
import Ecotour.ecotour.servicio.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public User save(UserDTO registroDTO) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        User user = new User(
                registroDTO.getUsername(),
                registroDTO.getPassword(),
                registroDTO.getName(),
                registroDTO.getLastname(),
                registroDTO.getEmail()
        );
        return userRepository.save(user);
    }
    
}
