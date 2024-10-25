package Ecotour.ecotour.servicio;

import Ecotour.ecotour.dto.User_TransportDTO; // Se importa la clase User_TransportDTO
import Ecotour.ecotour.modelo.User_Transport; // Se importa la clase User_Transport
import java.util.List; // Se importa la clase List
import java.util.Optional; // Se importa la clase Optional

public interface User_TransportService { // Se crea la interfaz User_TransportService

    public User_Transport save(User_TransportDTO registroDTO); // Se crea el método save que recibe un objeto de tipo User_TransportDTO y retorna un objeto de tipo User_Transport
    
    public List<User_Transport> findAll(User_TransportDTO registroDTO); // Se crea el método findAll que recibe un objeto de tipo User_TransportDTO y retorna una lista de objetos de tipo User_Transport

    public Optional<User_Transport> findById(Long id); // Se crea el método findById que recibe un objeto de tipo Long y retorna un objeto de tipo Optional de tipo User_Transport

    public Optional<User_Transport> updateUserTransport(Long id, User_TransportDTO registroDTO); // Se crea el método updateUser que recibe un objeto de tipo Long y un objeto de tipo User_TransportDTO y retorna un objeto de tipo Optional de tipo User_Transport

    public Optional<User_Transport> updateDateUserTransport(Long id, User_TransportDTO registroDTO);
}
