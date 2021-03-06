package org.softuni.exam.service;

import org.softuni.exam.domain.models.services.UserServiceModel;

import java.util.List;
import java.util.Optional;

public interface UserService {
	
	boolean register(UserServiceModel userServiceModel);
	
	
	Optional<UserServiceModel> loginUser(UserServiceModel userServiceModel);
	
	List<UserServiceModel> getAllUsers();
	
	Optional<UserServiceModel> getUserByUsername(String username);
	
	Optional<UserServiceModel> createUser(UserServiceModel userServiceModel);
	
	Optional<UserServiceModel> getUserById(String id);
	
	boolean updateUser(UserServiceModel user);
}
