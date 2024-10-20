
package Ecotour.ecotour.repository;

import Ecotour.ecotour.modelo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//User = Clase -> Long = Tipo de dato del id
public interface UserRepository extends JpaRepository<User, Long>{
}

