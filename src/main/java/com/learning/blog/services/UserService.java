package com.learning.blog.services;

import java.util.List;

import com.learning.blog.payloads.UserDto;
import com.learning.blog.payloads.UserRequestDto;

public interface UserService {
	UserDto registerNewUser(UserDto user);
	UserDto createUser(UserRequestDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
	UserDto registerNewUser(UserRequestDto userDto);
	
}
