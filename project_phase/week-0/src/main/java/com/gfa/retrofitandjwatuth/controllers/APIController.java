package com.gfa.retrofitandjwatuth.controllers;

import com.gfa.retrofitandjwatuth.models.AuthenticationRequest;
import com.gfa.retrofitandjwatuth.models.AuthenticationResponse;
import com.gfa.retrofitandjwatuth.services.MyUserDetailsService;
import com.gfa.retrofitandjwatuth.services.PersonService;
import com.gfa.retrofitandjwatuth.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

  @Autowired
  private JwtUtil jwtTokenUtil;

  @Autowired
  private MyUserDetailsService userDetailsService;

  @Autowired
  private AuthenticationManager authenticationManager;

  private PersonService personService;

  public APIController(PersonService personDAO) {
    this.personService = personDAO;
  }

  @GetMapping("/api/person/{id}")
  public ResponseEntity<?> getPersonFromMovieDatabase(@PathVariable("id") int id) throws Exception {
    return ResponseEntity.ok().body(personService.fetch(id));
  }

  @GetMapping("/api/database")
  public ResponseEntity<?> fullDatabaseList() {
    return ResponseEntity.ok().body(personService.getFullPersonList());
  }

  @PostMapping("/auth")
  public ResponseEntity<?> createAuthToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
    try {
      authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
    } catch (BadCredentialsException e) {
      throw new Exception("Incorrect username or password", e);
    }
    final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());

    final String jwt = jwtTokenUtil.generateToken(userDetails);

    return ResponseEntity.ok(new AuthenticationResponse(jwt));
  }

}
