package pt.sata.springmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.sata.springmongo.domain.Post;
import pt.sata.springmongo.domain.User;
import pt.sata.springmongo.dto.UserDTO;
import pt.sata.springmongo.repository.PostRepository;
import pt.sata.springmongo.repository.UserRepository;
import pt.sata.springmongo.services.exception.ObjectNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }

}
