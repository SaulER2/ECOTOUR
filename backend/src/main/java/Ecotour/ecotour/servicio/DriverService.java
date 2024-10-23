package Ecotour.ecotour.servicio;

import Ecotour.ecotour.dto.DriverDTO;
import Ecotour.ecotour.modelo.Driver;
import java.util.List;
import java.util.Optional;

public interface DriverService extends UserService {
    
    public Driver save(DriverDTO registroDTO);
    
    public List<Driver> findAll(DriverDTO registroDTO);

    public Optional<Driver> findDriverById(Long id);
    
    public Optional<Driver> updateDriver(Long id, DriverDTO registroDTO);
    
    public List<Driver> findOnlyDriver(DriverDTO registroDTO);
}
