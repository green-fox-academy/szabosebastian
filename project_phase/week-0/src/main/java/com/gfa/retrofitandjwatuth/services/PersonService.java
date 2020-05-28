package com.gfa.retrofitandjwatuth.services;

import com.gfa.retrofitandjwatuth.DAO.GetPerson;
import com.gfa.retrofitandjwatuth.DTO.PersonDTO;
import com.gfa.retrofitandjwatuth.repositories.PersonRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class PersonService {

  private PersonRepository personRepository;

  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  public PersonDTO fetch(int id) throws Exception {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    GetPerson getPerson = retrofit.create(GetPerson.class);

    Call<PersonDTO> person = getPerson.getPerson(id);

    Response<PersonDTO> execute = person.execute();

    PersonDTO p = execute.body();

    String temp = p.getAlsoKnownAs().toString().replace("[", "").replace("]", "");
    p.setAlsoKnownAsString(temp);
    if(p.getBiography().length() < 1000){
      p.setBiography(p.getBiography());
    } else {
      p.setBiography(p.getBiography().substring(0, 999));
    }

    personRepository.save(p);

    return p;
  }

  public List<PersonDTO> getFullPersonList() {
    return personRepository.findAllBy();
  }

}
