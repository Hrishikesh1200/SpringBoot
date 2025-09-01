package com.example.securityApplication.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Security {

    @Bean
    public UserDetailsService UserDetailsService(){
        UserDetails user = User.withDefaultPasswordEncoder()
        .username("user1").password("pass@123").roles("USER").build();

        return new InMemoryUserDetailsManager(user);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // disable for Postman testing
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/orders/**").authenticated()
                        .requestMatchers("/customers/**").authenticated()
                        .requestMatchers("/products/**").authenticated()
                        .anyRequest().permitAll()
                )
                .httpBasic(); // enable Basic Auth

        return http.build();
    }

}
