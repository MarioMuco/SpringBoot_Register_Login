package net.enjoy.springboot.registrationlogin.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;

@Component
public class CustomAuthenticationSuccessHandler  implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
                       AccessDeniedException accessDeniedException) throws IOException {
        String redirectUrl = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/profile")
                //TODO: fix
                .toUriString();
        response.sendRedirect(redirectUrl);
    }
}
