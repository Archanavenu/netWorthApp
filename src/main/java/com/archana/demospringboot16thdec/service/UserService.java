package com.archana.demospringboot16thdec.service;
// this is where we need write business logic which persists the data to our database

import com.archana.demospringboot16thdec.model.User;
import com.archana.demospringboot16thdec.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional // we are performing a transaction with the db
public class UserService {

private final UserRepository userRepository;

public UserService(UserRepository userRepository){
    this.userRepository= userRepository;

}
    public User CreateUser(User user){ // we are passing the User class and the variable user is the instance of the class and we are// using to save user
        return userRepository.save(user);
    }

    public List<User> showAllUsers(){
        List<User> users = new ArrayList<User>();
        for(User user : userRepository.findAll()) {
            users.add(user);
        }
        return users;
    }



    public User updateUser(int userid){
      return userRepository.save(updateUser(userid));

    }

//    public User findById(int userid){
//        return userRepository.findById(userid).get();
//
//    }

    public void deleteUserById(int userid){
     userRepository.deleteById(userid);
    }

    public  User findByUserNameAndPassword(String username, String password){
     return userRepository.findByUsernameAndPassword(username,password);
    }




}
