package com.gfa.retrofitandjwatuth.services;

import com.gfa.retrofitandjwatuth.DTO.UserDTO;
import com.gfa.retrofitandjwatuth.models.User;
import com.gfa.retrofitandjwatuth.repositories.UserRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PasswordEncoder bcryptEncoder;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    UserDTO user = userRepository.findByUsername(username);
    if (user == null) {
      throw new UsernameNotFoundException("User not found with username: " + username);
    }
    return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
        new ArrayList<>());
  }

  public UserDTO save(User user) {
    UserDTO newUser = new UserDTO();
    newUser.setUsername(user.getUsername());
    newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
    return userRepository.save(newUser);
  }
}
