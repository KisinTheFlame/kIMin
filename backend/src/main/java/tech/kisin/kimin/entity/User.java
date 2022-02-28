package tech.kisin.kimin.entity;

import tech.kisin.kimin.exception.ValidationException;

public class User {
    private Username username;
    private Password password;
    private Salt salt;
    private Token token;

    public static class Username {
        private final String username;

        public Username(String username) {
            if (username == null) throw new ValidationException("Username cannot be null.");
            if (username.equals("")) throw new ValidationException("Username cannot be blank.");
            this.username = username;
        }

        public String getUsername() {
            return username;
        }
    }

    public static class Password {
        public static final Integer LENGTH = 256;

        private final String password;

        public Password(String password) {
            if (password == null) throw new ValidationException("Password cannot be null.");
            if (password.equals("")) throw new ValidationException("Password cannot be blank.");
            if (password.length() != LENGTH) throw new ValidationException("Length of password should be " + LENGTH);
            this.password = password;
        }

        public String getPassword() {
            return password;
        }
    }

    public static class Salt {
        public static final Integer LENGTH = 256;

        private final String salt;

        public Salt(String salt) {
            if (salt == null) throw new ValidationException("Salt cannot be null.");
            if (salt.equals("")) throw new ValidationException("Salt cannot be blank.");
            if (salt.length() != LENGTH) throw new ValidationException("Length of salt should be " + LENGTH);
            this.salt = salt;
        }

        public String getSalt() {
            return salt;
        }
    }

    public static class Token {
        public static final Integer LENGTH = 256;

        private final String token;

        public Token(String token) {
            if (token == null) throw new ValidationException("Token cannot be null.");
            if (token.equals("")) throw new ValidationException("Token cannot be blank.");
            if (token.length() != LENGTH) throw new ValidationException("Length of token should be " + LENGTH);
            this.token = token;
        }

        public String getToken() {
            return token;
        }
    }
}
