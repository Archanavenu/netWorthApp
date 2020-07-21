package com.archana.demospringboot16thdec.repository;


import com.archana.demospringboot16thdec.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // we need to pass the entity class in the <> brackets and the primary key is int so its class INTEGER
//
//    User findByUsernameAndPassword(String username, String password);
}
