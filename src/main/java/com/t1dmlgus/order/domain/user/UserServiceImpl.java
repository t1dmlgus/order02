package com.t1dmlgus.order.domain.user;


import com.t1dmlgus.order.infrastructure.user.UserRepository;
import com.t1dmlgus.order.presentation.user.UserDto;
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
    public UserDto.signupResponse signup(UserDto.signupRequest request) {

        User user = request.toEntity();
        User signupUser = userRepository.save(user);
        return UserDto.signupResponse.builder()
                .username(signupUser.getUsername())
                .email(signupUser.getEmail())
                .id(signupUser.getId())
                .build();
    }
}
