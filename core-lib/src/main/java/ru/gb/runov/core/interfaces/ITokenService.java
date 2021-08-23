package ru.gb,runov.core.interfaces;

import ru.gb.runov.core.models.UserInfo;

public interface ITokenService {

    String generateToken(UserInfo user);

    UserInfo parseToken(String token);
}
