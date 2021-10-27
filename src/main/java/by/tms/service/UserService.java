package by.tms.service;

import by.tms.entity.User;

import java.util.Collection;

public interface UserService {
    Collection<User> findAll();

    void createUser(String id, String name, String username);

    void updateName(String id, String name, String username);

    void updatePassword(String password);

    void deleteUser(String id, String name, String username);

    void historyOperations();


}
