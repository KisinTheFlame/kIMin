package tech.kisin.kimin.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.kisin.kimin.dto.Result;
import tech.kisin.kimin.dto.UserCredentialDTO;
import tech.kisin.kimin.service.UserService;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/login")
    public Result<Boolean> login(@RequestBody UserCredentialDTO userCredentialDTO) {
        // todo
        throw new UnsupportedOperationException();
    }

    @PostMapping("/user/register")
    public Result<Boolean> register(@RequestBody UserCredentialDTO userCredentialDTO) {
        // todo
        throw new UnsupportedOperationException();
    }

    @PostMapping("/user/check-token-validity")
    public Result<Boolean> checkTokenValidity(@RequestBody String token) {
        // todo
        throw new UnsupportedOperationException();
    }
}
