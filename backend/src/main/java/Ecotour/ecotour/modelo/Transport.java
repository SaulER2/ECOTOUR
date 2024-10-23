package Ecotour.ecotour.modelo; //Paquete donde se encuentra la clase

import java.util.Set; //Importa la clase Set de la librería java.util
import jakarta.persistence.Column; //Importa la clase Column de la librería jakarta.persistence
import jakarta.persistence.Entity; //Importa la clase Entity de la librería jakarta.persistence
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
@Entity //Indica que la clase es una entidad
@Table(name = "transport") //Indica el nombre de la tabla en la base de datos
public class Transport { //Clase Transport

    @Id //Indica que el atributo es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera un valor automático para la llave primaria
    
    @Column(name = "id") //Indica el nombre de la columna en la base de datos
    private long id; //Atributo id de tipo long

    @Column(name = "name", nullable = false) //Indica que el atributo no puede ser nulo y el nombre de la columna en la base de datos
    private String name; //Atributo name de tipo String

    @Column(name = "description", nullable = false) //Indica que el atributo no puede ser nulo y el nombre de la columna en la base de datos
    private String description; //Atributo description de tipo String

    @Column(name = "active", nullable = false) //Indica que el atributo no puede ser nulo y el nombre de la columna en la base de datos
    private boolean active = true; //Atributo activo de tipo boolean

    @OneToMany(mappedBy = "transport")
    private Set<User_Transport> user_transport;


    public Transport(String name, String description) { //Constructor de la clase Transport
        this.name = name; //Asigna el valor de name al atributo name
        this.description = description; //Asigna el valor de description al atributo description
    }

    public Transport(long id) { //Constructor de la clase Transport
        this.id = id; //Asigna el valor de id al atributo id
    }

    public Transport(boolean active) { //Constructor de la clase Transport
        this.active = active; //Asigna el valor de active al atributo active
    }
}
