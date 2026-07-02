package br.edu.ifce.mn.ads.ifproject._commons;

import java.util.UUID;

public interface UserLogged {

    ScopedValue<String> USER_ID = ScopedValue.newInstance();

    static boolean isValid() {
        return USER_ID.isBound() && USER_ID.get() != null;

    }

    static UUID id() {
        if (!UserLogged.isValid()) {
            throw new RuntimeException("Usuário não autenticado");
        }
        return UUID.fromString(USER_ID.get());
    }
}
