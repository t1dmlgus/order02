package com.t1dmlgus.orderPilot.presentation.user;

import com.t1dmlgus.orderPilot.service.user.UserCommand;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserDto {

    @Getter
    @NoArgsConstructor
    public static class signupRequest{


        @NotBlank(message = "username 은 필수값입니다.")
        private String username;

        @Email(message = "email 형식에 맞아야한다.")
        @NotBlank(message = "email 은 필수값입니다.")
        private String email;

        @NotBlank(message = "password 는 필수값입니다.")
        private String password;

        @Builder
        public signupRequest(String username, String email, String password) {
            this.username = username;
            this.email = email;
            this.password = password;
        }

        public UserCommand toCommand(){
            return UserCommand.builder()
                    .username(username)
                    .email(email)
                    .password(password)
                    .build();
        }
    }

    @Builder
    @Getter
    public static class signupResponse{

        private Long id;
        private String username;
        private String email;
    }

}
