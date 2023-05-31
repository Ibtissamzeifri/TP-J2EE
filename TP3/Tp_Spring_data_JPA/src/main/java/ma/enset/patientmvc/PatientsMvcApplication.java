package ma.enset.patientmvc;


import ma.enset.patientmvc.entities.Groupe;
import ma.enset.patientmvc.entities.UserServiceImpl;
import ma.enset.patientmvc.entities.Utilisateur;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(PatientsMvcApplication.class,args);

    }

    @Bean
    CommandLineRunner commandLineRunner(
    UserServiceImpl userService
    ) {

        return args -> {

            userService.saveUser(new Utilisateur(null,"ZOUHEIR",null));
            userService.saveUser(new Utilisateur(null,"YOUSSEF",null));
            userService.saveGroup(new Groupe(null,"casa",null));
            userService.AddUserToGroup("ZOUHEIR","casa");
            Utilisateur user = userService.findUtilisateurByName("ZOUHEIR");
            user.getGroupes().forEach(x->{
                System.out.println(x.getGroupName());
            });
        };
    }
}


