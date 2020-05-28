package com.gfa.retrofitandjwatuth.repositories;

import com.gfa.retrofitandjwatuth.DTO.PersonDTO;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonDTO, Long> {

  List<PersonDTO> findAllBy();
}
