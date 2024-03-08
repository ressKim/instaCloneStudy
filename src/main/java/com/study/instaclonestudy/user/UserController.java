package com.study.instaclonestudy.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;


    @PostMapping("/join")
    public void userJoin(@RequestBody UserEntity userEntity) {
        userService.createUser(userEntity);
    }


}
