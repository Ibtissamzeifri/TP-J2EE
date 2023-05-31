package ma.enset.patientmvc.entities;

import java.util.List;

public interface UserInterface {
    Utilisateur saveUser(Utilisateur utilisateur);
    Groupe saveGroup(Groupe groupe);

    void AddUserToGroup(String userName,String groupName);

    Utilisateur findUtilisateurByName(String name);
    Groupe findGroupByName(String name);

    List<Utilisateur> GetAllUser(String name);

}
