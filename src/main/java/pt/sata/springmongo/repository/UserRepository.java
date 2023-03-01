package pt.sata.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pt.sata.springmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
