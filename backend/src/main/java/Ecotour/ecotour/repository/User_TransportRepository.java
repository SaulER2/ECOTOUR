package Ecotour.ecotour.repository;

import Ecotour.ecotour.modelo.User_Transport; //Importamos la clase User_Transport
import org.springframework.data.jpa.repository.JpaRepository; //Importamos la interfaz JpaRepository
import org.springframework.stereotype.Repository; //Importamos la anotación Repository

@Repository
public interface User_TransportRepository extends JpaRepository<User_Transport, Long>{ //Interfaz User_TransportRepository que extiende de JpaRepository
    //Se define la interfaz User_TransportRepository que extiende de JpaRepository, la cual se encarga de realizar las operaciones CRUD en la base de datos
}
