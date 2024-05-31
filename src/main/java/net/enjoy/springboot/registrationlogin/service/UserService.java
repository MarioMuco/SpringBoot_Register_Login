package net.enjoy.springboot.registrationlogin.service;

import net.enjoy.springboot.registrationlogin.dto.UserDto;
import net.enjoy.springboot.registrationlogin.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

    UserDto findUserById(Long id);

    void updateUser(Long id, UserDto userDto);

    void deleteUser(Long userId);

    void deleteUserById(Long id);
}