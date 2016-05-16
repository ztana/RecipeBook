/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.recipebook.service;

import edu.mum.cs545.recipebook.domain.UserEntity;
import edu.mum.cs545.recipebook.repository.InMemoryUserRepository;
import edu.mum.cs545.recipebook.repository.UserRepository;

/**
 *
 * @author 984867
 */
public class UserServiceImpl implements UserServiceProvider{
    
    UserRepository userRepository;

    public UserServiceImpl() {
        userRepository = new InMemoryUserRepository();
    }
    
    @Override
    public boolean authenticate(UserEntity user) {
        UserEntity userWithMatchingId = userRepository.findUserByName(user.getUserName());
        if(userWithMatchingId != null)
            return userWithMatchingId.getPassword().equals(user.getPassword());
        return false;
    }
}
