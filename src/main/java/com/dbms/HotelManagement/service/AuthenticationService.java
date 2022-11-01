package com.dbms.HotelManagement.service;

import com.dbms.HotelManagement.model.User;
import com.dbms.HotelManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@Service
public class AuthenticationService {
    private final UserRepository userRepository;
        private String SESSION_KEY = "USER_SESSION";
//    private final String SESSION_KEY = "USER_SESSION";

    @Autowired
    public AuthenticationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(UUID userID, String fname, String lname, String pEmail, String pswd, String houseNo, String state, String city, String country, String pinCode, String gender) {
        try {
            userRepository.registerUser(userID, fname, lname, pEmail, pswd, houseNo, state, city, country, pinCode, gender);
//            System.out.println(userID + " " + fname + " " + lname + " " + pEmail + " " + pswd + " " + houseNo + " " + state + " " + city + " " + country + " " + pinCode + " " + gender);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Boolean checkUserCredentials(String pEmail, String password) {
        User user = userRepository.getUser(pEmail);
        return user.getPswd().equals(password);
    }

    public User getUserByEmail(String pEmail){
        User user = userRepository.getUser(pEmail);
        return user;
    }
}