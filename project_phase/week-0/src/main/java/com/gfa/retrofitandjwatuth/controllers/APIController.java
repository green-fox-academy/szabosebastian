package com.gfa.retrofitandjwatuth.controllers;

import com.gfa.retrofitandjwatuth.DAO.PersonDAO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

  private PersonDAO personDAO;

  public APIController(PersonDAO personDAO) {
    this.personDAO = personDAO;
  }

  @GetMapping("/api/person/{id}")
  public ResponseEntity<?> getPersenFromMovieDatabase(@PathVariable("id") int id) throws Exception {
    return ResponseEntity.ok().body(personDAO.fetch(id));
  }
}
