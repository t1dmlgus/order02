package com.t1dmlgus.orderPilot.service.user;

import com.t1dmlgus.orderPilot.domain.user.User;
import lombok.Getter;


@Getter
public class UserInfo {

    private Long id;
    private String username;
    private String email;
    private String grade;

    public UserInfo(User signupUser) {
        id = signupUser.getId();
        username = signupUser.getUsername();
        email = signupUser.getEmail();
        grade = String.valueOf(signupUser.getGrade());
    }
}
