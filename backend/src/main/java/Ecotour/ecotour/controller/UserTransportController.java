package Ecotour.ecotour.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import Ecotour.ecotour.dto.User_TransportDTO;
import Ecotour.ecotour.modelo.User_Transport;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Ecotour.ecotour.servicio.User_TransportService;

@RestController
@RequestMapping("/api/v3")
public class UserTransportController {

    @Autowired
    User_TransportService user_TransportService;

    @PostMapping("/newUserTransport")
    public User_Transport newUserTransport(@RequestBody User_TransportDTO registroDTO){
        return user_TransportService.save(registroDTO);
    }

    @GetMapping("/userTransport")
    public List<User_Transport> findAll(User_TransportDTO registroDTO){
        return user_TransportService.findAll(registroDTO);
    }

    @GetMapping("/userTransport/{id}")
    public Optional<User_Transport> findById(@PathVariable Long id){
        return user_TransportService.findById(id);
    }

    @PutMapping("/update/userTransport/{id}")
    public Optional<User_Transport> updateUserTransport(@PathVariable Long id, @RequestBody User_TransportDTO registroDTO){
        return user_TransportService.updateUserTransport(id, registroDTO);
    }
}
