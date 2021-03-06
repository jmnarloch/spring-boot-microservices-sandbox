package com.sample.web.config;

import org.springframework.cloud.security.oauth2.sso.OAuth2SsoConfigurerAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 *
 */
@Configuration
public class SecurityConfig extends OAuth2SsoConfigurerAdapter {

    @Override
    public void match(RequestMatchers matchers) {

        matchers.anyRequest();
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http
            .csrf()
                .disable()
            .authorizeRequests()
            .antMatchers("/")
                .permitAll()
            .anyRequest()
                .authenticated();
    }
}
