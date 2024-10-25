package Ecotour.ecotour.dto; // Nombre del paquete de la clase actual

import java.time.LocalDateTime;
import lombok.AllArgsConstructor; // Importación de la clase necesaria para el constructor con todos los parámetros
import lombok.Data; // Importación de la clase necesaria para la generación de getters y setters
import lombok.NoArgsConstructor; // Importación de la clase necesaria para el constructor vacío

@Data // Generación de getters y setters
@AllArgsConstructor // Generación de un constructor con todos los parámetros
@NoArgsConstructor // Generación de un constructor vacío
public class User_TransportDTO { // Declaración de la clase pública User_TransportDTO
    private long id; // Declaración de un atributo de tipo long
    private long user; // Declaración de un atributo de tipo long
    private long driver;
    private long transport; // Declaración de un atributo de tipo long
    private String origin; // Declaración de un atributo de tipo String
    private String destination; // Declaración de un atributo de tipo String
    private float pricePerHour;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int hours; // Declaración de un atributo de tipo int
    private float price; // Declaración de un atributo de tipo float

    public User_TransportDTO(long user, long driver, long transport, String origin, String destination, float pricePerHour, LocalDateTime startTime, LocalDateTime endTime) { // Declaración de un constructor con todos los parámetros menos el id
        this.user = user; // Inicialización del atributo id_user
        this.driver = driver;
        this.transport = transport; // Inicialización del atributo id_transport
        this.origin = origin; // Inicialización del atributo origin
        this.destination = destination; // Inicialización del atributo destination
        this.pricePerHour = pricePerHour;
        this.startTime = startTime;
        this.endTime = endTime;
        this.hours = calculateHours();
        this.price = calculatePrice();
    }

    public User_TransportDTO(String origin, String destination, float pricePerHour, int hours, LocalDateTime startTime, LocalDateTime endTime) { // Declaración de un constructor sin ninguno de los atributos de id
        this.origin = origin; // Inicialización del atributo origin
        this.destination = destination; // Inicialización del atributo destination
        this.pricePerHour = pricePerHour; // Inicialización del atributo price
        this.startTime = startTime;
        this.endTime = endTime;
        this.hours = calculateHours();
        this.price = calculatePrice();
    }

    public User_TransportDTO(LocalDateTime endTime, LocalDateTime startTime) {
        this.endTime = endTime;
        this.startTime = startTime;
        this.hours = calculateHours();
        this.price = calculatePrice();
    }

    private int calculateHours() {
        return (startTime != null && endTime != null) ? java.time.Duration.between(startTime, endTime).toHoursPart() : 0;
    }

    private float calculatePrice() {
        return pricePerHour * hours;
    }
}
