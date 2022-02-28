package tech.kisin.kimin.service;

import tech.kisin.kimin.dto.UserCredentialDTO;

public interface UserService {
    Boolean login(UserCredentialDTO userCredentialDTO);
}
