package Ecotour.ecotour.dto;

import lombok.AllArgsConstructor; //importa la librería lombok para crear un constructor con todos los campos
import lombok.Data; //importa la librería lombok para crear Getters y Setters
import lombok.NoArgsConstructor; //importa la librería lombok para crear un constructor vacío

@Data //Crea Getters y Setters
@AllArgsConstructor //Crea un constructor con todos los campos
@NoArgsConstructor //Crea un constructor vacío
public class UserDTO { //Clase UserDTO

    private long id; //Atributo id de tipo long
    private String username; //Atributo username de tipo String
    private String password; //Atributo password de tipo String
    private String name; //Atributo name de tipo String
    private String lastname; //Atributo lastname de tipo String
    private String email; //Atributo email de tipo String
    private long phone; //Atributo phone de tipo long
    private boolean active = true; //Atributo activo de tipo boolean


    public UserDTO(String username, String password, String name, String lastname, String email, long phone) { //Constructor de la clase UserDTO
        this.username = username; //Asigna el valor de username al atributo username
        this.password = password; //Asigna el valor de password al atributo password
        this.name = name; //Asigna el valor de name al atributo name
        this.lastname = lastname; //Asigna el valor de lastname al atributo lastname
        this.email = email; //Asigna el valor de email al atributo email
        this.phone = phone; //Asigna el valor de phone al atributo phone
    }

    public UserDTO(String username, String password, String name, String lastname, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public UserDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserDTO(String email) {
        this.email = email;
    }

    public UserDTO(long phone) {
        this.phone = phone;
    }

    public UserDTO(boolean active) {
        this.active = active;
    }
}
