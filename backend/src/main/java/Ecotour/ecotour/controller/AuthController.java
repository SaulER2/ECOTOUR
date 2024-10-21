
package Ecotour.ecotour.controller; // Paquete al que pertenece la clase

import Ecotour.ecotour.dto.UserDTO; //Importa la clase UserDTO del paquete Ecotour.ecotour.dto
import Ecotour.ecotour.modelo.User; //Importa la clase User del paquete Ecotour.ecotour.modelo
import Ecotour.ecotour.servicio.UserService; //Importa la clase UserService del paquete Ecotour.ecotour.servicio
import java.util.List; //Importa la clase List
import java.util.Optional; //Importa la clase Optional
import org.springframework.beans.factory.annotation.Autowired; //Importa la clase Autowired
//import org.springframework.web.bind.annotation.CrossOrigin; //Importa la clase CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping; //Importa la clase DeleteMapping
import org.springframework.web.bind.annotation.GetMapping; //Importa la clase GetMapping
import org.springframework.web.bind.annotation.PathVariable; //Importa la clase PathVariable
import org.springframework.web.bind.annotation.PostMapping; //Importa la clase PostMapping
import org.springframework.web.bind.annotation.PutMapping; //Importa la clase PutMapping
import org.springframework.web.bind.annotation.RequestBody; //Importa la clase RequestBody
import org.springframework.web.bind.annotation.RequestMapping; //Importa la clase RequestMapping
import org.springframework.web.bind.annotation.RestController; //Importa la clase RestController

//@CrossOrigin(origins = "/*http://localhost:5173/*/ * ") //Permite que los navegadores ejecuten scripts en una página web
@RestController //Anotación que indica que la clase es un controlador
@RequestMapping("/api/v1") //Anotación que mapea las solicitudes web a métodos de manejo de eventos en clases anotadas con @Controller
public class AuthController { //Clase AuthController
    
    @Autowired //Anotación que permite la inyección de dependencias
    UserService userService; //Inyección de dependencia de la clase UserService
    
    @PostMapping("/signup") //Anotación que mapea las solicitudes HTTP POST a métodos de manejo de eventos en métodos anotados con @Controller
    public User userSignUp(@RequestBody UserDTO registroDTO){ //Método que recibe un objeto de la clase UserDTO
        return userService.save(registroDTO); //Retorna el método save de la clase UserService
    }
    
    @GetMapping("/user") //Anotación que mapea las solicitudes HTTP GET a métodos de manejo de eventos en métodos anotados con @Controller
    public List<User> findAll(UserDTO registroDTO){ //Método que recibe un objeto de la clase UserDTO
        return userService.findAll(registroDTO); //Retorna el método findAll de la clase UserService
    }

    @GetMapping("/user/{id}") //Anotación que mapea las solicitudes HTTP GET a métodos de manejo de eventos en métodos anotados con @Controller para un ID específico
    public Optional<User> findById(@PathVariable Long id){ //Método que recibe un ID
        return userService.findById(id); //Retorna el método findById de la clase
    }
    
    @PutMapping("/update/user/{id}") //Anotación que mapea las solicitudes HTTP PUT a métodos de manejo de eventos en métodos anotados con @Controller para un ID específico
    public Optional<User> updateUser(@PathVariable Long id, @RequestBody UserDTO registroDTO){ //Método que recibe un ID y un objeto de la clase UserDTO
        return userService.updateUser(id, registroDTO); //Retorna el método updateUser de la clase UserService
    }
    
    @DeleteMapping("/delete/user/{id}") //Anotación que mapea las solicitudes HTTP DELETE a métodos de manejo de eventos en métodos anotados con @Controller para un ID específico
    public Optional<User> deleteById(@PathVariable Long id, @RequestBody UserDTO registroDTO){ //Método que recibe un ID y un objeto de la clase UserDTO
        return userService.deleteById(id, registroDTO); //Retorna el método deleteById de la clase UserService
    }
}
