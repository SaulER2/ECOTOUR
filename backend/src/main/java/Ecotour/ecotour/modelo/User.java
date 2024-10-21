package Ecotour.ecotour.modelo;

import java.util.Set; //Importa la clase Set de la librería java.util
import jakarta.persistence.Column; //Importa la clase Column de la librería jakarta.persistence
import jakarta.persistence.Entity;  //Importa la clase Entity de la librería jakarta.persistence
import jakarta.persistence.GeneratedValue; //Importa la clase GeneratedValue de la librería jakarta.persistence
import jakarta.persistence.GenerationType; //Importa la clase GenerationType de la librería jakarta.persistence
import jakarta.persistence.Id; //Importa la clase Id de la librería jakarta.persistence
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table; //Importa la clase Table de la librería jakarta.persistence
import lombok.AllArgsConstructor; //Importa la clase AllArgsConstructor de la librería lombok
import lombok.Data; //Importa la clase Data de la librería lombok
import lombok.NoArgsConstructor; //Importa la clase NoArgsConstructor de la librería lombok

@Data //Crea Getters y Setters
@AllArgsConstructor //Crea un constructor con todos los campos
@NoArgsConstructor //Crea un constructor vacío
@Entity    //Indica que la clase es una entidad
@Table(name = "user") //Indica el nombre de la tabla en la base de datos

public class User { //Clase User
    @Id //Indica que el atributo es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Genera un valor automático para la llave primaria
    //@OneToMany(mappedBy = "user")
    private long id; //Atributo id de tipo long
    
    @Column(nullable = false, unique = true) //Indica que el atributo no puede ser nulo y que es único
    private String username; //Atributo username de tipo String
    
    @Column(nullable = false) //Indica que el atributo no puede ser nulo
    private String password; //Atributo password de tipo String
    
    @Column (nullable = false) //Indica que el atributo no puede ser nulo
    private String name; //Atributo name de tipo String
    
    @Column (nullable = false) //Indica que el atributo no puede ser nulo
    private String lastname; //Atributo lastname de tipo String
    
    @Column (nullable = false) //Indica que el atributo no puede ser nulo
    private String email; //Atributo email de tipo String
    
    @Column (nullable = true) //Indica que el atributo puede ser nulo
    private long phone; //Atributo phone de tipo long

    @Column (nullable = false) //Indica que el atributo puede ser nulo
    private boolean active = true; //Atributo activo de tipo boolean

    @OneToMany(mappedBy = "user")
    private Set<User_Transport> user_transport;
    
    public User(String username, String password, String name, String lastname, String email, long phone) { //Constructor de la clase User
        this.username = username; //Asigna el valor de username al atributo username
        this.password = password; //Asigna el valor de password al atributo password
        this.name = name; //Asigna el valor de name al atributo name
        this.lastname = lastname;  //Asigna el valor de lastname al atributo lastname
        this.email = email; //Asigna el valor de email al atributo email
        this.phone = phone; //Asigna el valor de phone al atributo phone
    }

    /*public User(String username, String password, String name, String lastname, String email) {
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

    public User(boolean active) {
        this.active = active;
    }
    
    public User(long id){
        this.id = id;
    }*/

}
