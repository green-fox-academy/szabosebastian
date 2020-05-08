package com.greenfoxacademy.backend_api_exercise;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ServiceAppendaEndPointTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void getACorrectAppendedWord() throws Exception {
    mockMvc.perform(get("/appenda/kuty"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("appended",is("kutya")));
  }

}
