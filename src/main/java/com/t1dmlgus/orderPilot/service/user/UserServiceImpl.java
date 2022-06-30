package com.t1dmlgus.orderPilot.service.user;


import com.t1dmlgus.orderPilot.domain.user.User;
import com.t1dmlgus.orderPilot.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    @Transactional
    @Override
    public UserInfo signup(UserCommand userCommand) {

        User user = userCommand.toEntity();
        User signupUser = userRepository.save(user);
        return new UserInfo(signupUser);
    }
}
