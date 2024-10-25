package Ecotour.ecotour.servicio.impl;  // Paquete donde se creará el archivo

import Ecotour.ecotour.repository.User_TransportRepository; // Importación de la clase User_TransportRepository
import Ecotour.ecotour.dto.User_TransportDTO; // Importación de la clase User_TransportDTO
import Ecotour.ecotour.modelo.Driver;
import Ecotour.ecotour.modelo.Transport;
import Ecotour.ecotour.modelo.User;
import Ecotour.ecotour.modelo.User_Transport; // Importación de la clase User_Transport
import Ecotour.ecotour.servicio.DriverService;
import Ecotour.ecotour.servicio.TransportService;
import Ecotour.ecotour.servicio.UserService;
import Ecotour.ecotour.servicio.User_TransportService; // Importación de la clase User_TransportService
import org.springframework.beans.factory.annotation.Autowired; // Importación de la clase Autowired
import org.springframework.stereotype.Service; // Importación de la clase Service
import java.util.List; // Importación de la clase List
import java.util.Optional; // Importación de la clase Optional

@Service // Anotación que indica que la clase es un "Servicio"
public class User_TransportServiceImpl implements User_TransportService { // Clase User_TransportServiceImpl que implementa la interfaz User_TransportService
    
    @Autowired // Inyección de dependencias
    private User_TransportRepository user_transportRepository; // Creación de un objeto de tipo User_TransportRepository

    @Autowired
    private UserService userService;
    
    @Autowired
    private DriverService driverService;
    
    @Autowired
    private TransportService transportService;
    
    @Override // Indica que se está sobreescribiendo un método de la clase padre
    public User_Transport save(User_TransportDTO registroDTO){ // Método para guardar un registro de User_Transport
        User user = userService.findById(registroDTO.getUser()).get();
        Transport transport = transportService.findById(registroDTO.getTransport()).get();
        Driver driver = driverService.findDriverById(registroDTO.getDriver()).get();
        
        User_Transport user_transport = new User_Transport( // Creación de un objeto de tipo User_Transport
            user, // Atributo id_user del objeto User_Transport
            driver,
            transport, // Atributo id_transport del objeto User_Transport
            registroDTO.getOrigin(), // Atributo origin del objeto User_Transport
            registroDTO.getDestination(), // Atributo destination del objeto User_Transport
            registroDTO.getPricePerHour(),
            registroDTO.getStartTime(),
            registroDTO.getEndTime()
        );
        System.out.println(user_transport);
        return user_transportRepository.save(user_transport); // Guardar el objeto User_Transport en la base de datos
    }

    @Override
    public List<User_Transport> findAll(User_TransportDTO registroDTO){ // Método para encontrar todos los registros de User_Transport
        return user_transportRepository.findAll(); // Encontrar todos los registros de User_Transport en la base de datos
    }

    @Override
    public Optional<User_Transport> findById(Long id){ // Método para encontrar un registro de User_Transport por su id
        return user_transportRepository.findById(id); // Encontrar un registro de User_Transport por su id en la base de datos
    }

    @Override
    public Optional<User_Transport> updateUserTransport(Long id, User_TransportDTO registroDTO){ // Método para actualizar un registro de User_Transport
        Optional<User_Transport> existingUserTransport = user_transportRepository.findById(id); // Encontrar un registro de User_Transport por su id en la base de datos

        if (existingUserTransport.isPresent()) { // Si el registro existe
            User_Transport registroActualizadoDTO = existingUserTransport.get(); // Obtener el registro
        
            registroActualizadoDTO.setOrigin(registroDTO.getOrigin()); // Actualizar el atributo origin del registro
            registroActualizadoDTO.setDestination(registroDTO.getDestination()); // Actualizar el atributo destination del registro
            registroActualizadoDTO.setPricePerHour(registroDTO.getPricePerHour());
            registroActualizadoDTO.setStartTime(registroDTO.getStartTime());
            registroActualizadoDTO.setEndTime(registroDTO.getEndTime());
        
            user_transportRepository.save(registroActualizadoDTO); // Guardar el registro actualizado en la base de datos
            return Optional.of(registroActualizadoDTO); // Retornar el registro actualizado
        }
        else{ // Si el registro no existe
        return Optional.empty(); // Retornar un objeto vacío
        }
    }

    @Override
    public Optional<User_Transport> updateDateUserTransport(Long id, User_TransportDTO registroDTO){
        Optional<User_Transport> existingUserTransport = user_transportRepository.findById(id);

        if(existingUserTransport.isPresent()){
            User_Transport registroActualizadoDTO = existingUserTransport.get();

            registroActualizadoDTO.setStartTime(registroDTO.getStartTime());
            registroActualizadoDTO.setEndTime(registroDTO.getEndTime());

            user_transportRepository.save(registroActualizadoDTO);
            return Optional.of(registroActualizadoDTO);
        }
        else{
            return Optional.empty();
        }
    }
}
