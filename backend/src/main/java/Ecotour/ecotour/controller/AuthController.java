
package Ecotour.ecotour.controller;

import Ecotour.ecotour.dto.UserDTO;
import Ecotour.ecotour.modelo.User;
import Ecotour.ecotour.servicio.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @Autowired
    UserService userService;
    
    /*@ModelAttribute("user")
    public UserDTO newSignUpUserDTO(){
        return new UserDTO();
    }*/
    
    @PostMapping("/signup")
    /*public String signUp(@ModelAttribute("user") UserDTO registroDTO){
        userService.save(registroDTO);
        return "redirect:/registro?success";
    }*/
    public User userSignUp(@RequestBody/*ModelAttribute("user")*/ UserDTO registroDTO){
        return userService.save(registroDTO);
    }
}
