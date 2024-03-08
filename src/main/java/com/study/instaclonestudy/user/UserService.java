package com.study.instaclonestudy.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
