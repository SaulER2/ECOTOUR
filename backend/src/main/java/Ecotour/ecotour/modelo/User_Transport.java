package Ecotour.ecotour.modelo; //Paquete donde se encuentra la clase

import java.time.LocalDateTime;
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
    
    @ManyToOne
    @JoinColumn(name = "driver")
    private Driver driver;

    @Column(name = "origin", nullable = true) //Indica el nombre de la columna en la base de datos y que puede ser nulo
    private String origin; //Atributo origin de tipo String

    @Column(name = "destination", nullable = true) //Indica el nombre de la columna en la base de datos y que puede ser nulo
    private String destination; //Atributo destination de tipo String

    @Column(name = "pricePerHour", nullable = false)
    private float pricePerHour;

    @Column (name = "start_Time", nullable = true)
    private LocalDateTime startTime;

    @Column (name = "endTime", nullable = true)
    private LocalDateTime endTime;

    @Column(name = "hours", nullable = true) //Indica el nombre de la columna en la base de datos y que puede ser nulo
    private int hours; //Atributo hours de tipo int

    @Column(name = "price", nullable = true) //Indica el nombre de la columna en la base de datos y que puede ser nulo
    private float price; //Atributo price de tipo float
    

    public int calculateHours() {
        if (startTime != null && endTime != null) {
            return (int) java.time.Duration.between(startTime, endTime).toHours();
        } else {
            return 0;
        }
    }

    public float calculatePrice() {
        return calculateHours() * pricePerHour;
    }

    public int getHours() {
        this.hours = calculateHours(); // Calcula las horas si aún no han sido calculadas
        return hours;
    }

    public float getPrice() {
        this.price = calculatePrice(); // Calcula el precio si aún no ha sido calculado
        return price;
    }

    public User_Transport(User user, Driver driver, Transport transport, String origin, String destination, float pricePerHour, LocalDateTime startTime, LocalDateTime endTime) { //Constructor
        this.user = user; //Asigna el valor de id_user al atributo user
        this.driver = driver;
        this.transport = transport; //Asigna el valor de id_transport al atributo transport
        this.origin = origin; //Asigna el valor de origin al atributo origin
        this.destination = destination; //Asigna el valor de destination al atributo destination
        this.pricePerHour = pricePerHour;
        this.startTime = startTime;
        this.endTime = endTime;
        this.hours = calculateHours();
        this.price = calculatePrice();
    }

    public User_Transport(String origin, String destination, float pricePerHour, LocalDateTime startTime, LocalDateTime endTime) { //Constructor
        this.origin = origin; //Asigna el valor de origin al atributo origin
        this.destination = destination; //Asigna el valor de destination al atributo destination
        this.pricePerHour = pricePerHour; //Asigna el valor de pricePerHour al atributo pricePerHour
        this.startTime = startTime; //Asigna el valor de startTime al atributo startTime
        this.endTime = endTime; //Asigna el valor de endTime al atributo endTime
        this.hours = calculateHours();
        this.price = calculatePrice();
    }

    public User_Transport(LocalDateTime endTime, LocalDateTime startTime) { //Constructor
        this.endTime = endTime;
        this.startTime = startTime;
        this.hours = calculateHours();
        this.price = calculatePrice();
    }
}
