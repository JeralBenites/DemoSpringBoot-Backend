package pe.com.dev420.spring.boot.security;

public class Constants {

    public static final String LOGIN_URL = "/login";
    public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";

    public static final String ISSUER_INFO = "www.dev420.com";
    public static final String SUPER_SECRET_KEY = "123";
    public static final long TOKEN_EXPIRATION_TIME = 86_400_000; // 1 day

}
