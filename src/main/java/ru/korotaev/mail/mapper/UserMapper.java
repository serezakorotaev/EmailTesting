package ru.korotaev.mail.mapper;

import org.mapstruct.Mapper;
import ru.korotaev.mail.model.User;
import ru.korotaev.mail.model.dto.UserDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User convertToUser(UserDto userDto);
    UserDto convertToDto(User user);

    List<User> convertToListUser(List<UserDto> userDtos);
    List<UserDto> convertToListDto(List<User> userList);
}
