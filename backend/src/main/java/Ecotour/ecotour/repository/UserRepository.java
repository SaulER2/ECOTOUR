
package Ecotour.ecotour.repository; //Paquete donde se encuentra la clase


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository; //Importar la interfaz JpaRepository
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository; //Importar la anotación Repository
import Ecotour.ecotour.modelo.User; //Importar la clase User

@Repository //Anotación Repository para indicar que es un repositorio
public interface UserRepository extends JpaRepository<User, Long>{ //Interfaz UserRepository que extiende de JpaRepository
    //User = Clase -> Long = Tipo de dato del id de la clase
    @Query("SELECT u FROM User u WHERE TYPE(u) <> Driver")
    List<User> findOnlyUser();
}

