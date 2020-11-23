package healthcare.services;

import healthcare.dto.LoginDTO;
import healthcare.entities.Login;
import healthcare.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public List<Login> allUsers() {
        return loginRepository.findAll();
    }

    public Login findUserDetailsById(Long id) {
        Optional<Login> login = loginRepository.findById(id);
        return login.get();
    }

    public Login findUserByUsername(String username) {
        Optional<Login> login = loginRepository.findUserByUsername(username);
        return login.get();
    }

    public Login createNewLogin(LoginDTO loginDTO) {
        Login login = new Login();
        login.setUsername(loginDTO.getUsername());
        login.setPassword(loginDTO.getPassword());
        return loginRepository.save(login);
    }

    public Login updateUserDetails(Long id, LoginDTO loginDTO) {
        Login login = findUserDetailsById(id);
        login.setPassword(loginDTO.getPassword());
        login.setUsername(loginDTO.getUsername());
        return loginRepository.save(login);
    }

    public void deleteUser(Long id) {
        loginRepository.delete(findUserDetailsById(id));
    }
}
