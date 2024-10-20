
package Ecotour.ecotour.controller;

import Ecotour.ecotour.dto.UserDTO;
import Ecotour.ecotour.modelo.User;
import Ecotour.ecotour.servicio.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "/*http://localhost:5173/*/ * ")
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @Autowired
    UserService userService;
    
    @PostMapping("/signup")
    public User userSignUp(@RequestBody UserDTO registroDTO){
        return userService.save(registroDTO);
    }
    
    @GetMapping("/user")
    public List<User> findAll(UserDTO registroDTO){
        return userService.findAll(registroDTO);
    }
    
    @GetMapping("/user/{id}")
    public Optional<User> findById(@PathVariable Long id){
        return userService.findById(id);
    }
    
    @PutMapping("/update/user/{id}")
    public Optional<User> updateUser(@PathVariable Long id, @RequestBody UserDTO registroDTO){
        return userService.updateUser(id, registroDTO);
    }
    
    @DeleteMapping("/delete/user/{id}")
    public void deleteById(@PathVariable Long id){
        userService.deleteById(id);
    }
}
