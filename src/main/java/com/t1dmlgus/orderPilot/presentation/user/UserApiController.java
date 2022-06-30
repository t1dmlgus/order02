package com.t1dmlgus.orderPilot.presentation.user;


import com.t1dmlgus.orderPilot.service.user.UserInfo;
import com.t1dmlgus.orderPilot.service.user.UserService;
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

    private final UserService userService;

    @PostMapping("")
    public ResponseEntity<UserInfo> signup(@RequestBody UserDto.signupRequest request){

        UserInfo signup = userService.signup(request.toCommand());
        return new ResponseEntity<>(signup, HttpStatus.OK);
    }

}
