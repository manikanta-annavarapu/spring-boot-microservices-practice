package com.practice.userManagementSystem.repository;

import com.practice.userManagementSystem.dto.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private List<User> userList = new ArrayList<>();

    public UserRepository() {
        this.userList.add(new User(1,"mani","machilipatnam"));
        this.userList.add(new User(2,"murali","hyderabad"));
        this.userList.add(new User(3,"mausam","kolkata"));
        this.userList.add(new User(4,"mahesh","solapur"));
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public User getUser(int id) {
        Optional<User> first = userList.stream()
                .filter(u -> u.getId() == id).findFirst();

        if(first.isPresent()){
            return first.get();
        } else {
            return new User();
        }
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public User updateUser(User user) {
        for(User u: userList){
            if(u.getId() == user.getId()){
                u.setName(user.getName());
                u.setAddress(user.getAddress());
                return u;
            }
        }
        return new User();
    }

    public User deleteUser(int id) {
        Optional<User> first = userList.stream()
                .filter(u -> u.getId() == id).findFirst();

        if(first.isPresent()){
            User user = first.get();
            userList.remove(user);
            return user;
        } else {
            return new User();
        }

    }
}
