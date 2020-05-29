package com.gfa.retrofitandjwatuth.repositories;

import com.gfa.retrofitandjwatuth.DTO.UserDTO;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDTO, Long> {
  UserDTO findByUsername(String username);
  List<UserDTO> findAllBy();
}
