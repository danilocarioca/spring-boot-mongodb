package pt.sata.springmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.sata.springmongo.domain.User;
import pt.sata.springmongo.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> fidAll() {
        return repo.findAll();
    }
}
