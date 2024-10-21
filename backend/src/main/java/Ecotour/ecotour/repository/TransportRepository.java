package Ecotour.ecotour.repository;

import Ecotour.ecotour.modelo.Transport; //Importamos la clase Transport
import org.springframework.data.jpa.repository.JpaRepository; //Importamos la interfaz JpaRepository
import org.springframework.stereotype.Repository; //Importamos la anotación Repository

@Repository //Anotación Repository
public interface TransportRepository extends JpaRepository<Transport, Long>{ //Interfaz TransportRepository que extiende de JpaRepository
    //Se define la interfaz TransportRepository que extiende de JpaRepository, la cual se encarga de realizar las operaciones CRUD en la base de datos
    
}
