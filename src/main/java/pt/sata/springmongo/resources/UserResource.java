package pt.sata.springmongo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.sata.springmongo.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity <List<User>> findall() {
        User joao = new User("1", "João Almeida", "joao@gmail.com");
        User maria = new User("2", "Maria Nascimento", "maria@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(joao, maria));
        return ResponseEntity.ok().body(list);
    }
}
