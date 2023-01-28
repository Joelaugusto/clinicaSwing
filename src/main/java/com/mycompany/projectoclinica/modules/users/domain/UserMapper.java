package com.mycompany.projectoclinica.modules.users.domain;

import com.mycompany.projectoclinica.modules.documents.domain.DocumentMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public abstract class UserMapper {

    public static final UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);

    public User toUser(UserRequest request){
        var user = new User();
        user.setLastName(request.lastName());
        user.setFirstName(request.firstName());
        user.setRole(request.role());
        return user;
    }
    public UserResponse toResponse(User user){
        return new UserResponse(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getRole(),
                DocumentMapper.DOCUMENT_MAPPER.toResponse(user.getDocument())
        );
    }
    public void toUser(UserRequest request,@MappingTarget User user){

        if (request.firstName() != null ){
            user.setFirstName(request.firstName());
        }
        if (request.lastName() != null ){
            user.setLastName(request.lastName());
        }
        if (request.role() != null) {
            user.setRole(request.role());
        }
    }

    public List<UserResponse> toResponse(List<User> users) {
        return users.parallelStream().map(this::toResponse).collect(Collectors.toList());
    }

}
