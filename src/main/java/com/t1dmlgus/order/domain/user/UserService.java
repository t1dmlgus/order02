package com.t1dmlgus.order.domain.user;

import com.t1dmlgus.order.presentation.user.UserDto;

public interface UserService {
    UserDto.signupResponse signup(UserDto.signupRequest request);

}
