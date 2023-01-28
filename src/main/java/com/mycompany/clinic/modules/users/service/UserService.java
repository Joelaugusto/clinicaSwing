package com.mycompany.clinic.modules.users.service;

import com.mycompany.clinic.modules.users.domain.User;
import com.mycompany.clinic.modules.users.domain.UserRequest;

import java.util.List;

public interface UserService {

    User findById(Long id);

    User create(UserRequest request);

    User update(Long id, UserRequest request);

    void delete(Long id);

    List<User> findAll();
}
