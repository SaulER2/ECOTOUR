package Ecotour.ecotour.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("driver")
public class Driver extends User{
    
    @Column(name = "employee_code", unique = true)
    private String employeeCode;
    
    @OneToMany(mappedBy = "driver")
    private Set<User_Transport> user_transport;
    
    public Driver(String username, String password, String name, String lastname, String email, Long phone, String employeeCode){
        super(username, password, name, lastname, email, phone);
        this.employeeCode = employeeCode;
    }
}
