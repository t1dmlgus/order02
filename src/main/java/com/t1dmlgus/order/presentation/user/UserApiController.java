package com.t1dmlgus.order.presentation.user;


import com.t1dmlgus.order.application.user.UserUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
@RestController
public class UserApiController {

    private final UserUseCase userUseCase;

    @PostMapping("")
    public ResponseEntity<UserDto.signupResponse> signup(@RequestBody UserDto.signupRequest request){

        UserDto.signupResponse signup = userUseCase.signup(request);
        return new ResponseEntity<>(signup, HttpStatus.OK);
    }

}
