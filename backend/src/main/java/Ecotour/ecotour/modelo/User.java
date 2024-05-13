package Ecotour.ecotour.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;*/

@Entity
@Table(name = "user")
/*@Data //Crea Getters y Setters
@AllArgsConstructor //Crea un constructor
@NoArgsConstructor //Crea un constructor sin ningun campo*/
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(nullable = false, unique = true)
    private String username;
    
    @Column(nullable = false)
    private String password;
    
    @Column (nullable = false)
    private String name;
    
    @Column (nullable = false)
    private String lastname;
    
    @Column (nullable = false)
    private String email;
    
    @Column (nullable = true)
    private long phone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    public User(long id, String username, String password, String name, String lastname, String email, long phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
    }

    public User(String username, String password, String name, String lastname, String email, long phone) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
    }

    public User(String username, String password, String name, String lastname, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String email) {
        this.email = email;
    }

    public User(long phone) {
        this.phone = phone;
    }

    public User() {
    }
}
