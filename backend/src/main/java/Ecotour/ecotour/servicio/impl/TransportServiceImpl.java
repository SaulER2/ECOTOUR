package Ecotour.ecotour.servicio.impl; //Paquete donde se encuentra la clase

import Ecotour.ecotour.dto.TransportDTO; //Importa la clase TransportDTO
import Ecotour.ecotour.modelo.Transport; //Importa la clase Transport
import Ecotour.ecotour.repository.TransportRepository; //Importa la clase TransportRepository
import Ecotour.ecotour.servicio.TransportService; //Importa la clase TransportService
import java.util.List; //Importa la clase List
import java.util.Optional; //Importa la clase Optional
import org.springframework.stereotype.Service; //Importa la clase Service
import org.springframework.beans.factory.annotation.Autowired; //Importa la clase Autowired

@Service //Anotación que indica que la clase es un servicio
public class TransportServiceImpl implements TransportService { //Clase TransportServiceImpl que implementa la interfaz TransportService
    
    @Autowired //Anotación que permite la inyección de dependencias
    private TransportRepository transportRepository; //Inyección de dependencia de la clase TransportRepository

    @Override //Anotación que indica que el método se sobrescribe
    public Transport save(TransportDTO registroDTO) { //Método que recibe un objeto de la clase TransportDTO para guardar un transporte

        Transport transport = new Transport( //Crea un objeto de la clase Transport
            registroDTO.getName(), //Obtiene el nombre
            registroDTO.getDescription() //Obtiene la descripción
        );
        return transportRepository.save(transport); //Retorna el método save de la clase TransportRepository
    }

    @Override
    public List<Transport> findAll(TransportDTO registroDTO) { //Método que recibe un objeto de la clase TransportDTO para encontrar todos los transportes
        return transportRepository.findAll(); //Retorna el método findAll de la clase TransportRepository
    }

    @Override
    public Optional<Transport> findById(Long id) { //Método que recibe un ID para encontrar un transporte por ID
        return transportRepository.findById(id); //Retorna el método findById de la clase
    }

    @Override
    public Optional<Transport> updateTransport(Long id, TransportDTO registroDTO) { //Método que recibe un ID y un objeto de la clase TransportDTO para actualizar un transporte
        Optional<Transport> existingTransport = transportRepository.findById(id); //Obtiene un transporte por ID

        if (existingTransport.isPresent()) { //Si el transporte existe
            Transport registroActualizadoDTO = existingTransport.get(); //Obtiene el transporte existente
        
            registroActualizadoDTO.setName(registroDTO.getName()); //Actualiza el nombre
            registroActualizadoDTO.setDescription(registroDTO.getDescription()); //Actualiza la descripción
        
        transportRepository.save(registroActualizadoDTO); //Guarda el transporte actualizado
        return Optional.of(registroActualizadoDTO); //Retorna el transporte actualizado
        }
        else{ //Si el transporte no existe
        return Optional.empty(); //Retorna un valor vacío
        }
    }

    @Override
    public Optional<Transport> deleteById(Long id, TransportDTO registroDTO) { //Método que recibe un ID y un objeto de la clase TransportDTO para eliminar un transporte
        Optional<Transport> existingTransport = transportRepository.findById(id); //Obtiene un transporte por ID

        if (existingTransport.isPresent()) { //Si el transporte existe
            Transport registroActualizadoDTO = existingTransport.get(); //Obtiene el transporte existente
        
            transportRepository.save(registroActualizadoDTO); //Guarda el transporte actualizado
            return Optional.of(registroActualizadoDTO); //Retorna el transporte actualizado
        }
        else{ //Si el transporte no existe
        return Optional.empty(); //Retorna un valor vacío
        }
    }
    
}
