package com.t1dmlgus.orderPilot.service.user;

import com.t1dmlgus.orderPilot.domain.user.User;
import lombok.Builder;
import lombok.Getter;

@Getter
public class UserCommand {

    private String username;
    private String password;
    private String email;

    @Builder
    public UserCommand(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User toEntity(){
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .build();
    }
}
