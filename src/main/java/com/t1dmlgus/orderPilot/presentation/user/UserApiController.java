package com.t1dmlgus.orderPilot.presentation.user;

import com.t1dmlgus.orderPilot.service.user.UserInfo;
import com.t1dmlgus.orderPilot.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
@RestController
public class UserApiController {

    private final UserService userService;

    @PostMapping("")
    public ResponseEntity<?> signup(@RequestBody @Valid UserDto.signupRequest request){
        UserInfo signup = userService.signup(request.toCommand());
        return ResponseEntity.ok(signup);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserInfo> getUser(@PathVariable Long userId){

        UserInfo userInfo = userService.getUser(userId);
        return ResponseEntity.ok(userInfo);
    }

}
