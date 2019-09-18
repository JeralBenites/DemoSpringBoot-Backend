package pe.com.dev420.spring.boot.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class AppEncrypt {

    public AppEncrypt() {
    }

    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("abc"));
    }

}
