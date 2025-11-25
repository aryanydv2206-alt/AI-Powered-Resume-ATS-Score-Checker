
package com.example.app.dao;

import com.example.app.model.User;
import java.util.Optional;

public interface UserDao {
    Optional<User> findByUsername(String username) throws Exception;
    void create(User user) throws Exception;
    // add update/delete/list methods as needed
}
