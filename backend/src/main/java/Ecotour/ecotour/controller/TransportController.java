package Ecotour.ecotour.controller; //Paquete donde se encuentra la clase

import Ecotour.ecotour.dto.TransportDTO; //Importa la clase TransportDTO
import Ecotour.ecotour.modelo.Transport; //Importa la clase Transport
import Ecotour.ecotour.servicio.TransportService; //Importa la clase TransportService
import java.util.List; //Importa la clase List
import java.util.Optional; //Importa la clase Optional
import org.springframework.web.bind.annotation.PostMapping; //Importa la clase PostMapping
import org.springframework.web.bind.annotation.GetMapping; //Importa la clase GetMapping
import org.springframework.web.bind.annotation.PathVariable; //Importa la clase PathVariable
import org.springframework.web.bind.annotation.PutMapping; //Importa la clase PutMapping
import org.springframework.web.bind.annotation.DeleteMapping; //Importa la clase DeleteMapping
import org.springframework.web.bind.annotation.RequestBody; //Importa la clase RequestBody
import org.springframework.beans.factory.annotation.Autowired; //Importa la clase Autowired
import org.springframework.web.bind.annotation.RequestMapping; //Importa la clase RequestMapping
import org.springframework.web.bind.annotation.RestController; //Importa la clase RestController

@RestController //Anotación que indica que la clase es un controlador REST
@RequestMapping("/api/v1") //Anotación que mapea una petición web a un método controlador
public class TransportController { //Clase TransportController
    
    @Autowired //Anotación que permite la inyección de dependencias
    TransportService transportService; //Inyección de dependencia de la clase TransportService

    @PostMapping("/newTransport") //Anotación que mapea una petición POST a un método controlador
    public Transport newTransport(@RequestBody TransportDTO registroDTO){ //Método que recibe un objeto de la clase TransportDTO para guardar un transporte
        return transportService.save(registroDTO); //Retorna el método save de la clase TransportService
    }

    @GetMapping("/transport") //Anotación que mapea una petición GET a un método controlador
    public List<Transport> findAll(TransportDTO registroDTO){ //Método que recibe un objeto de la clase TransportDTO para encontrar todos los transportes
        return transportService.findAll(registroDTO); //Retorna el método findAll de la clase TransportService
    }

    @GetMapping("/transport/{id}") //Anotación que mapea una petición GET a un método controlador
    public Optional<Transport> findById(@PathVariable Long id){ //Método que recibe un ID para encontrar un transporte por ID
        return transportService.findById(id); //Retorna el método findById de la clase
    }

    @PutMapping("/update/transport/{id}") //Anotación que mapea una petición PUT a un método controlador
    public Optional<Transport> updateTransport(@PathVariable Long id, @RequestBody TransportDTO registroDTO){ //Método que recibe un ID y un objeto de la clase TransportDTO para actualizar un transporte
        return transportService.updateTransport(id, registroDTO); //Retorna el método updateTransport de la clase TransportService
    }

    @DeleteMapping("/delete/transport/{id}") //Anotación que mapea una petición DELETE a un método controlador
    public Optional<Transport> deleteById(@PathVariable Long id, @RequestBody TransportDTO registroDTO){ //Método que recibe un ID y un objeto de la clase TransportDTO para eliminar logicamente un transporte
        return transportService.deleteById(id, registroDTO); //Retorna el método deleteById de la clase TransportService
    }
}
