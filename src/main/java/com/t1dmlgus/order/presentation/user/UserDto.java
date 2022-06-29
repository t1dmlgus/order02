package com.t1dmlgus.order.presentation.user;

import com.t1dmlgus.order.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class UserDto {

    @Getter
    @NoArgsConstructor
    public static class signupRequest{

        private String username;
        private String email;
        private String password;

        @Builder
        public signupRequest(String username, String email, String password) {
            this.username = username;
            this.email = email;
            this.password = password;
        }

        public User toEntity(){
            return User.builder()
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
