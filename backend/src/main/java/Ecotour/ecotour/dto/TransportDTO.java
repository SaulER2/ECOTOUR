package Ecotour.ecotour.dto; // Se importa el paquete Ecotour.ecotour.dto

import lombok.AllArgsConstructor; // Se importa la librería lombok para crear un constructor con todos los campos
import lombok.Data; // Se importa la librería lombok para crear Getters y Setters
import lombok.NoArgsConstructor; // Se importa la librería lombok para crear un constructor vacío

@Data // Crea Getters y Setters
@AllArgsConstructor // Crea un constructor con todos los campos
@NoArgsConstructor // Crea un constructor vacío
public class TransportDTO { // Clase TransportDTO

    private long id; // Atributo id de tipo long
    private String name; // Atributo name de tipo String
    private String description; // Atributo description de tipo String
    private boolean active = true; // Atributo activo de tipo boolean

    public TransportDTO(String name, String description) { // Constructor de la clase TransportDTO
        this.name = name; // Asigna el valor de name al atributo name
        this.description = description; // Asigna el valor de description al atributo description
    }

    public TransportDTO(boolean active) { // Constructor de la clase TransportDTO
        this.active = active; // Asigna el valor de active al atributo active
    }
}
