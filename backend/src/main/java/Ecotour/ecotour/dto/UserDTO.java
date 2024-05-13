package Ecotour.ecotour.dto;

public class UserDTO {

    private long id;
    private String username;
    private String password;
    private String name;
    private String lastname;
    private String email;
    private long phone;

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public UserDTO(long id, String username, String password, String name, String lastname, String email, long phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
    }

    public UserDTO(String username, String password, String name, String lastname, String email, long phone) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
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

    public UserDTO() {
    }
    
}
