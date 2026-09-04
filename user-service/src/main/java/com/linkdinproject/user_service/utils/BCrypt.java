package com.linkdinproject.user_service.utils;

import static org.springframework.security.crypto.bcrypt.BCrypt.gensalt;
import static org.springframework.security.crypto.bcrypt.BCrypt.hashpw;

public class BCrypt {
    public static String hash(String s){
        return hashpw(s, gensalt());

    }
    public static boolean match(String passwordText, String passwordHashed){
        return checkpw(passwordText,passwordHashed);
    }
}
