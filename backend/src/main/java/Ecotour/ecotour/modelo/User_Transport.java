package Ecotour.ecotour.modelo; //Paquete donde se encuentra la clase

import jakarta.persistence.Column; //Importa la clase Column de la librería jakarta.persistence
import jakarta.persistence.Entity; //Importa la clase Entity de la librería jakarta.persistence
import jakarta.persistence.GeneratedValue; //Importa la clase GeneratedValue de la librería jakarta.persistence
import jakarta.persistence.GenerationType; //Importa la clase GenerationType de la librería jakarta.persistence
import jakarta.persistence.Id; //Importa la clase Id de la librería jakarta.persistence
import jakarta.persistence.JoinColumn; //Importa la clase JoinColumn de la librería jakarta.persistence
import jakarta.persistence.ManyToOne; //Importa la clase ManyToOne de la librería jakarta.persistence
import jakarta.persistence.Table; //Importa la clase Table de la librería jakarta.persistence
import lombok.AllArgsConstructor; //Importa la clase AllArgsConstructor de la librería lombok
import lombok.Data; //Importa la clase Data de la librería lombok
import lombok.NoArgsConstructor; //Importa la clase NoArgsConstructor de la librería lombok

@Data //Crea Getters y Setters
@AllArgsConstructor //Crea un constructor con todos los campos
@NoArgsConstructor //Crea un constructor vacío
@Entity //Indica que la clase es una entidad
@Table(name = "user_transport") //Indica el nombre de la tabla en la base de datos
public class User_Transport { //Clase User_Transport
    
    @Id //Indica que el atributo es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera un valor automático para la llave primaria
    private long id; //Atributo id de tipo long

    @ManyToOne //Indica la relación muchos a uno con la clase User donde el atributo user es de muchos
    @JoinColumn(name = "user", nullable = false) //Indica el nombre de la columna en la base de datos y que no puede ser nulo
    private User user; //Atributo user de tipo User

    @ManyToOne //Indica la relación muchos a uno con la clase Transport donde el atributo transport es de muchos
    @JoinColumn(name = "transport", nullable = false) //Indica el nombre de la columna en la base de datos y que no puede ser nulo
    private Transport transport; //Atributo transport de tipo Transport

    @Column(name = "origin", nullable = true) //Indica el nombre de la columna en la base de datos y que puede ser nulo
    private String origin; //Atributo origin de tipo String

    @Column(name = "destination", nullable = true) //Indica el nombre de la columna en la base de datos y que puede ser nulo
    private String destination; //Atributo destination de tipo String

    @Column(name = "price", nullable = true) //Indica el nombre de la columna en la base de datos y que puede ser nulo
    private float price; //Atributo price de tipo float

    @Column(name = "hours", nullable = true) //Indica el nombre de la columna en la base de datos y que puede ser nulo
    private int hours; //Atributo hours de tipo int
    
    public User_Transport(User user, Transport transport, String origin, String destination, float price, int hours) { //Constructor
        this.user = user; //Asigna el valor de id_user al atributo user
        this.transport = transport; //Asigna el valor de id_transport al atributo transport
        this.origin = origin; //Asigna el valor de origin al atributo origin
        this.destination = destination; //Asigna el valor de destination al atributo destination
        this.price = price; //Asigna el valor de price al atributo price
        this.hours = hours; //Asigna el valor de hours al atributo hours
    }

    public User_Transport(String origin, String destination, float price, int hours) { //Constructor
        this.origin = origin; //Asigna el valor de origin al atributo origin
        this.destination = destination; //Asigna el valor de destination al atributo destination
        this.price = price; //Asigna el valor de price al atributo price
        this.hours = hours; //Asigna el valor de hours al atributo hours
    }
}
