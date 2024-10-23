package Ecotour.ecotour.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ecotour.ecotour.dto.DriverDTO;
import Ecotour.ecotour.modelo.Driver;
import Ecotour.ecotour.servicio.DriverService;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1")
public class DriverController {
    
    @Autowired
    DriverService driverService;

    @PostMapping("/newDriver")
    public Driver newDriver(@RequestBody DriverDTO driverDTO){
        return driverService.save(driverDTO);
    }

    @GetMapping("/driver")
    public List<Driver> findAll(DriverDTO driverDTO){
        return driverService.findAll(driverDTO);
    }

    @GetMapping("/driver/driver")
    public List<Driver> findOnlyDrivers(DriverDTO driverDTO){
        return driverService.findOnlyDriver(driverDTO);
    }

    @GetMapping("/driver/{id}")
    public Optional<Driver> findDriverById(@PathVariable Long id){
        System.out.println(id + " id");
        return driverService.findDriverById(id);
    }

    @PutMapping("/update/driver/{id}")
    public Optional<Driver> updateDriver(@RequestBody DriverDTO driverDTO, Long id){
        return driverService.updateDriver(id, driverDTO);
    }


}
