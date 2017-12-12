package hello;

import org.springframework.data.repository.CrudRepository;

import hello.User;

// this replaces UserDB

public interface UserRepository extends CrudRepository<User, Long> {

}
