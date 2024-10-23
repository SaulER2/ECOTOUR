package Ecotour.ecotour.repository;

import Ecotour.ecotour.modelo.Driver;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long>{
    @Query("SELECT d FROM Driver d WHERE d.employeeCode IS NOT NULL")
    List<Driver> findOnlyDriver();
}
