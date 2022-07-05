package com.t1dmlgus.orderPilot.service.user;


public interface UserService {
    UserInfo signup(UserCommand userCommand);
    UserInfo getUser(Long userId);

}
