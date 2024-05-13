package Ecotour.ecotour;

//import Ecotour.ecotour.modelo.User;
//import Ecotour.ecotour.repository.UserRepository;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcotourApplication /*implements CommandLineRunner*/{
    /*@Autowired
    private UserRepository userRepository;*/
	public static void main(String[] args) {
		SpringApplication.run(EcotourApplication.class, args);
                System.out.println("Hola mundo");
                
	}
//Pasar a Auth
    /*@Override
    public void run(String... args) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        userRepository.save(new User(1,"ESaul2","denisse1","Saul","Espinosa Rios", "saulespinosarios@gmail.com",9981641244L));
        userRepository.save(new User(2,"Nielazo","stem","Daniel Jair","Maria Salas", "nielazo@gmail.com",9981042236L));
        
        System.out.println("Numero de personas en la tabla: " + userRepository.count());
        
        List<User> users = userRepository.findAll();
        users.forEach(u -> System.out.println("Nombre de la persona: " + u.getName()));
    }*/
}