package ru.korotaev.mail.controller;

import org.springframework.web.bind.annotation.*;
import ru.korotaev.mail.mapper.UserMapper;
import ru.korotaev.mail.model.dto.UserDto;
import ru.korotaev.mail.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;
    private final UserMapper mapper;

    public UserController(UserService service , UserMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping()
    public List<UserDto> allUsers() {
        return mapper.convertToListDto(service.findAll());
    }

    @PostMapping("/save")
    public String saveUser(@RequestBody UserDto userDto) {
        service.save(mapper.convertToUser(userDto));
        return "on your email sent letter";
    }
}
