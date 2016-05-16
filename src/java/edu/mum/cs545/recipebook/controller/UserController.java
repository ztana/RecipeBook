/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.recipebook.controller;

import edu.mum.cs545.recipebook.domain.UserEntity;
import edu.mum.cs545.recipebook.service.UserServiceImpl;
import edu.mum.cs545.recipebook.service.UserServiceProvider;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

@Named("userBean")
//@RequestScoped
@SessionScoped
//@SessionAttributes("user")
public class UserController implements Serializable{

    private UserEntity  user;
    private String tagline ="Welcome to Annapurna Recipe Book";
    
    private UserServiceProvider userServiceProvider = new UserServiceImpl();

    public UserController() {
        this.user = new UserEntity();
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public UserServiceProvider getUserService() {
        return userServiceProvider;
    }

    public void setUserService(UserServiceProvider userServiceProvider) {
        this.userServiceProvider = userServiceProvider;
    }
    
    public String authenticate() {
        if (userServiceProvider.authenticate(user)) {
            return "welcome?faces-redirect=true&amp;id=" + user.getUserName() + "&amp;tag=" + tagline;
        } else {
            throw new IllegalArgumentException("UserId and/or password invalid.");
        }
    }


    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "login";
    }
}

