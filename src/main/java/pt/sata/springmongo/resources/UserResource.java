package pt.sata.springmongo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.sata.springmongo.domain.User;
import pt.sata.springmongo.dto.UserDTO;
import pt.sata.springmongo.services.UserService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity <List<UserDTO>> findall() {
        List<User> list = service.fidAll();
        List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity <UserDTO> findById(@PathVariable String id) {
        User obj = service.findById(id);

        return ResponseEntity.ok().body(new UserDTO(obj));
    }
}
