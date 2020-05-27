package com.gfa.retrofitandjwatuth.DAO;

import com.gfa.retrofitandjwatuth.DTO.PersonDTO;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class PersonDAO {

  public PersonDTO fetch(int id) throws Exception {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    GetPerson getPerson = retrofit.create(GetPerson.class);

    Call<PersonDTO> person = getPerson.getPerson(id);

    Response<PersonDTO> execute = person.execute();

    PersonDTO p = execute.body();

    return p;
  }

}
