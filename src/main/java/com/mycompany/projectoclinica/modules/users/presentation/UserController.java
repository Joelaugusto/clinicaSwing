package com.mycompany.projectoclinica.modules.users.presentation;

import com.mycompany.projectoclinica.modules.users.domain.UserRequest;
import com.mycompany.projectoclinica.modules.users.domain.UserResponse;
import com.mycompany.projectoclinica.modules.users.service.UserService;
import com.mycompany.projectoclinica.modules.users.service.UserServiceImpl;

import java.util.List;

import static com.mycompany.projectoclinica.modules.users.domain.UserMapper.USER_MAPPER;

public class UserController {

    private final UserService service;

    public UserController () {
        service = new UserServiceImpl();
    }

    public List<UserResponse> findAll() {
        return USER_MAPPER.toResponse((service.findAll()));
    }

    public UserResponse findById(Long id) {
        return USER_MAPPER.toResponse((service.findById(id)));
    }

    public UserResponse create(UserRequest request) {
        return USER_MAPPER.toResponse(service.create(request));
    }

    public UserResponse update(Long id, UserRequest request) {
        return USER_MAPPER.toResponse(service.update(id, request));
    }

    public void delete(Long id) {
        service.delete(id);
    }

}
