package com.t1dmlgus.order.application.user;

import com.t1dmlgus.order.domain.notification.NotifacationService;
import com.t1dmlgus.order.domain.user.UserService;
import com.t1dmlgus.order.presentation.user.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@RequiredArgsConstructor
@Service
public class UserUseCase {
    private final UserService userService;
    private final NotifacationService notifacationService;
    public UserDto.signupResponse signup(UserDto.signupRequest request) {

        // 1. user signup
        // 2. send email
        UserDto.signupResponse signup = userService.signup(request);
        notifacationService.sendEmail(signup.getEmail(), "제목", "가입내용");
        return signup;
    }
}
