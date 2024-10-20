package Ecotour.ecotour.servicio; //Paquete donde se encuentra la clase

import Ecotour.ecotour.dto.TransportDTO; //Importa la clase TransportDTO
import Ecotour.ecotour.modelo.Transport; //Importa la clase Transport
import java.util.List; //Importa la clase List
import java.util.Optional; //Importa la clase Optional

public interface TransportService { //Interfaz TransportService

    public Transport save(TransportDTO registroDTO); //Método para guardar un transporte
    
    public List<Transport> findAll(TransportDTO registroDTO); //Método para encontrar todos los transportes
    
    public Optional<Transport> findById(Long id); //Método para encontrar un transporte por ID
    
    public Optional<Transport> updateTransport(Long id, TransportDTO registroDTO); //Método para actualizar un transporte
    
    public Optional<Transport> deleteById(Long id, TransportDTO registroDTO); //Método para eliminar un transporte
}
