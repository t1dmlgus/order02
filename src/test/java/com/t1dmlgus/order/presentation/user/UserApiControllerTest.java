package com.t1dmlgus.order.presentation.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.t1dmlgus.order.application.user.UserUseCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
class UserApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserUseCase userUseCase;

    @Autowired
    private ObjectMapper objectMapper;


    @DisplayName("회원가입 테스트")
    @Test
    void signupUser() throws Exception {
        //given
        UserDto.signupRequest signupRequest = UserDto.signupRequest.builder()
                .username("의현")
                .email("dmlgusgngl@gmail.com")
                .password("1234")
                .build();

        String json = objectMapper.writeValueAsString(signupRequest);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json)
                ).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

}