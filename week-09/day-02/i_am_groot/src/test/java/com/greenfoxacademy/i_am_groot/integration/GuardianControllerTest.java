package com.greenfoxacademy.i_am_groot.integration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.CoreMatchers.is;



@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void iAmGrootCorrectTranslateTest() throws Exception {
    mockMvc.perform(get("/groot?message=somemessage"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("received",is("somemessage")))
        .andExpect(jsonPath("translated",is("I am Groot!")));
  }

  @Test
  public void iAmGrootNOTCorrectTranslateTest() throws Exception {
    mockMvc.perform(get("/groot?message="))
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("error",is("I am Groot!")));
  }

  @Test
  public void correctArrowStatics() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("distance",is(100.0)))
        .andExpect(jsonPath("time",is(10.0)))
        .andExpect(jsonPath("speed",is(10.0)));
  }

  @Test
  public void notCorrectArrowStatics() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time="))
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("error",is("Paramater required!")));
  }

  @Test
  public void shipStatusMissingParamater() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=0"))
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("error",is("Paramater required!")));
  }


}
