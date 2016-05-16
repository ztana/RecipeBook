/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.recipebook.service;

import edu.mum.cs545.recipebook.domain.UserEntity;

/**
 *
 * @author Endalkachew Asnake
 */
public interface UserServiceProvider {
    public boolean authenticate(UserEntity user);
}
