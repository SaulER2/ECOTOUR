package Ecotour.ecotour.dto; // Nombre del paquete de la clase actual

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
    private float price; // Declaración de un atributo de tipo float
    private int hours; // Declaración de un atributo de tipo int

    public User_TransportDTO(long user, long driver, long transport, String origin, String destination, float price, int hours) { // Declaración de un constructor con todos los parámetros menos el id
        this.user = user; // Inicialización del atributo id_user
        this.driver = driver;
        this.transport = transport; // Inicialización del atributo id_transport
        this.origin = origin; // Inicialización del atributo origin
        this.destination = destination; // Inicialización del atributo destination
        this.price = price; // Inicialización del atributo price
        this.hours = hours; // Inicialización del atributo hours
    }

    public User_TransportDTO(String origin, String destination, float price, int hours) { // Declaración de un constructor sin ninguno de los atributos de id
        this.origin = origin; // Inicialización del atributo origin
        this.destination = destination; // Inicialización del atributo destination
        this.price = price; // Inicialización del atributo price
        this.hours = hours; // Inicialización del atributo hours
    }   
}
