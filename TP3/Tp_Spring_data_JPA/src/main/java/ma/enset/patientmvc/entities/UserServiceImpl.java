package ma.enset.patientmvc.entities;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl  implements  UserInterface{

    @Autowired
    UserRepository userRepository;

    @Autowired
    GroupRepository groupRepository;

    @Override
    public Utilisateur saveUser(Utilisateur utilisateur) {

        return userRepository.save(utilisateur);
    }

    @Override
    public Groupe saveGroup(Groupe groupe) {
        return groupRepository.save(groupe);
    }

    @Transactional
    @Override
    public void AddUserToGroup(String userName, String groupName) {
        Utilisateur user = userRepository.findByUserName(userName);
        Groupe groupe = groupRepository.findByGroupName(groupName);

        groupe.getUtilisateurs().add(user);
    }

    @Override
    public Utilisateur findUtilisateurByName(String name) {
        return userRepository.findByUserName(name);
    }

    @Override
    public Groupe findGroupByName(String name) {
        return groupRepository.findByGroupName(name);
    }

    @Override
    public List<Utilisateur> GetAllUser(String name) {
        return groupRepository.findByGroupName(name).getUtilisateurs();
    }
}
