package Ecotour.ecotour.repository;

import Ecotour.ecotour.modelo.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends JpaRepository<Transport, Long>{
    
}